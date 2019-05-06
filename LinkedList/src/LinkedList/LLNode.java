
package LinkedList;

/**
 *
 * @author zs087
 */
public class LLNode {
    public int data;
    public LLNode next;
    

    public LLNode(int data)
    {
        this.data = data;
        //Linked Queue only****
        this.next = null;
    }
        public int getData()
    {
        return this.data;
    }
    public LLNode getNext()
    {
        return this.next;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public void setNext(LLNode next)
    {
        this.next = next;
    }
    @Override
    public String toString()
    {
        return "Node =  " + this.data;
    }
}
