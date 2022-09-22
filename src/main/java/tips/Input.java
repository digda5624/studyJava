package tips;

import java.io.*;
import java.util.StringTokenizer;

public class Input {

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 받기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 숫자 일경우
        Integer.parseInt(br.readLine());

        /**
         * 3
         * 1 5
         * 3 10 11 12
         * 5 1 2 3 4 5
         * 의 입력의 경우
         */
        for(int i = 0; i < 4; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());

            for(int j = 0; j < s; j++){
                int data = Integer.parseInt(st.nextToken());
                System.out.println("data = " + data);
            }
        }
    }

}
