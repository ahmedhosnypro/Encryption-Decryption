import java.util.*;


class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        // write your code here
        int cnt = 0;
        for (var entry1 : map1.entrySet()) {
            for (var entry2 : map2.entrySet()) {
                if (Objects.equals(entry1, entry2))
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}