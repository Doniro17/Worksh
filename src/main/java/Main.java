import java.util.*;

public class Main {


    public static void main(final String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("fst", "zaec");
        hashmap.put("scnd", "wolk");
        hashmap.put("thrd", "zaic");
        Set<String> keySet = hashmap.keySet();
        Collection collection = hashmap.values();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(4);

        List<Set> list = new ArrayList<>();
        list.add(set1);
        list.add(set2);

        Set<Integer> set3 = new HashSet<>();
        set3.add(3);
        set3.add(4);

        ArrayCheck mappap = new ArrayCheck();
        System.out.println(mappap.setsContainsSet(list, set3));

    }
}
