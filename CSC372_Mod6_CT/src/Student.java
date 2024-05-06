import java.io.*;
import java.lang.*;
import java.util.*;

public class Student {

	int rollno;
	String name;
	String address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student: " + name + " Roll number: " + rollno + " Address: " + address;
	}
	
}
