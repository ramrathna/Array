
import java.util.ArrayList;
import java.util.Iterator;
 
public class list {

	public static void main(String[] args) {
		ArrayList<Object> employee = new ArrayList<Object>();
		employee.add("Naveen");
		employee.add("prasad");
		employee.add("Hariharan");
		employee.add("Ramprasana");
		employee.add("Ajay");
		for(Object sub:employee) {
		System.out.println(employee);
		}
		Iterator<Object> emp= employee.iterator();
	
		while(emp.hasNext()) {
			System.out.println("Employee:" + emp.next() );
		}
		ArrayList<Object> id = new ArrayList<Object>();
		id.add(123);
		id.add(124);
		id.add(125);
		id.add(126);
		id.add(127);
		System.out.println(id);
		employee.addAll(id);
		//System.out.println(employee);
		
		ArrayList<Object> company = new ArrayList<Object>();
		company.add("Vee Technology");
		company.add("First American India");
		company.add("Dattendriya Data Science");
		company.add("Neosome");
		company.add("Creation Technology");
		System.out.println(company);
		
		employee.addAll(company);
		System.out.println(employee);
		id.remove(3);
		System.out.println(id);
		company.remove(4);
		System.out.println(company);
		employee.remove(2);
		
		System.out.println(employee);
		
		}
}