import java.util.List;
/**
 * This class represents a nice person.
 * It will have a name and a list of presents.
 * @author Christopher Leach
 * @version 1.0
 */
public class NicePerson extends Name implements NicePersonInterface {
    private List<String> presents;
    private String name;
    private String firstName;
    private String lastName;

    public NicePerson() {
    } //end default constructor

    /**
     * This constructor will create a nice person with a name.
     * @param firstName the first name of the nice person
     * @param lastName the last name of the nice person
     */
    public NicePerson(String firstName, String lastName) {
        firstName = firstName;
        lastName = lastName;
    }
    /**
     * This method will set the full name of the nice person.
     * @param firstName the first name of the nice person
     * @param lastName the last name of the nice person
     */
    public void setName(String firstName, String lastName) {
        setFirst(firstName);
        setLast(lastName);
    }
    /**
     * This method will retrieve the full name of the nice person.
     * @return the full name of the nice person
     */
    public String getName() {
        return name;
    }
    /**
     * This method will set the first name of the nice person.
     * @param firstName the first name of the nice person
     */
    public void setFirst(String firstName) {
        firstName = firstName;
    }

    /**
     * This method will set the last name of the nice person
     * @param lastName the last name of the nice person
     */
    public void setLast(String lastName) {
        lastName = lastName;
    }
    /**
     * This method will retrieve the first name of the nice person.
     * @return the first name of the nice person
     */
    public String getFirst() {
        return firstName;
    }
    /**
     * This method will retrieve the last name of the nice person.
     * @return the last name of the nice person
     */
    public String getLast() {
        return lastName;
    }
    /**
     * This method will give the last name of the nice person to another nice person.
     * @param aName the nice person to receive the last name
     */
    public void giveLastNameTo(NicePersonInterface aName) {
        aName.setLast(lastName);
    }
    /**
     * This method will add a present to the nice person's list of presents.
     * @param present the present to add to the list
     */
    public void addPresent(String present) {
        presents.add(present);
    }
    /**
     * This method will remove a present from the nice person's list of presents.
     * @param present the present to remove from the list
     */
    public void removePresent(String present) {
        presents.remove(present);
    }
    /**
     * This method will retrieve the list of presents as a string.
     * @return the list of presents as a string
     */
    public String getPresents() {
        return presents.toString();
    }
    /**
     * This method will retrieve the number of presents in the list.
     * @return the number of presents in the list
     */
    public int getNumberOfPresents() {
        return presents.size();
    }
    /**
     * This method will return a string representation of the nice person.
     * @return a string representation of the nice person
     */
    public String toString() {
        return firstName + " " + lastName + " " + presents.toString();
    }

}
