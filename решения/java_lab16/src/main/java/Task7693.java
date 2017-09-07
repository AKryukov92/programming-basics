import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import task7693.Data;
import task7693.Entry;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * @author akryukov
 *         06.09.2017
 */
public class Task7693 {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClients.createDefault();
            Data data = new Data(1000);
            for (int i = 0; i < 1000; i++){
                data.add(new Entry(i, 1000 - i));
            }
            Gson gson = new Gson();
            String json = gson.toJson(data);
            StringEntity entity = new StringEntity(json);
            HttpPost post = new HttpPost("http://localhost:8080/handler7693.php");
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
