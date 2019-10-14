package retrieve;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GET_access_token extends Retriever{

    private static String public_key = "1BD0BB66-A8B3-47BD-B4CC-0161DFB00FE3";
    private static String private_key = "8B37A9EA-5E70-424A-94BE-4007E245BFB2";


    public String get_token() throws IOException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.tcgplayer.com/token"))
                .setHeader("Accept", "application/json")
                .setHeader("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("grant_type=client_credentials&client_id="+public_key+"&client_secret="+private_key))
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(formatter.format_json_string(response.body()));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
