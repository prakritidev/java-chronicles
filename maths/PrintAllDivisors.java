/**
 * Example 1:
Input: n = 36
Output: 1 2 3 4 6 9 12 18 36
Explanation: All the divisors of 36 are printed.

Example 2:
Input: n = 97
Output: 1 97
Explanation: Since 97 is a prime number, only 1 and 97 are printed.
 */
public class PrintAllDivisors {
    public static void main(String[] args) {
        PrintAllDivisors printAllDivisors = new PrintAllDivisors();
       printAllDivisors.getStatus(36);
    }

    public void getStatus(Integer n){
        System.out.println("The divisors of "+n+" are:");
		for(int i = 1; i <= (int)Math.sqrt(n); i++)
			{
                System.err.println(i);
                if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}}
			
		System.out.println();
        
    }
}
