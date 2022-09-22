package programmers;

import java.util.*;

public class Wanju {

    String[] participant;
    String[] completion;

    public String solution(String[] participant, String[] completion){

        HashMap<String, Integer> map = new HashMap<>();
        for(String p: participant){
            // HashMap.getOrDefault('', 0)
            if(map.containsKey(p)){
                // java 에서 해시를 변경하기 위해서는 map.put(key, map.get(key) + 1 을 사용한다.
                map.put(p, map.get(p) + 1);
            }
            else {
                map.put(p, 1);
            }
        }

        for (String c : completion){
            map.put(c, map.get(c) - 1);
        }

        // Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        String answer = null;
//
//        while(iterator.hasNext()){
//            Map.Entry<String, Integer> next = iterator.next();
//            if(next.getValue() != 0){
//                answer = next.getKey();
//            }
//        }
        String answer = null;
        Set<String> strings = map.keySet();
        for(String s : strings){
            if(map.get(s) != 0){
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
