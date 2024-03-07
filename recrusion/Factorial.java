package recrusion;

public class Factorial {
    public static void main(String[] args) {
        Integer integer = 6;
        System.out.println(func(integer));

    }


    static int func(Integer integer){
        if(integer <= 1) return 1;
        return integer * func(integer-1);
    }
}
