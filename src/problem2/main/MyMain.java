/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import java.util.Scanner;

// executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        MyBST bst=new MyBST();
        bst.Insert(55);
        bst.Insert(5);
        bst.Insert(10);
        bst.Insert(2);
        bst.Insert(12);
        bst.Insert(7);
        bst.Insert(3);
        bst.Insert(1);
        bst.Insert(25);
        bst.preOrder();
        bst.postOrder();
    }
}
