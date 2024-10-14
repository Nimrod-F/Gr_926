package model.adt;

import exceptions.KeyNotFoundException;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;

public class MyDictionary <K, V> implements MyIDictionary<K, V> {
    Map<K, V> map;

    public MyDictionary() {
        map = new HashMap<K, V>();
    }

    @Override
    public void insert(K key, V value) {
        this.map.put(key, value);
    }

    @Override
    public void remove(K key) throws KeyNotFoundException{
        if(this.map.containsKey(key))
            this.map.remove(key);
        else
            throw new KeyNotFoundException("Key not found");
    }

    @Override
    public boolean contains(K key) {
        return this.map.containsKey(key);
    }

    @Override
    public V get(K key) throws KeyNotFoundException {
        if(this.map.containsKey(key))
            return this.map.get(key);
        else
            throw new KeyNotFoundException("Key not found");
    }

    public String toSting() {
        StringBuilder st = new StringBuilder();
        this.map.forEach((k,v)->{
            st.append(k).append(" -> ").append(v).append("\n");
        });
        return "Dictionary contains: " + st.toString();

    }
}
