import java.io.*;
import java.lang.*;
import java.util.*;

public class SortStudents {
	
	public static void main (String[] args) { 

		ArrayList <Student> studentArray = new ArrayList<Student>(); 
		SortStudents sorted = new SortStudents();
		
		studentArray.add(new Student(17, "Zelda", "A town"));
		studentArray.add(new Student(42, "Aaron", "A hovel"));
		studentArray.add(new Student(36, "Barth", "Downtown"));
		studentArray.add(new Student(46, "Icaru", "A beehive"));
		studentArray.add(new Student(50, "James", "Crosstown"));
		studentArray.add(new Student(61, "Frank", "Uptown"));
		studentArray.add(new Student(47, "Beans", "Funky Town"));
		studentArray.add(new Student(38, "Yourn", "Electric Avenue"));
		studentArray.add(new Student(97, "PSher", "42 Wallaby Way"));
		studentArray.add(new Student(10, "lastn", "Nowhere"));
	
		System.out.println("\n**********************************************************\n"
				+ "Sorted by time of entry" +
				"\n**********************************************************\n");
			for (int i = 0; i < studentArray.size(); i++) {
				System.out.println(studentArray.get(i));
			}
			
		System.out.println("\n**********************************************************\n"
				+ "Sorted by Student Number" +
				"\n**********************************************************\n");
		
		Collections.sort(studentArray, new RollNoComparator());
			for (int i = 0; i < studentArray.size(); i++) {
				System.out.println(studentArray.get(i));
			}
			
		System.out.println("\n**********************************************************\n"
				+ "Sorted by Name" +
				"\n**********************************************************\n");
		
		Collections.sort(studentArray, new NameComparator());
			for (int i = 0; i < studentArray.size(); i++) {
				System.out.println(studentArray.get(i));
			}
			
		System.out.println("\n**********************************************************\n"
				+ "Sorted by Length of Address" +
				"\n**********************************************************\n");
		
		sorted.addressSort(studentArray); 
		
	}
		
		
	
	
	void addressSort(ArrayList <Student> studentArray) {
		int n = studentArray.size(); 
		
		for(int i = 0; i < n -1; i++) {
			//int shortestAddressLength = studentArray.get(i).address.length();
			
			for(int x = i + 1; x < n; x++) {
				if (studentArray.get(x).address.length() < studentArray.get(i).address.length()) {
					Student temp = studentArray.get(i);
					studentArray.set(i, studentArray.get(x));
					studentArray.set(x,  temp);
				}
					
			}
		}
		
		for (int i = 0; i < studentArray.size(); i++) {
			System.out.println(studentArray.get(i)); 
		}
	}
	
	
	
}
