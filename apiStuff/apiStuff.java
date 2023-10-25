package apiStuff;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class apiStuff 
{
    public static void main(String[] args)
    {
        try
        {
            String apiUrl = "https://httpie.io/hello";
            URL url = new URL(apiUrl);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK)
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Process the response data in 'response.toString()'
                System.out.println("Response: " + response.toString());
            } 
            else 
            {
                // Handle the error response
                System.err.println("Error: " + responseCode);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
