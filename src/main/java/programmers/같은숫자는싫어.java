package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 같은숫자는싫어 {

    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int temp = 10;
        for(int num: arr){
            if(temp != num) {
                list.add(num);
                temp = num;
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
        // 하지만 list 순회하면서 값을 직접 넣어주는 것이 속도가 훨씬 빠르다.
//        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
