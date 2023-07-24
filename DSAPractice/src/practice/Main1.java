package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);


     List l1=   map.entrySet().stream().filter(entry->entry.getValue()%2==0).collect(Collectors.toList());

        System.out.println(l1);

        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List evenv=list.stream().filter(num->num%2==0).collect(Collectors.toList());





    }
}
