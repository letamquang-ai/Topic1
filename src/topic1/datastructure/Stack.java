package topic1.datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class Stack extends DataStructure{
	private ArrayList<Integer> stack;
	
	public Stack() {
		stack = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getStack() {
		return stack;
	}
	
	public void Create() {
		stack.clear();
	}
	
	public void Insert(Integer integer) {
		stack.add(integer);
	}
	
	public void Sort() {
		ArrayList<Integer> tempList = new ArrayList<>(stack);
        tempList.sort(Comparator.naturalOrder());
        stack.clear();
        stack.addAll(tempList);
	}
	
	public void Remove() {
        if (stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        stack.remove(stack.size() - 1);
    }
	
	public void Search(Integer integer) {
		boolean flag = true;
		for(int i=0; i<stack.size(); i++) {
			if(stack.get(i) == integer) {
				System.out.println(String.valueOf(integer)+" is at position "+String.valueOf(i));
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println(String.valueOf(integer)+" is not in stack");
		}
	}
	
}
