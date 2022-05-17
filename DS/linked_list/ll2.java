public class ll2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static ll2 insert_in_linkedlist(ll2 list,int data){
        Node newnode=new Node(data);
        if(list.head==null){
            list.head=newnode;
        }
        else{
            Node temp=list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            
        }
        return list;
    }

    public static void viewlist(ll2 list){
        Node temp=list.head;
        if(temp==null){
            System.out.println("List is empty");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
            System.out.println("^H^");
        }
    }

    public static void remove_node(ll2 list){
        if(list.head==null){
            return;
        }
        else{
            Node temp=list.head;
            while(temp.next.next!=null){
               temp=temp.next;
            }
            temp.next=null;
        }
    }

    public static ll2 insert_at_begining(ll2 list,int data){
        Node newnode=new Node(data);

        if(list.head==null){
            list.head=newnode;
        }
        else {
            newnode.next=list.head.next;
            list.head=newnode;
        }
        return list;
    }
    public static void main(String[] args){
        ll2 list=new ll2();
        list =insert_in_linkedlist(list, 23);
        list=insert_in_linkedlist(list, 43);
        list=insert_in_linkedlist(list, 12);
        list=insert_in_linkedlist(list, 60);
        remove_node(list);
        list=insert_at_begining(list, 20);
        list=insert_at_begining(list, 47);
        System.out.println("The list is:-");
        viewlist(list);
    }
}
