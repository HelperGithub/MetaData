public class LinkedList {
    public Node head;
    public  Node getHead(){
        return this.head;
    }
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    public void insertInMiddle(int data, int key){
        Node newNode = new Node(data);

        if(head == null)
            head = newNode;
        else {
            Node current = head;
            while (current.data != key && current != null) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void printList(){
        while(head !=null){
            System.out.print(head.getData()+ " ");
            head= head.getNext();
        }
        System.out.println();
    }

    public void deleteAtBeginning(){
        if(head == null){

        }else{
            Node afterNode;
            afterNode = head;
            head = afterNode.next;
            afterNode.next = null;
        }
    }
    public void deleteAtEnd(){
        if(head == null){

        }else{
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;

        }
    }
    public void deleteAtMiddle(int key){
        if(head != null){
            Node current = head;
            while(current.next.data != key && current != null){
                current = current.next;
            }
            Node afterNode = current.next;
            current.next = afterNode.next;
            afterNode.next  = null;
        }
    }
    public boolean searchElement(int key){
        Node current = head;
        while(current != null){
            if(current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }
}
