import java.util.*;

public class hashmaps {
    public static void main(String[] args){
        HashMap<String,String> capitalsCities=new HashMap<>();
        capitalsCities.put("Uttar Pradesh","lucknow");
        capitalsCities.put("Gujrat","ahemdabad");
        capitalsCities.put("Punjab","chandigarh");
        for(String i:capitalsCities.keySet()){
            System.out.println(i);
        }
    }
}
