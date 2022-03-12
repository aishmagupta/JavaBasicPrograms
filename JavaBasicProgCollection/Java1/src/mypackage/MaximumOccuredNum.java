package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumOccuredNum {

    public static void commonElementsInStringAndPrintMaximumOccuredCharacterAskedInGTENTechnologies(String string){
        char[] c = string.replace(" ","").toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();
        Map<Integer,Character> map = new HashMap<>();
        int count =1;
        for (int i =0; i<c.length;i++){
            if (!list.contains(c[i])){
                list.add(c[i]);
                for(int j=i+1;j<c.length;j++){
                    if (c[i] == c[j]){
                        count++;
                    }
                }
                map.put(count,c[i]);
                System.out.println(c[i]+" repeating "+count+" times");
                count =1;
            }
        }
        int maxvalue =0;
        for (Map.Entry<Integer,Character> entry:map.entrySet()){
            if(entry.getKey()>maxvalue){
                maxvalue = entry.getKey();
            }
        }
        System.out.println("*****************************************************");
        System.out.println(map.get(maxvalue)+" is repeated max no. of times"+" i.e, "+maxvalue);
    }
}
