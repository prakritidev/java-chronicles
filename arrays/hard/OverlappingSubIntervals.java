import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OverlappingSubIntervals {
    public static void main(String[] args) {
        List<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1, 3)));
        input.add(new ArrayList<>(List.of(2, 6)));
        input.add(new ArrayList<>(List.of(8, 10)));
        input.add(new ArrayList<>(List.of(15, 18)));

        System.out.println(getMerged(input));
    }

    public static List<ArrayList<Integer>> getMerged(List<ArrayList<Integer>> input) {
        Collections.sort(input, Comparator.comparingInt(list -> list.get(0)));
        // Collections.sort(input, (a, b) -> a.get(0) - b.get(0));
        List<ArrayList<Integer>> response = new ArrayList<>();

        for (ArrayList<Integer> arrayList : input) {
            if (response.isEmpty() || arrayList.get(0) > response.get(response.size() - 1).get(1)) {
                response.add(arrayList);
            } else {
                response.get(response.size() - 1).set(1, Math.max(response.get(response.size() - 1).get(1), arrayList.get(1)));
            }
        }

        return response;
    }
}
