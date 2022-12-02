package de.tum.in.ase;
/**
 *This abstract class will be the parent class for all the specific types of courses you will implement and use
 * in this implementation of a list.
 */
public abstract class Course {

    /*To make your life a little easier, we already provided you with some stuff in this class.
    So do yourself a favour and do not touch any of the given methods/attributes in case you're not explicitly told so.
     */

    //Attributes already provided
    private int courseId;
    private int durationInMinutes;
    private String name;

    //implement the Constructor for this abstract class

    public Course(int courseId, int durationInMinutes, String name) {
        this.courseId = courseId;
        this.durationInMinutes = durationInMinutes;
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //even the toString() method is provided
    /**
     *This is a customized version of the toString() method, that will allow you to print out your course objects in a
     * meaningful and understandable way.
     */
    @Override
    public String toString() {
        return  "Your next course is named " + name +
                ", has the ID " + courseId +
                " and lasts " + durationInMinutes +
                " minutes.";
    }
}
