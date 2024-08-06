package greedystuff;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Item
 */
class Item {
  double weight;
  double value;

  // Constructor
  public Item(double weight, double value) {
    this.weight = weight;
    this.value = value;
  }
}

/**
 * FractionalKnapsack
 */

public class FractionalKnapsack {

  public static void main(String[] args) {
    int n = 5;
    int capacity = 50;
    Item[] items = { 
      new Item(10, 60), 
      new Item(20, 100), 
      new Item(30, 120) 
  };
  
  double maxValue = fractionalKnapsack(capacity, items);
  System.out.println("Maximum value we can obtain = " + maxValue);

  }

  private static double fractionalKnapsack(int capacity, Item[] items) {

    Arrays.sort(items, new Comparator<Item>() {
      @Override
      public int compare(Item o1, Item o2) {
        double r1 = o1.value / o2.weight;
        double r2 = o2.value / o2.weight;
        return Double.compare(r1, r2);
      }

    });
    double totalValue = 0.0;
    for (Item item : items) {
      int curWt = (int) item.weight;
      int curVal = (int) item.value;
      if (capacity - curWt >= 0) {
        capacity -= curWt;
        totalValue += curVal;
      } else {
        double fraction = ((double) capacity / (double) curWt);
        totalValue += (curVal * fraction);
        capacity = (int) (capacity - (curWt * fraction));
        break;
      }
    }
    return totalValue;
  }

}
