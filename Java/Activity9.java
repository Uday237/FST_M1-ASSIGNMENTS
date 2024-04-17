package activities;

import java.util.ArrayList;

public class Activity9 {
public static void main(String[] args) {

    ArrayList<String> myList = new ArrayList<>();
    myList.add("apple");
    myList.add("Mango");
    myList.add("egg");

    myList.add(3,"jack");
    myList.add(1,"papaya");

    System.out.println("Print all the objects");
    for(String s:myList){

        System.out.println(s);
    }

    System.out.println("3rd element in the list is: " + myList.get(2));
    System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
    System.out.println("Size of ArrayList: " + myList.size());

    myList.remove("Papaya");

    System.out.println("New Size of ArrayList: " + myList.size());

}
}
