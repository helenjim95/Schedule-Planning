package de.tum.in.ase;

/**
 *This class is a child class from the parent course. It represents a specific type of course with characteristic
 * additional attributes. In this case those attributes are: tutor and roomId
 */
public class Tutorial extends Course{
    //TODO: make sure you take care of necessary inheritance
    /*To make your life a little easier, we already provided you with some stuff in this class.
    So do yourself a favour and do not touch any of the given methods/attributes in case you're not explicitly told so.
     */

    //Attributes. From us to you.
    private String tutor;
    private int roomId;

    //implement the Constructor for this class
    //Remember how constructors (should) behave when inheritance is involved
    public Tutorial(int courseId, int durationInMinutes, String name, String tutor, int roomId) {
        super(courseId, durationInMinutes, name);
        this.tutor = tutor;
        this.roomId = roomId;
    }

    public String getTutor() {
        return tutor;
    }

    public int getRoomId() {
        return roomId;
    }

    /**
     *This toString() method will use the super toString() from the course class in order to reflect all the important
     * information from the parent as well as the child class.
     */
    //add the toString() from the super class in front of the given Strings
    @Override
    public String toString() {
        return  super.toString() + " It is a tutorial " +
                "held by " + tutor +
                " in room " + roomId + '.';
    }
}
