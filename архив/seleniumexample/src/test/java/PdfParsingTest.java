import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent;
import org.apache.pdfbox.text.PDFMarkedContentExtractor;
import org.apache.pdfbox.text.TextPosition;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by Александр on 09.03.2018.
 */
public class PdfParsingTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        //Селениуму нужно указать exe-шник хрома, чтобы его запускать.
        //Можно установить хром и поискать его (где то в системных папках юзера)
        //Еще можно просто скачать и положить в проект
        System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testLocalFile() throws IOException, InterruptedException {
        String filename = "Титульный лист.pdf";
        File target = new File("./res/" + filename);
        Assert.assertTrue(target.exists());
        PDDocument document = PDDocument.load(target);
        test(document);
    }

    @Test
    public void testDisplayedFileNoSave() throws IOException {
        InputStream inputStream = retrieve("http://localhost:80/Титульный%20лист.pdf");
        PDDocument document = PDDocument.load(inputStream);
        test(document);
    }

    @Test
    public void testDisplayedFileWithTempSave() throws IOException {
        String filename = "Титульный лист.pdf";
        File target = new File(filename);
        InputStream inputStream = retrieve("http://localhost:80/Титульный%20лист.pdf");
        saveToFile(inputStream, target);
        PDDocument document = PDDocument.load(target);
        test(document);
        target.deleteOnExit();
    }

    @Test
    public void downloadPdf() throws IOException {
        driver.get("http://localhost:80/always_download/Титульный%20лист.pdf");
        String filename = "Титульный лист.pdf";
        File target = new File(System.getProperty("user.home") + "/Downloads/" + filename);
        Assert.assertTrue(target.exists());
        PDDocument document = PDDocument.load(target);
        PdfParsingTest.test(document);
        target.deleteOnExit();
    }

    public static InputStream retrieve(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        Assert.assertEquals(200, connection.getResponseCode());
        return connection.getInputStream();
    }

    private void saveToFile(InputStream inputStream, File target) throws IOException {
        byte[] buffer = new byte[inputStream.available()];
        int bytesRead;
        OutputStream outputStream = new FileOutputStream(target.getAbsoluteFile());
        System.out.println(target.getAbsoluteFile());

        bytesRead = inputStream.read(buffer);
        while(bytesRead != -1){
            outputStream.write(buffer);
            bytesRead = inputStream.read(buffer);
        }
        outputStream.close();
        inputStream.close();
    }

    public static void test(PDDocument document) throws IOException {
        PDFMarkedContentExtractor extractor = new PDFMarkedContentExtractor();
        Assert.assertFalse(document.isEncrypted());
        extractor.processPage(document.getPage(document.getNumberOfPages() - 1));
        List<PDMarkedContent> content = extractor.getMarkedContents();

        Assert.assertEquals("Выполнил: Иванов И.И.", textFromMark(content, 4));
        Assert.assertEquals("по дисциплине «Тестирование программных продуктов»", textFromMark(content, 3));
        Assert.assertEquals("гр. АБВ-123,", textFromMark(content, 5));
        Assert.assertEquals("Проверил: Петров П.П.", textFromMark(content, 6));
    }

    private static String textFromMark(List<PDMarkedContent> content, int index) {
        StringBuilder sb = new StringBuilder();
        for (Object item : content.get(index).getContents()) {
            TextPosition i = (TextPosition) item;
            sb.append(i.getUnicode());
        }
        return sb.toString().trim();
    }
}
