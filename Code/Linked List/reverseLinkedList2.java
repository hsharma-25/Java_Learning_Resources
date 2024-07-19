
//REVERSING A LINKED-LIST USING RECURSION

public class reverseLinkedList2 {

    Node head;
    private int size;
    reverseLinkedList2(){
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

    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){

        reverseLinkedList2 list = new reverseLinkedList2();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}