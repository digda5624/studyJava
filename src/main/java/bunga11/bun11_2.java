package bunga11;

import java.util.HashMap;
import java.util.Map;

public class bun11_2 {

    int cup;

    // 현재 물 수에 대해 컵 고르기
    public int water(){
        int temp = cup;
        cup = cup - 1;
        return temp;
    }

    public static void main(String[] args) {
        int N = 1000000;
        int K = 1000000000;
        bun11_2 sol = new bun11_2();
        sol.cup = N;
        int i = 0;
        for(; K > 0; i ++){
            int c = sol.water();
            if(c < 0){
                System.out.println("실패 -1");
                return;
            }
            K = K - c;
        }
        System.out.println("i = " + i);
    }

}
