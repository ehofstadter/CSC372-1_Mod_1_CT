import java.io.*;
import java.lang.*;
import java.util.*;

public class NameComparator implements Comparator<Student>{
	
	public int compare (Student first, Student second) {
		return first.name.compareTo(second.name);
	}

}
