package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //统计collectionA中元素的出现次数
        Map<String, Integer> countMap = new HashMap<>();
        for (String str: collectionA){
            int add = 1;
            if(str.indexOf('-') >= 0){
                add = Integer.parseInt(str.split("-")[1]);
                str = str.split("-")[0];
            }
            Integer count = countMap.get(str);
            if(count == null){
                countMap.put(str, add);
                continue;
            }
            countMap.put(str, count + add);
        }
        //查找相同的元素，满3减1
        HashSet<String> c2ElementSet = new HashSet<>(object.get("value"));
        for(String key: countMap.keySet()){
            if(c2ElementSet.contains(key)){
                int count = countMap.get(key);
                countMap.put(key, count - count / 3);
            }
        }

        return countMap;
    }
}
