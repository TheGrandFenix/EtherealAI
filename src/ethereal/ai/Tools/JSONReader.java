package ethereal.ai.Tools;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONReader {

    public JSONObject getJSON(String path){

        JSONParser JSON_parser = new JSONParser();
        File JSONFile = new File(path);
        JSONObject jsonObject = new JSONObject();

        try {

            Object obj = JSON_parser.parse(new FileReader(JSONFile));

            jsonObject = (JSONObject) obj;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    public void saveJSON(JSONObject object, String path){

        File JSONFile = new File(path);

        try (FileWriter file = new FileWriter(JSONFile)) {
            file.write(object.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
