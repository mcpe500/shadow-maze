package shadowmaze2.utils;

import processing.data.JSONObject;
import java.io.File;
import processing.core.PApplet;

public class ReadMap {

    private int[][] map;

    public static void main(String[] args) {
        ReadMap app = new ReadMap("./src/assets/map.json");
    }

    public ReadMap(String filename) {
        JSONObject json = read(filename);
        String strMap = json.getString("map");
        System.out.println(strMap);
        map = parseMap(strMap);
    }

    public JSONObject read(String filename) {
        File file = new File(filename);
        JSONObject json = PApplet.loadJSONObject(file);
        return json;
    }

    public int[][] parseMap(String strMap) {
        String[] rows = strMap.split("\\],\\[");
        int rowCount = rows.length;
        int columnCount = rows[0].split(",").length;

        int[][] map = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            String[] elements = rows[i].replaceAll("\\[|\\]", "").split(",");
            for (int j = 0; j < columnCount; j++) {
                map[i][j] = Integer.parseInt(elements[j].trim());
            }
        }

        return map;
    }

    public int[][] getMap() {
        return map;
    }

}
