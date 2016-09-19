package lindsay.devon.ReusingClasses1;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by devonlindsay on 9/15/16.
 */
public class RotateArray extends List{

/* Write a function that rotates a list by k elements.
For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2].
Try solving this without creating a copy of the list. How many swap or move operations do you need?

In your main class call the method that rotates your array
Print original and rotated List values to screen */

    public static void rotateList(ArrayList myList, int k) {
        for(int i = 0; i < k; i++) {
            myList.add(myList.get(0));
            myList.remove(0);
        }
    }

    public static void printList(ArrayList myList) {
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList <String> myList = new ArrayList<String>();
        myList.add("Dogs");
        myList.add("Cats");
        myList.add("Fish");
        myList.add("Horses");
        myList.add("Penguins");

        printList(myList);
    rotateList(myList,3);
        System.out.println();
        printList(myList);




    }




}


