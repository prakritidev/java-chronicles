package recrusion;

public class PrintSerialNumber {
    public static void main(String[] args) {
        int n = 4;
        func(1, 4);
    }

    static void func(int i, int n){
        if(i > n) return;
        System.out.println(i);

        func(i+1, 4);
    }
}
