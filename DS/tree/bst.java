

class tree_node{
    int data;
    tree_node right,left;
    
    tree_node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

public class bst{
    tree_node rootnode;
    bst(){
    this.rootnode=null;
    }
    void addintree(int data){
        
        tree_node temp=this.rootnode;
        if(this.rootnode==null){
            this.rootnode.data=data;
        }
        else{
        while(temp!=null){
            if(temp.data>data){
                temp=temp.left;
            }
            else if(temp.data<data){
                temp=temp.right;
            }
            else if(temp.data==data)
            System.out.println("con not enter the data");
        }
        temp.data=data;
    }

    }

    void inorder_traverse(tree_node t){
        if(t==null)
        return;

        inorder_traverse(t.left);
        System.out.print(t.data+" ");
        inorder_traverse(t.right);
        
    }

    public static void main(String[] args){
    bst newtree=new bst();
    newtree.addintree(10);
    newtree.addintree(12);
    newtree.addintree(1);
    newtree.addintree(17);
    newtree.addintree(28);
    newtree.addintree(13);
    newtree.addintree(16);
    newtree.addintree(5);
    newtree.addintree(6);
    System.out.println("the tree is:-");
    newtree.inorder_traverse(newtree.rootnode);
    }
    
}