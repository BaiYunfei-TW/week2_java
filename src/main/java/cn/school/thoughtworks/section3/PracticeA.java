package cn.school.thoughtworks.section3;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        HashSet<String> c2ElementSet = new HashSet<>(object.get("value"));
        for(String key: collectionA.keySet()){
            if(c2ElementSet.contains(key)){
                collectionA.put(key, collectionA.get(key) - 1);
            }
        }

        return collectionA;
    }
}
