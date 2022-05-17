import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        //data to be initialized as 
        //next by default null
    }
}


public class linkedlist
{
    
    Node head;
    linkedlist(){
        this.head=null;
    }
    void insertatTail(int data){
        Node newnode = new Node(data);
        Node temp=head;
        //this.head is the head of this class 
        //checking if it is null
        if(this.head==null){
            this.head.next=newnode;
            this.head=newnode;
        }
        else{
       
        while(temp!=null){
            temp=temp.next;
        }
        temp=newnode;
    }
    }
    void insertathead(int data){
        Node newnode = new Node(data);
        if(this.head==null){
            
            this.head=newnode;
            return;
        }
        else{
           
            newnode.next=this.head.next;
            this.head=newnode;
        }
    }
    // void addinbetween(int data,int pos){
    //     Node newnode = new Node(data);
        
    //     while((pos)-->1){
    //         newnode.next=head.next;
    //         newnode.data=data;
    //         this.head=newnode;

    //     }
    // }

    void viewlist(){
        Node temp=this.head;
        if(temp==null){
        System.out.println("no element to view");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print("\n^H^");
        }
        
    }

    // void freq(int data){
    //     int c=0;
    //     Node temp=this.head;
    //     while(temp!=null){
    //         if(temp.data==data){
    //             c++;
    //         }
    //     }
    //     System.out.println("frequency of "+data+" is "+c);
    // }
    public static void main(String[] args){
    /*  Functions of linked list
    1. addathead
    2. addattail
    3. addafternode
    4. view list
    5. search list element
    */
    linkedlist l=new linkedlist();
    l.insertathead(12);
    l.insertathead(23);
    l.insertathead(23);
    l.insertathead(22);
    l.insertatTail(20);
    l.insertatTail(40);
    l.insertatTail(20);
    // l.addinbetween(20, 3);
    // l.addinbetween(45, 1);
    System.out.println("the list is :-");
    l.viewlist();
    // System.out.println("frequency of 20 in the given linked list is");
    // l.freq(20);
    }
}