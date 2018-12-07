import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Swap class, contains method that swaps strings
 */
class Swap {
    /**
     * method that swaps "matching" strings
     *
     * @param list input list for swap
     * @return return statement
     */
    List doSwap(final List<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Input list is empty");
        }
        List<String> swapList = new ArrayList<>(list);
        List<Character> twiceCheck = new ArrayList<>();
        String tempString;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {

            if ((!list.get(i).isEmpty()) &&
                    (map.containsKey(list.get(i).charAt(0)))) {
                if (map.get(list.get(i).charAt(0)) != -1) {
                    tempString = list.get(i);
                    swapList.set(i, list.get(map.get(list.get(i).charAt(0))));
                    swapList.set(map.get(list.get(i).charAt(0)), tempString);
                    map.put(list.get(i).charAt(0), -1);
                }
            } else {
                map.put(list.get(i).charAt(0), i);
            }
        }
        return swapList;
    }

}
