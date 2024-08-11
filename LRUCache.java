import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


class LRUCache {
  public static void main(String[] args) {
    List<List<Integer, Integer>> queue = new LinkedList<>();
    // 
    Map<Integer, Integer> cache = new HashMap<>();

    int capacity = 10;
    //test 
    LRUCache lruCache = new LRUCache();

    lruCache.put(0, cache, queue);
    lruCache.put(0, cache, queue);
    lruCache.put(0, cache, queue);
    lruCache.put(0, cache, queue);
    lruCache.put(0, cache, queue);

  }

  public  void put(Integer element, Map<Integer, Integer> cache, List<Integer> queue) {
    if(queue.size() > 10) {
      delete();
    }
    cache.put(element, 0);
    queue.add(element);
  }

  public Integer get(Integer element,  Map<Integer, Integer> cache) {
    Integer value = cache.get(element);    
  }

  public  void delete() {

  }

}
