package lab_11;

public class Student  {
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




    
}