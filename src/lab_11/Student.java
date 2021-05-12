package lab_11;

public class Student implements Comparable<Student> {
    private int id;
    private String lastname;
    private String firstname;

    private double magyar;
    private double roman;
    private double matek;

    public Student(int id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public void setMagyar(double magyar) {
        this.magyar = magyar;
    }

    public void setRoman(double roman) {
        this.roman = roman;
    }

    public void setMatek(double matek) {
        this.matek = matek;
    }

    public boolean atmeno() {
        return roman > 5 && matek > 5 && magyar > 5 && roman + magyar + matek / 3 > 6;
    }


    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", magyar=" + magyar +
                ", roman=" + roman +
                ", matek=" + matek +
                '}';
    }
}