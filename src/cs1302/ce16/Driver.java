package cs1302.ce16;

/**
 * A simple driver program to introduce students to {@code Comparable}, 
 * {@code Comparator}, and lambda expressions.
 * @author Brad Barnes and Supa' Mike
 */
public class Driver {

    /**
     * The entry point for the program
     */ 
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student(810_105_999, "Brad", 2.1),
            new Student(810_105_999, "Mike", 4.0),
            new Student(810_105_999, "Sally", 3.1),
            new Student(810_105_999, "Joe", 1.1),
        };

        Course[] courses = new Course[] {
            new Course(23455, "CSCI", 1301, "Introduction to Programming"),
            new Course(32133, "CSCI", 1302, "Software Development"),
            new Course(12455, "CSCI", 4720, "Software Architecture"),
        };


    } // main
} // Driver
