import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import task8718.Data;
import task8718.Entry;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author akryukov
 *         06.09.2017
 */
public class Task8718 {
    public static int MIN = 1;
    public static int MAX = 10000;
    public static int AMOUNT_RESULTATIVE = 200;
    public static int AMOUNT_ERROR = 50;
    public static Random random = new Random();

    public static int randBetween(int a, int b){
        return random.nextInt(b - a) + a;
    }

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClients.createDefault();
            Data data = new Data();
            for (int i = 0; i < AMOUNT_RESULTATIVE; i++){
                int nextC = randBetween(MIN, MAX);
                int nextD = randBetween(MIN, MAX);
                int nextA = randBetween(MIN, nextC-1);
                int nextB = randBetween(MIN, nextD-1);
                data.possible.add(new Entry(nextA, nextB, nextC, nextD));
            }
            for (int i = 0; i < AMOUNT_RESULTATIVE; i++){
                int nextC = randBetween(MIN, MAX/2);
                int nextD = randBetween(MIN, MAX/2);
                int nextA = randBetween(nextC+1, MAX);
                int nextB = randBetween(MIN, nextD-1);
                data.impossible.add(new Entry(nextA, nextB, nextC, nextD));
            }
            for (int i = 0; i < AMOUNT_ERROR; i++){
                int nextA = randBetween(-MAX, MIN);
                int nextB = randBetween(MIN, MAX);
                int nextC = randBetween(MIN, MAX);
                int nextD = randBetween(MIN, MAX);
                data.error_group_a.add(new Entry(nextA, nextB, nextC, nextD));
            }
            for (int i = 0; i < AMOUNT_ERROR; i++){
                int nextA = randBetween(MIN, MAX);
                int nextB = randBetween(-MAX, MIN);
                int nextC = randBetween(MIN, MAX);
                int nextD = randBetween(MIN, MAX);
                data.error_group_b.add(new Entry(nextA, nextB, nextC, nextD));
            }
            for (int i = 0; i < AMOUNT_ERROR; i++){
                int nextA = randBetween(MIN, MAX);
                int nextB = randBetween(MIN, MAX);
                int nextC = randBetween(-MAX, MIN);
                int nextD = randBetween(MIN, MAX);
                data.error_group_c.add(new Entry(nextA, nextB, nextC, nextD));
            }
            for (int i = 0; i < AMOUNT_ERROR; i++){
                int nextA = randBetween(MIN, MAX);
                int nextB = randBetween(MIN, MAX);
                int nextC = randBetween(MIN, MAX);
                int nextD = randBetween(-MAX, MIN);
                data.error_group_d.add(new Entry(nextA, nextB, nextC, nextD));
            }

            Gson gson = new Gson();
            String json = gson.toJson(data);
            StringEntity entity = new StringEntity(json);
            HttpPost post = new HttpPost("http://localhost:8080/handler8718.php");
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
