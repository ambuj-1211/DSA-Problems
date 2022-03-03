import java.util.*;
import java.io.*;
class plprocess {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int n;
        Vector<Integer> v = new Vector<>();

        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                v.add(sc.nextInt());
            }
            if (v.size() > 1) {
                Collections.sort(v);
                int i = -1, j = v.size();
                int s1 = 0, s2 = 0;
                while (i != j-1) {

                    if (s1 < s2 ) {
                        i++;
                        s1=s1+v.get(i);
                    } else if (s2 < s1 ) {
                        j--;
                        s2=s2+v.get(j);
                    } else if (s1 == s2 ) {
                        if(s1+v.get(i+1)<s2+v.get(j)&&(i+1)<j)
                        {i++;
                            s1 = s1 + v.get(i);}
                            else if(s2+v.get(j-1)<s1+v.get(i)&&(i)<(j-1)){
                                j--;
                                s2=s2+ v.get(j);
                            }
                    }
                }
                if (s1 >= s2)
                    System.out.println(s1);
                else if (s2 > s1)
                    System.out.println(s2);

            } 
            else if (v.size() == 1)
                System.out.println(v.get(0));
            v.clear();
        }

    }
}
