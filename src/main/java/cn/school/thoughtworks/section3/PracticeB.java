package cn.school.thoughtworks.section3;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        HashSet<String> c2ElementSet = new HashSet<>(object.get("value"));
        for(String key: collectionA.keySet()){
            if(c2ElementSet.contains(key)){
                int count = collectionA.get(key);
                collectionA.put(key, count - count / 3);
            }
        }

        return collectionA;
    }
}
