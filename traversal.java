import org.w3c.dom.Node;

public class traversal {
    static Node head;
    static class Node {
        int data;
        Node Next;

        Node(int data){
            this.data=data;
            this.Next=null;

        }
    }

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        n1.Next=n2;

        while(head!=null){
            System.out.println(head.data+" ");
            head=head.Next;
        }
    }

}
