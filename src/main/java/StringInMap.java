import java.util.HashMap;
import java.util.List;

public class StringInMap {

    public HashMap stringToMap(List<String> stringList) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (String aList : stringList) {
            hashMap.put(aList.charAt(0), aList.charAt(aList.length()-1));
        }
        return hashMap;
    }

}
