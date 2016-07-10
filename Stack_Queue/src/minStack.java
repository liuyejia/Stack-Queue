import java.util.Stack;
public class minStack extends Stack<Integer> {
   Stack<Integer> s2;
	public minStack(){
	   s2=new Stack<Integer>();
   }
	public void push(int value)
  {
	  if(value<=min())
		  s2.push(value);
	  super.push(value);
  }
	public Integer pop()
	{
		int val=super.pop();
		if(min()==val)
			s2.pop();
		return val;
	}
	public int min()
	{
		if(s2.isEmpty())
			return Integer.MAX_VALUE;
		return s2.peek();
	}
}
