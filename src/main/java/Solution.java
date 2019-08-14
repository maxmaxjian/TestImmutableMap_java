import com.google.common.collect.ImmutableMap;

public class Solution {
    public static void main(String[] args) {
        ImmutableMap<Integer, String> map = new ImmutableMap.Builder<Integer, String>()
                .put(1, "one")
                .put(2, "two")
                .build();
        for (Integer key : map.keySet()) {
            System.out.println(key+": "+map.get(key));
        }
        int k = 3;
        System.out.println(k+": "+map.get(k));
    }
}
