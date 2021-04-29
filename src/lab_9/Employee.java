package lab_9;

public class Employee {
    private final int ID;
    private String firstName;
    private String LastName;
    private double salary;
    private MyDate birthDate;
    private static int counter = 0;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        counter++;
        this.ID=counter;
        this.firstName = firstName;
        LastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
