package structure.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("test1", 1);
        map.put("test2", 1);
        map.put("test3", 1);

        System.out.println(map.get("test1"));
        System.out.println(map.get("test"));

    }

    public static void mapMethod(){
        Map<String, Integer> map = new HashMap<>();

        map.put("test1", 1);
        map.put("test2", 1);
        map.put("test3", 1);

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("==========");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}

