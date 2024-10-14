package model.adt;

import exceptions.KeyNotFoundException;

public interface MyIDictionary<K, V> {
    void insert(K key, V value);
    void remove(K key) throws KeyNotFoundException;
    boolean contains(K key);
    public V get(K key) throws KeyNotFoundException;
}
