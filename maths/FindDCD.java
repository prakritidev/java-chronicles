public class FindDCD {
    public static void main(String[] args) {
        Integer number1 = 3;
        Integer number2 = 13;

        System.out.println("The GCD is: " +  findMyGcd(number1, number2));
    } 


/**
* Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it is should be divided by (a-b) and b as well.
*/
    public static int findMyGcd(Integer number1, Integer number2) {
      if (number2 == 0) return number1;
      return findMyGcd(number1, number1%number2);
    }

}
