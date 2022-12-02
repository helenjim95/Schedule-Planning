package de.tum.in.ase;

/**
 *This class is a child class from the parent course. It represents a specific type of course with characteristic
 * additional attributes. In this case those attributes are: seminarHost and seminarRoomId
 */
public class Seminar extends Course {
    //TODO: make sure you take care of necessary inheritance
    /*To make your life a little easier, we already provided you with some stuff in this class.
    So do yourself a favour and do not touch any of the given methods/attributes in case you're not explicitly told so.
     */

    //Attributes already provided
    private String seminarHost;
    private int seminarRoomId;

    //implement the Constructor for this class
    //Remember how constructors (should) behave when inheritance is involved
    public Seminar(int courseId, int durationInMinutes, String name, String seminarHost, int seminarRoomId) {
        super(courseId, durationInMinutes, name);
        this.seminarHost = seminarHost;
        this.seminarRoomId = seminarRoomId;
    }

    public String getSeminarHost() {
        return seminarHost;
    }

    public void setSeminarHost(String seminarHost) {
        this.seminarHost = seminarHost;
    }

    public int getSeminarRoomId() {
        return seminarRoomId;
    }

    public void setSeminarRoomId(int seminarRoomId) {
        this.seminarRoomId = seminarRoomId;
    }

    /**
     *This toString() method will use the super toString() from the course class in order to reflect all the important
     * information from the parent as well as the child class.
     */
    //add the toString() from the super class in front of the given Strings
    @Override
    public String toString() {
        return  super.toString() + " It is a seminar " +
                "held by " + seminarHost +
                " in room " + seminarRoomId + '.';
    }
}
