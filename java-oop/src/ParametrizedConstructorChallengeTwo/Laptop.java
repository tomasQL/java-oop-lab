package ParametrizedConstructorChallengeTwo;

public class Laptop {
    private String name;
    // D.C
    Laptop(){
        name = "";
    }
    // D.C
    Laptop(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dell extends Laptop {
    // D.C
    public Dell(){
    }
    // P.C
    public Dell(String name) {
        super(name);
    }
    public String getDetails(){
        return getName();
    }
}
class DellTest {
    public static void main(String[] args) {
        Dell dell = new Dell("Dell Insipiron");
        System.out.println(dell.getDetails());
        System.out.println(dell.getName());
    }
}