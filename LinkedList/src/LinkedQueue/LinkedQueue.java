
package LinkedQueue;
import LinkedList.LLNode;
import LinkedList.LinkedList;
/**
 *
 * @author zs087
 */
public class LinkedQueue{
   
    LinkedList list = new LinkedList();
    public LinkedQueue()
    {
       
    }

    public void enqueue(int data)
    {
        
        LLNode temp = new LLNode(data);
        
        if(isEmpty())
        {
            list.back = list.front = temp;
        }
        else
        {
            list.back = list.back.next = temp;
        }
    }
    public LLNode dequeue()
    {
        if(isEmpty())
        {
            return null;
        }
        LLNode temp = this.list.front;
        this.list.front = this.list.front.next;
        return temp;   
    }
    public LLNode peek()
    {
        if(isEmpty())
        {
            return this.list.front = null;
        }
        else
        {
            return this.list.front;   
        }
    }
    public boolean isEmpty()
    {
        return list.front == null;
    }
    public void makeEmpty()
    {
        list.front = null;
        list.back = null;
    }

    @Override
    public String toString()
    {
        String result = "(";
        
        LLNode temp = list.front;
        while(temp != null)
        {
            result += temp.toString() + ", ";
            temp = temp.next;
        }
        result += ")";
        return result;
    }
}
