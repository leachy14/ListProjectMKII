import java.util.*;
/**
 * This is a client class meant to test the NicePerson class.
 * It will create an array list of nice people and add them to the list.
 * It will then print out the list of nice people.
 * @author Christopher Leach
 * @version 1.0
 */
public class SantasList {

    public static void main(String[] args) {
        //test code
        testNicePerson();
    }

    public static void testNicePerson() {
        ArrayList<NicePerson> nicePeople = new ArrayList<NicePerson>();
        //create a list of six presents
        ArrayList<String> presents = new ArrayList<String>();
        presents.add("Skippy");
        presents.add("Optical Camo");
        presents.add("Basilisk");
        presents.add("Thorton truck");
        presents.add("Arasaka Cyberware");
        presents.add("Kiroshi optics");
        nicePeople.add(new NicePerson("Morgan", "Blackhand"));
        nicePeople.add(new NicePerson("Johny", "Silverhand"));
        nicePeople.add(new NicePerson("V", ""));
        //add a present to the first nice person
        // nicePeople.get(0).addPresent("Vacation Time");
        //loop through all current nice people and add a three random presents
        for (NicePerson nicePerson : nicePeople) {
            for (int i = 0; i < 3; i++) {
                nicePerson.addPresent(presents.get((int) (Math.random() * presents.size())));
            }
        }
        

        //print out all the nice people
        for (NicePerson person : nicePeople) {
            System.out.println(person.getName());
            System.out.println(person.getPresents());
        }



    }

}
