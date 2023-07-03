package Problems;

import java.util.ArrayList;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		int i=0;
		int number=0;
		
do {
	 number=number+li.get(i);;
	 i++;
}while(i<li.size());
System.out.println(number/li.size());

	

}
}
