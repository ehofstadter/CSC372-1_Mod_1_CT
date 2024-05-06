import java.io.*;
import java.lang.*;
import java.util.*;

public class RollNoComparator implements Comparator<Student> {
	
	public int compare(Student first, Student second) {
		return first.rollno - second.rollno;
		
	}
}
