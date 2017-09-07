import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import task7248.Data;
import task7248.Pair;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author akryukov
 *         07.09.2017
 */
public class Task7248 {
    public static int MIN = 1;
    public static int MAX = 10000;
    public static int AMOUNT_RESULTATIVE = 150;
    public static int AMOUNT_ERROR = 100;
    public static Random random = new Random();

    public static int randBetween(int a, int b){
        return random.nextInt(b - a) + a;
    }

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClients.createDefault();
            Data data = new Data();
            int amount = 0;
            amount += AMOUNT_ERROR;
            while(data.pairs.size() < amount){
                int nextB1 = randBetween(MIN, MAX/4);
                int nextA1 = randBetween(nextB1, MAX/2);
                int nextA2 = randBetween(MIN, MAX/4*3);
                int nextB2 = randBetween(nextA2, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            amount += AMOUNT_ERROR;
            while(data.pairs.size() < amount){
                int nextA1 = randBetween(MIN, MAX/4);
                int nextB1 = randBetween(nextA1, MAX/2);
                int nextB2 = randBetween(MIN, MAX/4*3);
                int nextA2 = randBetween(nextB2, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            amount += AMOUNT_RESULTATIVE;
            while(data.pairs.size() < amount){
                int nextA1 = randBetween(MIN, MAX/4);
                int nextA2 = randBetween(nextA1+1, MAX/2);
                int nextB1 = randBetween(nextA2+1, MAX/4*3);
                int nextB2 = randBetween(nextB1+1, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            amount += AMOUNT_RESULTATIVE;
            while(data.pairs.size() < amount){
                int nextA1 = randBetween(MIN, MAX/4);
                int nextA2 = randBetween(nextA1+1, MAX/2);
                int nextB2 = randBetween(nextA2+1, MAX/4*3);
                int nextB1 = randBetween(nextB2+1, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            amount += AMOUNT_RESULTATIVE;
            while(data.pairs.size() < amount){
                int nextA2 = randBetween(MIN, MAX/4);
                int nextA1 = randBetween(nextA2+1, MAX/2);
                int nextB1 = randBetween(nextA1+1, MAX/4*3);
                int nextB2 = randBetween(nextB1+1, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            amount += AMOUNT_RESULTATIVE;
            while(data.pairs.size() < amount){
                int nextA2 = randBetween(MIN, MAX/4);
                int nextA1 = randBetween(nextA2+1, MAX/2);
                int nextB2 = randBetween(nextA1+1, MAX/4*3);
                int nextB1 = randBetween(nextB2+1, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            amount += AMOUNT_RESULTATIVE;
            while(data.pairs.size() < amount){
                int nextA1 = randBetween(MIN, MAX/4);
                int nextB1 = randBetween(nextA1+1, MAX/2);
                int nextA2 = randBetween(nextB1+1, MAX/4*3);
                int nextB2 = randBetween(nextA2+1, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            amount += AMOUNT_RESULTATIVE;
            while(data.pairs.size() < amount){
                int nextA2 = randBetween(MIN, MAX/4);
                int nextB2 = randBetween(nextA2+1, MAX/2);
                int nextA1 = randBetween(nextB2+1, MAX/4*3);
                int nextB1 = randBetween(nextA1+1, MAX);
                data.pairs.add(new Pair(nextA1, nextB1, nextA2, nextB2));
            }

            Gson gson = new Gson();
            String json = gson.toJson(data);
            StringEntity entity = new StringEntity(json);
            HttpPost post = new HttpPost("http://localhost:8080/handler7248.php");
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
