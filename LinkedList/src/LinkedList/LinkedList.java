
package LinkedList;

/**
 *
 * @author zs087
 */
public class LinkedList {
    public LLNode front;
    public LLNode current;
    public LLNode back;

    
    public LinkedList()
    {
        
    }
    public LLNode getFront()
    {
        return this.front;
    }
    public LLNode getBack()
    {
        return this.back;
    }
    public LLNode getCurrent()
    {
        return this.current;
    }
    public void setFront(LLNode front)
    {
        this.front = front;
    }
    public void setBack(LLNode back)
    {
        this.back = back;
    }
    public void setCurrent(LLNode current)
    {
        this.current = current;
    }
        public void insertAtHead(int data)
    {
        LLNode newNode = new LLNode(data);
        newNode.setNext(this.front);
        this.front = newNode;
    }
    public int length()
    {
        int length = 0;
        LLNode tmp;
        tmp = this.front;
        while(tmp != null)
        {
            length++; 
            tmp = tmp.getNext();
        }
        return length;
    }
    public void deleteFromHead()
    {
        this.front = this.front.getNext();
    }
    public LLNode find(int data)
    {
        LLNode tmp = this.front;
        while( tmp != null)
        {
            if(tmp.getData() == data)
            {
                return tmp;   
            }
            tmp = tmp.getNext();
        }
        return null;
    }
    @Override
    public String toString()
    {
        String result = "(";
        LLNode tmp = this.front;
        
        while(tmp != null)
        {
            result += tmp.toString() + ", ";
            tmp = tmp.getNext();
        }
        result += ")";
        return result;
    }
    
}
