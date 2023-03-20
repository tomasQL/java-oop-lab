package Iexam;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {

    private String items;
    private String[] grocList;

    public GroceryList(){
        items = "";
        grocList = ;
    }

    public void insertItem(String item){
        grocList.append(item);
    }
    public void printList(){
        for (int i = 0; i < ; i++)
            System.out.println(grocList[i]);
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
