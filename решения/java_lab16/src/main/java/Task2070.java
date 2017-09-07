import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * @author akryukov
 *         06.09.2017
 */
public class Task2070 {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClients.createDefault();
            StringBuilder sb = new StringBuilder();
            for (int i = 1000; i < 2000; i++){
                sb.append(i);
                if (i < 1999) {
                    sb.append(";");
                }
            }
            StringEntity entity = new StringEntity(sb.toString());
            HttpPost post = new HttpPost("http://localhost:8080/handler2070.php");
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
            HttpEntity answer = response.getEntity();
            if (answer != null){
                Scanner scanner = new Scanner(answer.getContent());
                while(scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
