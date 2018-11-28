import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(final String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("fst", "zaec");
        hashmap.put("scnd", "wolk");
        hashmap.put("thrd", "zaic");
        Set<String> keySet = hashmap.keySet();
        Collection collection = hashmap.values();


    }
}
