package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String str: collection1){
            int count = 1;
            String key = str;
            if(str.contains(":")){
                key = str.substring(0, str.indexOf(':'));
                count = Integer.parseInt(str.split(":")[1]);
            }
            if(str.contains("-")){
                key = str.substring(0, str.indexOf('-'));
                count = Integer.parseInt(str.split("-")[1]);
            }
            if(str.contains("[")){
                key = str.substring(0, str.indexOf('['));
                String countStr = str.substring(str.indexOf('[')+1, str.length() - 1);
                count = Integer.parseInt(countStr);
            }

            Integer oldCount = countMap.get(key);
            if(oldCount == null){
                countMap.put(key, count);
                continue;
            }
            countMap.put(key, oldCount + count);
        }
        return countMap;
    }
}
