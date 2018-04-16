package cn.school.thoughtworks.section1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new LinkedList<>();

        HashSet<String> existSet = new HashSet<>(collection2);  //记录collection2中的元素
        for (String s : collection1) {  //遍历collection1
            if (existSet.contains(s)){  //如果在collection2中有，则加到结果计中
                result.add(s);
            }
        }
        return result;
    }
}
