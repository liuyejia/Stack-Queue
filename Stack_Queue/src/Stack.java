import java.util.*;
public class Stack {
  Node top;
  public Stack(int tp)
  {
	  top=new Node(tp);
  }
  void push(int t)
  {
	  Node it=new Node(t);
	  it.next=top;
	  top=it;
  }
  Node pop()
  {
	  if(top==null)
		  return null;
	  else
	  {
		  Node x=top;
		  top=top.next;
		  return x;
	  }
  }
}
