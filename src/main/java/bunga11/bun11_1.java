package bunga11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class bun11_1 {

    public static void main(String[] args) {
        int[] A = {16, 16};

        Map<Integer, Integer> map = new HashMap<>();

        for(int a : A){
            for(int i = 0; a > 0; i ++){
                if(a % 2 == 1){
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
                a = a / 2;
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: entries){
            int temp = entry.getValue();
            if(temp > max)
                max = temp;
        }
        System.out.println("max = " + max);
    }
}
