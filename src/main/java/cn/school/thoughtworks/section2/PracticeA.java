package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> countMap = new HashMap<>();
        for (String str: collection1){
            Integer count = countMap.get(str);
            if(count == null){
                countMap.put(str, 1);
                continue;
            }

            countMap.put(str, count + 1);
        }
        return countMap;
    }
}
