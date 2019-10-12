package retrieve;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Retriever {

    public Retriever () {

    }

    public void getData() {
        String access_token = "WMsaB7cCCfUxjr9CYJmSJ3DArhDbvWv1CtGg9psTStcJpRxNid4B8PHn2KZqpG9TKe6i4koOsHh21MByy484N6TXy3uWImLai3zbWOptpX2dOEE6j3uwbMVXDfjS__SiMunZ1WSETRso_LNkazpFocgw6Q_ztk2A03ahJergtKftt7nPHd6zzGoAg8eTur7e3OmoawJQ6sqz6RhZk2Reou-J_49o-oqlmz7OMB68OVzZmiYJdMp6tIpHyzCE_CJjWSmGKsw4iryDQBQHlDBsJ8llG-iBj2RQRqFZsb8qzj5KBcg9glxiW58XXb3_DglJuAkJEw";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("example")).build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
