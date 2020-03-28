/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {
    private String StudentName;
    private int StudentRoll;
    private Node next=null;

    public Node(int studentRoll,String studentName){
        StudentName = studentName;
        StudentRoll = studentRoll;
    }

    public int getStudentRoll() {
        return StudentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        StudentRoll = studentRoll;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
