/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue mp=new MyPriorityQueue();
        mp.enqueue(new Node(75,"naam"));
        mp.enqueue(new Node(25,"Shivam"));
        mp.enqueue(new Node(66,"alien"));
        mp.enqueue(new Node(55,"bhoot"));
        mp.printQueue();
    }
}
