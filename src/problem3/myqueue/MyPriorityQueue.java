/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyPriorityQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /*
    helper method : enQueue
     */
    public void enqueue(Node addData) {
        if (front == null) {
            rear = addData;
            front = addData;
            size++;
        } else {
            if (addData.getStudentRoll() >= this.rear.getStudentRoll()) {
                rear.setNext(addData);
                rear = addData;
                size++;
            } else if (addData.getStudentRoll() <= this.front.getStudentRoll()) {
                addData.setNext(this.front);
                this.front = addData;
                size++;
            } else {
                Node temp = this.front;
                Node tempPrevious = this.front;
                while (temp.getNext() != null) {
                    if (temp.getStudentRoll() > addData.getStudentRoll()) {
                        break;
                    }
                    tempPrevious = temp;
                    temp = temp.getNext();
                }
                tempPrevious.setNext(addData);
                addData.setNext(temp);
                size++;

            }
        }
    }

    /*
    helper method : to print the Queue
     */
    public void printQueue() {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print("Roll Number:"+temp.getStudentRoll()+" Student Name: "+temp.getStudentName()+" --->> ");
                temp = temp.getNext();
            } else {
                System.out.println(" Roll Number:"+temp.getStudentRoll()+" Student Name: "+temp.getStudentName());
            }
        }
    }

}
