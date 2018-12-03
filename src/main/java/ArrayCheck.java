import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArrayCheck {

    public List<Set> setsContainsSet(List<Set> intList, Set<Integer> array) {
        List<Set> checkedList = new ArrayList<>();
        boolean contains = false;
        for (Set aSet : intList) {
            for (int i = 0; i < array.size(); i++) {
                if (aSet.contains(array.toArray()[i])) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                checkedList.add(aSet);
            }
            contains = false;

        }
        return checkedList;
    }
}
