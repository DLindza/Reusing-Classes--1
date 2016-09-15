package lindsay.devon.ReusingClasses1;
import java.awt.List;
import java.lang.reflect.Array;
/**
 * Created by devonlindsay on 9/15/16.
 */
public class RotateArray extends List{

/* Write a function that rotates a list by k elements.
For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2].
Try solving this without creating a copy of the list. How many swap or move operations do you need?

In your main class call the method that rotates your array
Print original and rotated List values to screen */



    public static void main(String[] args) {
        String[] myList = new String[5];
        myList[0] = "Dogs";
        myList[1] = "Cats";
        myList[2] = "Fish";
        myList[3] = "Horses";
        myList[4] = "Penguins";
    }
public void rotateList(Array[] myList, int k) {
    if (k > myList.length) {
        k = k%myList.length;
    }
    }
}

}
