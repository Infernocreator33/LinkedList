
package LinkedList;

/**
 *
 * @author zs087
 */
public class LinkedListMain {
    public static void main(String [] args)
    {
    LinkedList list = new LinkedList();
    
    list.insertAtHead(67);
    list.insertAtHead(14);
    list.insertAtHead(27);
    list.insertAtHead(82);
    list.insertAtHead(9);
    list.insertAtHead(2);
    
    System.out.println(list);
    System.out.println("Length: " + list.length());
    list.deleteFromHead();
    
    System.out.println(list);
    System.out.println("Length: " + list.length());
    System.out.println("Found: " + list.find(14));
    System.out.println("Found: " + list.find(15));
   
    }
}
