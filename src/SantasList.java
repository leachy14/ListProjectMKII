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
        //Calls the method where the test code is
        testNicePerson();
    }

    public static void testNicePerson() {
        //Creates a new array list of nice people
        ArrayList<NicePerson> nicePeople = new ArrayList<>();
        //create a list of six presents
        ArrayList<String> presents = new ArrayList<>();
        presents.add("Skippy");
        presents.add("Optical Camo");
        presents.add("Basilisk");
        presents.add("Thorton truck");
        presents.add("Arasaka Cyberware");
        presents.add("Kiroshi optics");
        //add some NicePerson object to the list
        nicePeople.add(new NicePerson("Morgan", "Blackhand"));
        nicePeople.add(new NicePerson("Johny", "Silverhand"));
        nicePeople.add(new NicePerson("V", ""));
        nicePeople.add(new NicePerson("Judy", "Alverez"));
        nicePeople.add(new NicePerson("Panam", "Palmer"));
        nicePeople.add(new NicePerson("River", "Smith"));
        //add a present to the first nice person as a test
        // nicePeople.get(0).addPresent("Vacation Time");
        //loop through all current nice people and add three random presents
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
        //remove the last nice person from the list
        nicePeople.remove(nicePeople.size() - 1);
        //print out all the nice people using toString
        System.out.println(nicePeople.toString());

        //loop through to set everyone's last name to the first index
        for (NicePerson person : nicePeople) {
            person.setLast(nicePeople.get(0).getLast());
        }
        //loop through and print everyone's names
        for (NicePerson person : nicePeople) {
            System.out.println(person.getName());
        }



    }

}
