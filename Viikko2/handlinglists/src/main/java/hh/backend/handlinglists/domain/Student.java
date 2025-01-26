package hh.backend.handlinglists.domain;

public class Student {

    private String firstName;
    private String lastName;


    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student() {
        this.firstName = null;
        this.lastName = null;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    

    
}
