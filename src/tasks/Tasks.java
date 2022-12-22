package tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Tasks {
    HashMap<String, Integer> str = new HashMap<>();

    public void addNumber(String s, Integer i) {
        if (str.containsKey(s) && str.containsValue(i)) {
            throw new RuntimeException(str + "Ключ есть и значения совпадают");
        } else if (str.containsKey(s) && !str.containsValue(i)) {
            str.replace(s, i);
        } else {
            str.put(s, i);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(str);
    }

    public static Integer sumNums(List<Integer> list) {
        Integer sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }
}
