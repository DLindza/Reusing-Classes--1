package lindsay.devon.ReusingClasses1;

/**
 * Created by devon on 9/19/16.
 */


// In your main class initialize a few human and superhuman instances
//   Demonstrate calling methods inherited from Human on your SuperHuman instances
//   Print all output to screen
public class Human {

    String name;
    int age;
    String gender;
    String occupation;
    String address;

    Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }

    public void printName() { System.out.println(this.name);  }

    public void printAge() { System.out.println(this.age);     }

    public void printGender() { System.out.println(this.gender);    }

    public void printOccupation() { System.out.println(this.occupation);    }

    public void printAddress() { System.out.println(this.address);    }


}
