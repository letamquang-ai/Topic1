package topic1.datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class Queue extends DataStructure{
	private ArrayList<Integer> queue;
	
	public Queue() {
        queue = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getQueue() {
		return queue;
	}

	public void Create() {
		queue.clear();
	}
	
	public void InsertStart(Integer integer) {
		queue.add(0, integer);
	}
	
	public void InsertEnd(Integer integer) {
		queue.add(integer);
	}
	
	public void Sort() {
		ArrayList<Integer> tempList = new ArrayList<>(queue);
        tempList.sort(Comparator.naturalOrder());
        queue.clear();
        queue.addAll(tempList);
	}
	
	public void RemoveStart() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        else {
			queue.remove(0);
		}
    }
	
	public void RemoveEnd() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        else {
			queue.remove(queue.size()-1);
		}
    }
	
	public void Search(Integer integer) {
		boolean flag = true;
		for(int i=0; i<queue.size(); i++) {
			if(queue.get(i) == integer) {
				System.out.println(String.valueOf(integer)+" is at position "+String.valueOf(i));
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println(String.valueOf(integer)+" is not in queue");
		}
	}
	
}
