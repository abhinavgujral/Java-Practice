package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplicate {

    public static List<String> removeDuplicates(List<String> ls){
        HashSet<String> set = new HashSet<>(ls);
        return set.stream().toList();
    }

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("ab");
        ls.add("bc");
        ls.add("cd");
        ls.add("ab");



        removeDuplicates(ls);

    }
}
