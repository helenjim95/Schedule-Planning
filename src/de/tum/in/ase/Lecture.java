package de.tum.in.ase;

/**
 *This class is a child class from the parent course. It represents a specific type of course with characteristic
 * additional attributes. In this case those attributes are: lecturer and lectureHallId
 */
public class Lecture{
    //TODO: make sure you take care of necessary inheritance
    /*To make your life a little easier, we already provided you with some stuff in this class.
    So do yourself a favour and do not touch any of the given methods/attributes in case you're not explicitly told so.
     */

    //Attributes already provided
    private String lecturer;
    private int lectureHallId;

    //TODO: implement the Constructor for this class
    //Remember how constructors (should) behave when inheritance is involved

    /**
     *This toString() method will use the super toString() from the course class in order to reflect all the important
     * information from the parent as well as the child class.
     */
    //TODO: add the toString() from the super class in front of the given Strings
    @Override
    public String toString() {
        return  " It is a lecture " +
                "held by " + lecturer +
                " in lecture hall " + lectureHallId + '.';
    }
}
