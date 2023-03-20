package Iexam;

import java.util.ArrayList;
// Grocery List Exam 1 Q
public class GroceryList {

    private String item;
    ArrayList<String> grocList = new ArrayList<>();
    public GroceryList(){
        item = "";
    }

    public void insertItem(String item){
        grocList.add(item);
    }
    public void printList(){
        for (String s : grocList) System.out.println(s);
    }
}
class Demo {
    public static void main(String[] args) {
        GroceryList gc = new GroceryList();
        gc.insertItem("Onion");
        gc.insertItem("Garlic");
        gc.insertItem("Bread");
        gc.printList();

    }
}
// Parte 2 Examen POO
class Patient{
    private String name;
    private int id;
    private String doctor;

    public Patient(String name, int id, String doctor) {
        this.name = name;
        this.id = id;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}