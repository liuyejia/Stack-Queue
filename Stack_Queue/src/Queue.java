
public class Queue {
 Node first,last;
 
 public Queue(Node f,Node l)
 {
	 this.first=f;
	 this.last=l;
	 first.next=last;
 }
 public void enqueue(int x)
 {
	 if(first==null)
	 {
		 last=new Node(x);
		 first=last;
	 }
	 else
	 {
		 last.next=new Node(x);
		 last=last.next;
	 }
 }
 public Node dequeue()
 {
	 if(first!=null)
	 {
		 Node item=first;
		 first=first.next;
		 return item;
	 }
	 else
		 return null;
 }
}
