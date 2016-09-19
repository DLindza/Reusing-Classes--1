package lindsay.devon.ReusingClasses1;

/**
 * Created by devon on 9/19/16.
 */
public class SuperHuman extends Human {

    String allegiance;
    String heroName;
    String superAbility;



    SuperHuman(String name, int age, String gender, String occupation, String address,String allegiance, String heroName, String superAbility) {
        super(name,age,gender,occupation,address);
        this.allegiance = allegiance;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public void printAllegiance() {
        System.out.println(this.allegiance);
    }

    public void printHeroName() {
        System.out.println(this.heroName);
    }

    public void printSuperAbility() {
        System.out.println(this.superAbility);
    }

}
