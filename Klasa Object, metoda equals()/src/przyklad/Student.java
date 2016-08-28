package przyklad;

public class Student {
    String firstName;
    String lastName;
    public Student(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return firstName + " " + lastName;
    }
    
}