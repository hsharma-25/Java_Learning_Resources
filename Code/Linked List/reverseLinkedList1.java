
//REVERSING A LINKED-LIST USING ITERATION

public class reverseLinkedList1 {

    Node head;
    private int size;
    reverseLinkedList1(){
        this.size = 0;
    }
    class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first:
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add - last:
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print list:
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first:
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last:
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update:
            prevNode = currNode;
            currNode = nextNode;

        }

        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args){

        reverseLinkedList1 list = new reverseLinkedList1();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();

        list.reverseIterate();
        list.printList();

    }
}
