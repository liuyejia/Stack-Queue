
public class Three_Array_stack {

	int stackSize=300;
	int[] buffer=new int[stackSize*3];
	int[] stackPointer={0,0,0};
	public void push(int stackNum,int value)
	{
		int index=stackNum*stackSize+stackPointer[stackNum]+1;
		stackPointer[stackNum]++;
		buffer[index]=value;
	}
	public int pop(int stackNum)
	{
		int index=stackNum*stackSize+stackPointer[stackNum];
		int val=buffer[index];
		stackPointer[stackNum]--;
		buffer[index]=0;
		return val;
	}
	public int peek(int stackNum)
	{
		int index=stackNum*stackSize+stackPointer[stackNum];
		return buffer[index];
	}
	public boolean isEmpty(int stackNum)
	{
		return stackPointer[stackNum]==stackNum*stackSize;
	}
	
}