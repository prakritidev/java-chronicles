import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountDigit{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    System.out.printf("Input is :%s", name);
    System.out.printf("Count on input number is: %d", name.length());
  }
}
