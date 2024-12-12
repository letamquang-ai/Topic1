package topic1.test;
import topic1.datastructure.*;

public class GUI {
	public static void main(String[] args) {
		List list = new List();
		list.Insert(10, 0);
		list.Insert(7, 1);
		list.Insert(20, 2);
		list.Sort();
		for(Integer element: list.getList()) {
			System.out.println(element);
		}
	}
}
