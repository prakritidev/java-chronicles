package recrusion;

public class Fibonacci {

    static int a = 0, b = 0;

    public static void main(String[] args) {

        System.out.println(fib(0));

    }

    public static int fib(Integer integer) {

        if (integer <= 1) return integer;
        
        a = fib(integer - 1);
        b = fib(integer - 2);
        return a + b;
    }

}
