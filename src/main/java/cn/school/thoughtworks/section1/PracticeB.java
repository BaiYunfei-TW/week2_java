package cn.school.thoughtworks.section1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new LinkedList<>();

        HashSet<String> c2ElementSet = new HashSet<>();
        for(List<String> childList: collection2){
            c2ElementSet.addAll(childList);
        }
        for(String str: collection1){
            if(c2ElementSet.contains(str)){
                result.add(str);
            }
        }
        return result;
    }
}
