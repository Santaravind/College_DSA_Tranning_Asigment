package Assigment.Seventh_Assignment_25_jun_28_June;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;




public class Q88_Iterate_HashMap_using_EntrySet {
    public static  void main(String[] args) {
        HashMap<String, Integer>map=new HashMap<>();
        map.put("sant",85000);
        map.put("singh",85000);
        map.put("syam",75000);
        map.put("Aravind",85000);


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }


    }
}
