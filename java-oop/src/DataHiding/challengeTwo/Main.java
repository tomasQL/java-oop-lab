package DataHiding.challengeTwo;

public class Main {
    public static void main(String[] args) {
        Student x = new Student();
        System.out.println(x.getName());
        x.setName("Belen");
        // darle mas sentido semantico a las operaciones
        String student_name = x.getName();
        System.out.println(student_name);

        x.setRollNumber("Veterinaria 10203");
        String student_rollnum = x.getRollNumber();
        System.out.println(student_rollnum);
    }
}
