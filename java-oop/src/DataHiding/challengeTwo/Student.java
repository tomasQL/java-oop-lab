package DataHiding.challengeTwo;

public class Student {

    private String name;
    private String rollNumber;
    public Student(){
        name = "Unknown";
        rollNumber = "N/A";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
