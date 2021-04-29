package lab_9;

public class Employe {
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private double birthDate;
    private static int counter = 0;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBirthDate(double birthDate) {
        this.birthDate = birthDate;
    }

    public static int getCounter() {
        return counter;
    }

    public double getBirthDate() {
        return birthDate;
    }

    public Employe(String firstName, String lastName, double salary, double birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
    }
}

