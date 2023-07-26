package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        //
        Map<Integer, Set<String>> result = new HashMap<>();

        if (sourceMap.size() > 0) {

            for (Map.Entry<String, Integer> item : sourceMap.entrySet()) {
                int length = item.getKey().length();
                Set<String> value = new HashSet<>();
                if (result.containsKey(length)) {
                    Set<String> strings = result.get(length);
                    strings.add(item.getKey());
                } else {
                    value.add(item.getKey());
                    result.put(length, value);
                }
            }
        }
        return result;
    }
}
