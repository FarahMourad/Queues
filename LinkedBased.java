package eg.edu.alexu.csd.datastructure.queue;
public class LinkedBased implements IQueue,ILinkedBased
{
	private class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node front;
	Node rear;
	int size;
	/*public LinkedBased()
	{
		front = rear = null;
		size = 0;
	}*/
	public void enqueue(Object item)
	{
		Node newNode = new Node(item);
		if(front==null) 
		{
			front = rear = newNode;
			size++;
		}
		else
		{
			rear.next = newNode;
			rear = newNode;
			size++;
		}
	}
	public Object dequeue()
	{
		if(size()==0)
		{
			throw new RuntimeException("Empty");
		}
		else
		{
			Object temp;
			temp = front.data;
			front = front.next;
			size--;
			return temp;
		}
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public int size()
	{
		return size;
	}
	public void show()
	{
		Node temp = front;
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != null);
		System.out.print("\n");
	}

}
