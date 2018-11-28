import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArrayCheck {

    public List<Set> SetsContainsSet(List<Set> intList, Set<Integer> array) {
        List<Set> checkedList = new ArrayList<>();

        for (Set aSet : intList) {
            for (int i = 0; i < array.size(); i++) {
                if (aSet.contains(array.toArray()[i])) {
                    checkedList.add(aSet);
                    break;
                }
                i = 0;
            }
        }
        return checkedList;
    }
}
