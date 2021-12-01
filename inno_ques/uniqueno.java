import java.util.*;
class uniqueno{
    public static void main(String[] args){
    int size,xor=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("entter size of array");
    size = sc.nextInt();
    Vector <Integer> v=new Vector<>();
    System.out.println("enter vector elements");
    for(int i=0;i<size;i++){
        v.addElement(sc.nextInt());
        xor=xor^v.elementAt(i);
    }
    System.out.println("element is "+xor);
    sc.close();
    }
}