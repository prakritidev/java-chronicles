import java.io.*;

public class ReverseNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    String data = input.readLine();

    Integer integer = Integer.valueOf(data);
     
    while (integer > 0) {
      int f  = integer % 10;
      System.out.println(f);
      integer = integer / 10;
    }

  }
}
