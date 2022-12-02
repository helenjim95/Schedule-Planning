package de.tum.in.ase;
/**
 *This class is a custom implementation of a generic list. This is a data structure, that allows you to collect data
 * that is not necessarily from the same type.
 */
public class List<T extends Course> {
        /* You probably already wondered if you have to do anything at all. The answer is: Yes, you do.
        Although we've been quite generous with you this time, there should still be a challenge, right?
        So this is where your main task is. Since you most likely already completed all the other classes, this
        will be the finale for this exercise.
         */

    //TODO: add all necessary attributes. You will find them within the UML attached to the problem statement
    private List<T> next;
    private T course;

    public List(T course, List<T> next) {
        this.next = next;
        this.course = course;
    }

    public List(T course) {
        this.course = course;
    }

    /*TODO: implement the insert method. This methods lets you add an item to you list.
       Again, please make sure to refer to the problem statement
     */
//    When a List object calls the insert(T) method, the new element is inserted after the object which called the method.
//    The elements already in the list are moved back by one.Do not forget to set the next attribute accordingly.
    public void insert(T course) {
        List<T> oldNext = next;
        next = new List<>(course, next);
//        List<T> courseList = new List<>(course);
//
//        // Find size of this List
//        int size = 0;
//        T currentCourse = this.getCourse();
//        List<T> nextNode = this.getNext();
//        while(nextNode != null) {
//            nextNode = nextNode.getNext();
//            currentCourse = nextNode.getCourse();
//            size ++;
//        }
//        //        find index of this object that called the method
//        int indexOfThisObjectThatCalledTheMethod = 0;
//        while(nextNode != null) {
//            if (nextNode == this) {
//                break;
//            }
//            nextNode = nextNode.getNext();
//            currentCourse = nextNode.getCourse();
//            indexOfThisObjectThatCalledTheMethod ++;
//        }
//
////        push items back one index
//        while(nextNode != null) {
//            int index = indexOfThisObjectThatCalledTheMethod;
//            for (int i = index; i < size; i++) {
//                List<T> tempNextNode =
//                        nextNode = nextNode.getNext();
//                currentCourse = nextNode.getCourse();
//                index++;
//            }
//        }
//
//        nextNode.setNext(courseList);
    }


    /*TODO: implement the delete method, that lets you delete an item from your list.
     */
    public void delete() {
        if (next != null) {
            next = next.next;
        }
    }

    //TODO: implement a method that allows you to return all of the items in you list as a String

    public String returnMySchedule() {
        String result = "" + course;
        for (List<T> t = next; t != null; t = t.next) {
            result = result + "\n" + t.course;
        }
        return result + "";
    }
    //implement getters and setters


    public List<T> getNext() {
        return next;
    }

    public void setNext(List<T> next) {
        this.next = next;
    }

    public T getCourse() {
        return course;
    }

    public void setCourse(T course) {
        this.course = course;
    }
}
