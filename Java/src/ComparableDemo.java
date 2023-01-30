import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
	int rollno,marks;
	String name;
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Stud s) {
		
		return name.length()>s.name.length()?1:-1;
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"Jeena",75));
		studs.add(new Stud(24,"Larry",65));
		studs.add(new Stud(25,"Anna",93));
		studs.add(new Stud(26,"Sara",55));
		studs.add(new Stud(27,"Emily",45));
	Collections.sort(studs);
	for(Stud s :studs)
	{
		System.out.println(s);
	}
	}	
}
