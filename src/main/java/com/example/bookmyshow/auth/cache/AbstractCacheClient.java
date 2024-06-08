package com.example.bookmyshow.auth.cache;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractCacheClient<K, V> {

    private final Map<K, V> tokenMap = new ConcurrentHashMap<>();

    public V put(K key, V value) {
        tokenMap.put(key, value);
        return value;
    }

    public V get(String key) {
        return tokenMap.get(key);
    }

    public void remove(String... keys) {
        for (String key : keys) {
            tokenMap.remove(key);
        }
    }
}

