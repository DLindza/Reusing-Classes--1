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

        System.out.println("SuperHuman Lab");
        human.printName();
        human2.printName();
        superHuman.printAllegiance();
        superHuman1.printSuperAbility();
        superHuman.printOccupation();


        Product product = new Product(1.00,01,100);
        Product product1 = new Product(2.00, 02, 200);
        Product product2 = new Product(3.00, 03, 300);
        Product product3 = new Product(4.00, 04, 400);

        Inventory inventory = new Inventory();

        inventory.trackProducts(product);
        inventory.trackProducts(product1);
        inventory.trackProducts(product2);
        inventory.trackProducts(product3);
        System.out.println("Inventory Lab");
        System.out.println(inventory.sumValueOfInventory());

    }
}
