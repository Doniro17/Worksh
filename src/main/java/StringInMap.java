import java.util.HashMap;
import java.util.List;

public class StringInMap {

    public HashMap stringToMap(List<String> stringList) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String aList : stringList) {
            hashMap.put(aList.substring(0, 1), aList.substring(aList.length() - 1));
        }
        return hashMap;
    }

}
