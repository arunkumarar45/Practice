package Session2;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL {
    Node head=null;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;


    }
    public void addAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            addFirst(data);
            return;
        }
        Node temp=head;
        for (int i=1;i<position-1&&temp!=null;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next=null;

        while (curr != null) {

            next = curr.next; // store next node
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }
       head=prev;
        // new head
    }
    public int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        list.addFirst(60);
        list.display();
        list.addAtPosition(25,4);
        list.display();
        list.reverse();
        list.display();
        list.countNodes();
        System.out.println(list.countNodes());
    }

}
