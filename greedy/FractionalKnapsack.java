package greedy;

import java.util.Arrays;

/**
 * Item
 */
class Item {
  int value, weight;
  Item(int value, int weight) {
    this.value = value;
    this.weight = weight;
  }
}

/**
 * FractionalKnapsack
 */

public class FractionalKnapsack {

  public static void main(String[] args) {
    int n = 5;
    int weight = 50;
    Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30)};
    double ans = fractionalKnapsack(weight, arr, n);
    System.out.println("The maximum value is "+ans);


  }

  private static double fractionalKnapsack(int weight, Item[] arr, int n) {
    Arrays.sort(arr);
    
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'fractionalKnapsack'");
  }

}
