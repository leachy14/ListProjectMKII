import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
/**
 * This is a client class meant to test the NicePerson class.
 * It will create an array list of nice people and add them to the list.
 * It will then print out the list of nice people.
 * @author Christopher Leach
 * @version 1.0
 */
public class SantasList {

    public static void main(String[] args) {
        ArrayList<NicePerson> nicePeople = new ArrayList<NicePerson>();
        nicePeople.add(new NicePerson("Christopher", "Leach"));
        nicePeople.add(new NicePerson("John", "Smith"));
        nicePeople.add(new NicePerson("Jane", "Doe"));
        nicePeople.add(new NicePerson("Bob", "Jones"));
        nicePeople.add(new NicePerson("Sally", "Smith"));
        nicePeople.add(new NicePerson("Joe", "Smith"));
        List<String> presents = new ArrayList<String>();
        presents.add("xbox");
        presents.add("ps4");
        presents.add("nintendo switch");
        presents.add("pc");
        presents.add("mac");
        presents.add("iphone");

        //loop through nice people and add presents to their object
        for (NicePerson nicePerson : nicePeople) {
            nicePerson.addPresent(presents.get(new Random().nextInt(presents.size())));
        }

        //print the entire list of nice people
        for (NicePerson nicePerson : nicePeople) {
            System.out.println(nicePerson.getName() + " " + nicePerson.getPresents());
        }
        //currently getting error that the presents list is NULL
    }

}
