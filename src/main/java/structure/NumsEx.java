package structure;

public class NumsEx {

    private int intNum;
    private Integer integerNum;
    private double doubleNum;
    private Double doubleWrapperNum;

    public static void main(String[] args) {
        NumsEx numsEx = new NumsEx();
        numsEx.integerNum = 10;
        numsEx.intNum = 20;
        numsEx.doubleNum = 10.0;
        numsEx.doubleWrapperNum = 10.0;

        // system.out.println 은 인자값 하나만 올 수 있다.
        System.out.println(numsEx.integerNum);
        System.out.println(numsEx.doubleNum);
        System.out.println(numsEx.intNum);
        System.out.println(numsEx.doubleWrapperNum);
    }


}
