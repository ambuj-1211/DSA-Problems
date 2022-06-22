import java.util.*;
import java.lang.*;
import java.io.*;
public class bishop
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int [][] mat = new int[8][8];
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    mat[i][j]=sc.nextInt();

                }

            }
            Map<Integer,Vector<Integer>> mp = new HashMap<>();
            for(int i=0;i<8;i++){
                Vector<Integer> v = new Vector<>();
                for(int j=0;j<8;j++){
                   if(mat[i][j]=='#'){
                    mp.getOrDefault(i,v ).add(j);
                    mp.put(i,mp.get(i));
                   }
                }
                v.clear();
            }
            Vector<Integer> equals=new Vector<>();
            for(int i:mp.keySet()){
                if(mp.get(i).equals(v)){

                }
            }
        }
    }
}