public class Programmer implements ProgrammerInterface {
    // Write the code to define a class called Programmer. The class should have the
    // following properties:
    // id, firstName, lastName, dob, salary.
    // The class should contain a constructor that defines all properties and also
    // have get and set methods for them.

    private int ID;
    private String firstName;
    private String lastName;
    private String dob;
    private double salary;

    public Programmer(int iD, String firstName, String lastName, String dob, double salary) {
        ID = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    // Modify the Programmer class so it implements the ProgrammerInterface
    // interface.
    // Write the code for the new class.
    // Note: the class should now have a behaviour(work) that should print "The
    // programmer, <name of the programmer>, is now working.
    public void work() {
        System.out.println("The programmer, " + getFirstName() + ", is now working.");
    }
}

// Write the code to define an interface for your Programmer class.
// The interface should have a method called work. The name of the interface
// should be ProgrammerInterface.
interface ProgrammerInterface {
    public void work();
}
