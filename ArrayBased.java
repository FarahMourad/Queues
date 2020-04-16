package eg.edu.alexu.csd.datastructure.queue;
public class ArrayBased implements IQueue,IArrayBased
{
	int n;
	Object [] Queue;
	int size;
	int front;
	int rear;
	public ArrayBased(int p)
	{
		n=p;
		size = front = rear = 0;
		Queue	= new Object[n];
	}
	public void enqueue(Object item)
	{
		if(!isFull())
		{
			Queue[rear] = item;
			rear = (rear+1)%n;
			size++;
		}
		else
		{
			System.out.println(" full");
		}
		
	}
	public Object dequeue()
	{
		if(!isEmpty())
		{
			Object data = Queue[front];
			Queue[front] = 0;
			front= (front+1)%n;
			size--;
			return data;
		}
		else
		{
			System.out.println(" empty");
			return null;
			
		}
		
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean isFull()
	{
		return size==n;
	}
	public int size()
	{
		return size;
	}
	//to show what is in the queue
	public void show()
	{
		//the ADT appearance
		for(int i=0;i<size;i++)
		{
			System.out.print(Queue[(i+front)%n] + " ");
		}
		System.out.print("\n");
		//for showing what is really in the memory
		/*for(Object m :Queue)
		{
			System.out.println(m + " ");
		}*/
	}
}
