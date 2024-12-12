package topic1.datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class List extends DataStructure{
	private ArrayList<Integer> list;
	
	public List() {
        list = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getList() {
		return list;
	}
	
	public void Create() {
		list.clear();
	}
	
	public void Insert(Integer integer, Integer pos) {
		list.add(pos, integer);
	}
	
	public void Sort() {
        list.sort(Comparator.naturalOrder());
	}
	
	public void RemoveIndex(Integer pos) {
		if(list.size() == 0) {
			throw new IllegalStateException("List is empty");
		}
		else if (list.size() <= pos) {
            throw new IllegalStateException("List index is out of range");
        }
        else {
			list.remove((int) pos);
		}
    }
	
	public void RemoveElement(Integer integer) {
        if (list.contains(integer)) {
            list.remove(list.indexOf(integer));
        }
        else {
            throw new IllegalStateException(String.valueOf(integer)+" is not in list");
		}
    }
	
	public void Search(Integer integer) {
		boolean flag = true;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == integer) {
				System.out.println(String.valueOf(integer)+" is at position "+String.valueOf(i));
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println(String.valueOf(integer)+" is not in list");
		}
	}
	
}
