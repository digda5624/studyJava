package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class pocketMon {

    public int solution(int[] nums) {
        // 리듀싱 연산이란? 스트림의 모든 요소를 반복적으로 처리
        // Collector 인터페이스 구현은 스트림 요소를 어떤 식으로 도출할지 지정한다.
        // 스트림에 collect를 호출하면 컬렉터가 스트림의 요소에 리듀싱 연산을 수행하여 필요한 데이터 구조로 간단하게 도출
        // 컬렉션 프레임워크란?
        // 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
//        Arrays.stream(nums).collect(Collectors.toSet());
        int answer = 0;
        return answer;
    }

}
