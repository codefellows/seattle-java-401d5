import java.net.URL;
import java.net.HttpURLConnection;
import java.io.*;

public class ApiFun {
    public static void main(String[] args) {

        try {
            // https://www.baeldung.com/java-http-request
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/ditto");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            System.out.println(connection.getResponseCode());

            // synchronous: java is going to be working on running line 15 for a while
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
