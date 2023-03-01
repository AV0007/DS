package linkedlist;


public class LinkedList {
    Node head;
    Node tail;
    int size;

    public static class Node{
        int data;
        Node next;
    }


    void addLast(int val){
        if (head==null){
            Node node=new Node();
            node.data=val;
            node.next=null;
            head=tail=node;
            size++;

        }else {
            Node node=new Node();
            node.data=val;
            node.next=null;
            tail.next=node;
            tail= node;
            size++;
        }

    }

    void display(){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.next.data);
            temp=temp.next;
        }

    }

    public int size(){
        return size;
    }

    void  removeFirst(){
         if (size==0){
             System.out.print("NO ELEMENT");
         }else if(size==1){
             head=tail=null;
             size =0;

         }else {
             head= head.next;
             size--;
         }
    }



    public static void main(String args[]){





    }

}


