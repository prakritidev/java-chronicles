import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarrayWithXORk {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 2, 2, 6, 4);
        int k = 6;
        int response = subarraysWithXorK(input, k);
        System.out.println(response);
    }

    private static int subarraysWithXorK(List<Integer> input, int k) {
        int n = input.size();
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(xr, 1);

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ input.get(i);
            int x = xr ^ k;

            if(map.containsKey(x)){
                cnt += map.get(x);
            }

            if(map.containsKey(xr)){
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }

        }
        return cnt;
    }
}
