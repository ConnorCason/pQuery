package tools;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Gson_Formatter {

    public Gson_Formatter() {
        //TODO
    }

    public String format_json_string(String s) {
        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(s).getAsJsonObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(json);
        return prettyJson;
    }
}
