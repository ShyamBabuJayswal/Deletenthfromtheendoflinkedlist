public class Deletenthnode {

        Node head;
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
     public Node removefromend(int n){
            if(head.next == null){
                return null;
            }
            //find size of linkedlist
            int size=0;
            Node currNode=head;
            while(currNode != null){
                currNode=currNode.next;
                size++;
            }
            if(n==size){
                return head.next;
            }
            int indextosearch=size-n;
            Node prevNode=head;
            int i=1;
            while(i<indextosearch){
                prevNode=prevNode.next;
                i++;
            }
        prevNode.next=prevNode.next.next;
            return head;

        }
}

