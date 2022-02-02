import java.util.*;
public class maxinstack {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of queries");
        n=sc.nextInt();
        sc.nextLine();
        List<String> ops=new ArrayList<>();
        System.out.println("Enter the operations u want to perform");
        for(int i=0;i<n;i++){
            ops.add(sc.nextLine());
        }
        List<Integer> result=maxfunc(ops);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }


    static List<Integer> maxfunc(List<String> ops){
        List<Integer> res= new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        List<Integer> help= new ArrayList<>();
        int n=ops.size();
        for(int i=0;i<n;i++){
            if(ops.get(i).charAt(0)=='1'){
                stack.push(Integer.parseInt(ops.get(i).substring(2,4)));
                help.add(Integer.parseInt(ops.get(i).substring(2,4)));
            }
            else if(ops.get(i)=="2"){
                help.remove(stack.pop());
            }
            else if(ops.get(i)=="3"){
                Collections.sort(help);
                res.add(help.get(help.size()-1));
            }
        }
        return res;
    }
}
