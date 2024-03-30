package Map;

import java.util.ArrayList;

public class MyMap<K, V> {
    private ArrayList<K> keysArray;
    private ArrayList<V> valuesArray;

    public MyMap() {
        keysArray = new ArrayList<>();
        valuesArray = new ArrayList<>();
    }

    public void put(K key, V value) {
        if(keysArray.contains(key)) {
            int index = keysArray.indexOf(key);
            valuesArray.set(index, value);
        } else {
            keysArray.add(key);
            valuesArray.add(value);
        }
    }

    public V get(K key) {
        V ret;
        if(keysArray.contains(key)) {
            int index = keysArray.indexOf(key);
            ret = valuesArray.get(index);
        } else {
            ret = null;
        }
        return ret;
    }

    public V remove(K key) {
        V ret;
        if(keysArray.contains(key)) {
            int index = keysArray.indexOf(key);
            ret = valuesArray.get(index);
            keysArray.remove(index);
            valuesArray.remove(index);
        } else {
            ret = null;
        }
        return ret;
    }

    // Checking function

    public void print() {
        if(keysArray.size() == 0) {
            System.out.print("Map is empty.");
            return;
        }
        for(int i = 0; i < keysArray.size(); i++){
            System.out.print("{" + keysArray.get(i) + ", ");
            System.out.print(valuesArray.get(i) + "}\n");
        }
    }
}
