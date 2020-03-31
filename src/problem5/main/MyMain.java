/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Shivam", 3, 3));
        studentList.add(new Student(2, "aryan", 4, 2));
        studentList.add(new Student(3, "rahul", 6, 5));
        studentList.add(new Student(4, "xyz", 2, 0));
        studentList.add(new Student(5, "abcd", 0, 0));
        studentList.add(new Student(6, "efgh", 3, 1));
        studentList.add(new Student(7, "rohan", 0, 0));
        studentList.add(new Student(8, "vipul", 0, 0));
        studentList.add(new Student(9, "aditya", 6, 4));
        studentList.add(new Student(10, "sparsh", 9, 7));
        studentList.add(new Student(11, "noname", 3, 1));

        MyCircularQueue studentQueue = new MyCircularQueue();
        studentQueue.enqueue(studentList);

        studentQueue.printQueue();
    }
}
