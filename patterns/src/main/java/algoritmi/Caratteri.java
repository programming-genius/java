package algoritmi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Caratteri {
    public static void main(String[] arg) {

        HashMap<Character, Integer> result = occorrenze2("abbcadabeddcbcb");
        for(Character elem: result.keySet()){
            System.out.println(elem+":"+result.get(elem));
        }

    }

    public static HashMap<Character, Integer> occorrenze2(String caratteri){
        HashMap<Character, Integer> result = new HashMap<>();
        char[] chars = caratteri.toCharArray();
        for(char c: chars){
            if(result.containsKey(c)){
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }

    public static HashMap<Character, Integer> occorrenze(String caratteri){
        HashMap<Character, Integer> result = new HashMap<>();
        List<Character> processed = new ArrayList<>();
        char[] chars = caratteri.toCharArray();
        for(char c: chars){
            for(char d: chars){
                if(!processed.contains(c) && c==d){
                    if(result.containsKey(c)){
                        result.put(c, result.get(c) + 1);
                    } else {
                        result.put(c, 1);
                    }
                }
            }
            processed.add(c);
        }
        return result;
    }
}
