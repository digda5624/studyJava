package structure;

import java.util.Objects;

public class BooleanEx {

    Boolean bool;
    boolean b;

    @Override
    public int hashCode() {
        return Objects.hash(bool, b);
    }

    public static void main(String[] args) {
        BooleanEx booleanEx = new BooleanEx();
        booleanEx.b = true;
        booleanEx.bool = true;

        System.out.println("booleanEx.b = " + booleanEx.b);
        System.out.println("booleanEx.bool = " + booleanEx.bool);
        if(booleanEx.b){
            System.out.println("booleanEx = " + booleanEx);
        }
        if (booleanEx.bool){
            System.out.println("booleanEx = " + booleanEx);
        }

    }
}
