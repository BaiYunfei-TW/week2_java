package cn.school.thoughtworks.section1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new LinkedList<>();

        HashSet<String> c2ElementSet = new HashSet<>(collection2.get("value"));
        for(String str: collection1){
            if(c2ElementSet.contains(str)){
                result.add(str);
            }
        }
        return result;
    }
}
