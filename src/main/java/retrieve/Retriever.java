package retrieve;

import tools.Gson_Formatter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Retriever {

    HttpClient client;
    String access_token;
    Gson_Formatter formatter;


    public Retriever () {
        client = HttpClient.newHttpClient();
        access_token = "SyeU-mLO0aRS-xOQZR3lqxn1K15wGKWnRzq9vslhVDywaCbmWZlQnUgHFGJNX18sQOTKm3mP6zU61zUZTclT6mWBkhqsv2n5jvjsMnYiIvqX3Vmi_I-Bn0zJqg5AC-gY5xWUmbElCVG8SK2Et0qAXcEH-9znjE-lgT_iQGys5h0OcBdsLspyug-Z5uukHdCCE6Ualut51_1jL2evZKujtOnV0JggP4ndF7jLdLjr_xNdB4uEVZs3msw2Xxdwvayta52aypRSKQsn22k2h_r15oUrUBom8XIV8UGh5m1XhbCFkRYhkQz40s2YU9UkXJ11q82J2Q";
        formatter = new Gson_Formatter();
    }

    public void getData() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://api.tcgplayer.com/v1.36.0/inventory/productLists"))
                .setHeader("Accept", "application/json")
                .setHeader("Authorization", "bearer " + access_token)
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String pretty_response = formatter.format_json_string(response.body());
            System.out.println(pretty_response);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
