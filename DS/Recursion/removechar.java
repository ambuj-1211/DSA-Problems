import java.util.*;
import java.lang.*;
import java.io.*;
public class removechar
{
    public static void main (String[] args) throws java.lang.Exception
    {
       
       System.out.println(skip("aaabtyhsddfaasdfssaasdasdsa"));
    }

    static void skip(String p, String up){//p is for present and up is for updated
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
            
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p+"",up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        } 
    }
    static String skip(String u){
        if(u.isEmpty())
        return "";
        char ch = u.charAt(0);
        if(ch=='a'){
            return "" +skip(u.substring(1));
        }
        return ch+skip(u.substring(1));
    }
}