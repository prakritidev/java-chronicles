
import java.util.*;

public class CollectionsPractice {
  @SuppressWarnings("rawtypes")
  public static void main(String[] args) {

    System.out.println("ArraList Example");
    ArrayList<String> list = new ArrayList<>();
    list.add("duck");
    list.add("juck");
    list.add("quck");
    list.add("tuck");
    Iterator itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    System.out.println("LinkedList Example");
    List<String> linkedList = new LinkedList<String>();
    linkedList.add("duck");
    linkedList.add("juck");
    linkedList.add("quck");
    linkedList.add("tuck");
    Iterator itr2 = linkedList.iterator();
    while (itr2.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
