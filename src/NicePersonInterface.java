/**
 * An interface for the NicePerson class.
 * The nice person class consists of a full name and a list of presents
 * @author Christopher Leach
 * @version 1.0
 */
public interface NicePersonInterface {
    /**
     * Retrieves the full name of the nice person as a string.
     * @return the full name of the nice person
     */
    public String getName();
    /**
     * sets the first name of the nice person
     * @param firstName the first name of the nice person
     */
    public void setFirst(String firstName);
    /**
     * sets the last name of the nice person
     * @param lastName the last name of the nice person
     */
    public void setLast(String lastName);
    /**
     * sets the full name of the nice person
     * @param firstName the first name of the nice person
     * @param lastName the last name of the nice person
     */
    public void setName(String firstName, String lastName);
    /**
     * retrieves the first name of the nice person
     * @return the first name of the nice person
     */
    public String getFirst();
    /**
     * retrieves the last name of the nice person
     * @return the last name of the nice person
     */
    public String getLast();
    /**
     * gives the last name of the nice person to another nice person
     * @param aName the nice person to receive the last name
     */
    public void giveLastNameTo(NicePersonInterface aName);
    /**
     * Adds a present to the nice person's list of presents
     * @param present the present to add to the list
     */
    public void addPresent(String present);
    /**
     * Removes the present at the given index from the nice person's list of presents
     * @param index the index of the present to remove from the list
     */
    public void removePresent(int index);
    /**
     * removes a present from the nice person's list of presents
     * @param present the present to remove from the list
     */
    public void removePresent(String present);
    /**
     * retrieves the list of presents as a string
     * @return the list of presents as a string
     */
    public String getPresents();
    /**
     * retrieves the number of presents in the list
     * @return the number of presents in the list
     */
    public int getNumberOfPresents();
    /**
     * retrieves the array of presents and returns as a string
     * @return the array of presents as a string
     */
    public String toString();
}
