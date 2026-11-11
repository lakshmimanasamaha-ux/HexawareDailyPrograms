
package Demo;

class LinkedList {
 
    Node head = null;
 
    // Add node at last
    void addAtLast(int data) {
 
        Node ptr = new Node(data);
 
        if (head == null) {
            head = ptr;
        }
        else {
            Node temp = head;
 
            while (temp.next != null) {
                temp = temp.next;
            }
            
            
            
 
            temp.next = ptr;
        }
    }

    void deleteAtLast() {
 
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            Node temp = head;
            Node save = head; // dummy node
 
            while (temp.next.next != null) {
                save = temp;
                temp = temp.next;
            }
 
            save.next = null;
        }
    }

    void addAtBegin(int data) {
 
        Node ptr = new Node(data);
 
        if (head == null) {
            head = ptr;
        }
        else {
            ptr.next = head;
            head = ptr;
        }
    }

    void deleteAtBegin() {
 
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    void addAtPosition(int data, int position) {
 
        Node ptr = new Node(data);
        Node temp = head;
        int i = 1;

        while (i < position - 1) {
            temp = temp.next;
            i++;
        }

        ptr.next = temp.next;
        temp.next = ptr;
    }

    void deleteAtPosition(int pos) {
 
        if (head == null) {
            System.out.println("List is Empty");
            return;
            }
        
        if (pos == 0) {
            head = head.next;
            return;
        }
    
        else{
            Node temp = head;
            Node save = null;
            int i = 0;
            
            while (temp != null) {
            
                if (i == pos) {
                    save.next = temp.next;
                    return;
                }
            
                save = temp;
                temp = temp.next;
                i++;
                }
        }
    }
    // Display linked list
    void show() {
 
        Node temp = head;
 
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
 
        System.out.println("null");
    }
}
 
public class LinkedListDemo {
    public static void main(String[] args) {
 
        LinkedList list = new LinkedList();
 
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtBegin(200);
        list.addAtPosition(100, 3);
        list.deleteAtBegin();
        //list.deleteAtPosition(3);

        list.show();
    }
}
 