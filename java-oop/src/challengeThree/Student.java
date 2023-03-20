package challengeThree;
// Calculate the student's total marks
class Student {
    private String name;
    double mark1, mark2;

    public Student() {
        this.name = "";
        this.mark1 = 0;
        this.mark2 = 0;
    }
    public Student(String name, double mark1, double mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public double getMarks(int markNumber) {
        if(markNumber == 1)
            return mark1;
        else if (markNumber == 2)
            return mark2;
        return 0;
    }
    public double calcTotal() {
        double totalMarks = mark1 + mark2;
        return totalMarks;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Jack", 60, 70);
        System.out.println(student.calcTotal());
    }
}