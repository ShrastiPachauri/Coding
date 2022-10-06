class TimeMap {

    HashMap<String, TreeMap<Integer, String>> tm;

/** Initialize your data structure here. */
public TimeMap() {
    tm = new HashMap<>();
}

public void set(String key, String value, int timestamp) {
    if (!tm.containsKey(key)) {
        tm.put(key, new TreeMap<Integer, String>());
    }
    tm.get(key).put(timestamp, value);
}

public String get(String key, int timestamp) {
    if (!tm.containsKey(key)) {
        return "";
    }
    TreeMap<Integer, String> tree = tm.get(key);
    Integer t = tree.floorKey(timestamp);
    if (t == null) {
        return "";
    }
    return tree.get(t);
}
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */