/**
 * Question: 
 * 
 * Example 1:
Input:153 
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

Input:170 
Output: No, it is not an Armstrong Number
Explanation: 1^3 + 7^3 + 0^3 != 170
 * 
 * 
 */
public class ArmstrongNumber{
  public static void main(String[] args) {
    ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    System.out.println(armstrongNumber.verifyArmstrongNumber(153));

  }

  public boolean verifyArmstrongNumber(Integer number){
    Integer originalNumber = number;
    Integer processedNumber = 0;
    while(number != 0 ){
      int temp = number % 10;
      processedNumber += (int) Math.pow(temp, 3);
      System.err.println(processedNumber);
      number /=10;
    }
    return originalNumber.equals(processedNumber);
  }
}
