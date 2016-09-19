package lindsay.devon.ReusingClasses1;

/**
 * Created by devon on 9/19/16.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Devon", 30, "female", "painter", "123 Walnut Street Centerville,PA");
        Human human1 = new Human("Alex", 30, "male", "traveler", "456 Main Street Usaville, MA");
        Human human2 = new SuperHuman("Ted", 23, "male","accountant", "789 Yup Street Yupville, NJ","Good", "Mr. Cheese", "Spreads Good Feelings");
        SuperHuman superHuman = new SuperHuman("Kala",18,"female","student","9456 Yup Rd YupTown, MD","Good", "Ms. Marvel", "Transformation");
        SuperHuman superHuman1 = new SuperHuman("Alastair", 52, "male", "lawyer","666 HellsBane Rd Nopeville, NJ","Bad", "Mr. Onions", "Creating Stench");

        human.printName();
        human2.printName();
        superHuman.printAllegiance();
        superHuman1.printSuperAbility();
        superHuman.printOccupation();

    }
}
