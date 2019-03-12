package circular.array;

import java.util.Scanner;

public class CircularArrayManipulationTester {

    public static void main(String[] args) {
        Scanner abir = new Scanner(System.in);
        CircularArrayManipulation abir1 = new CircularArrayManipulation();
        Object[] a = {5, 3, 9, 13, 2};
        Object[] a1 = new Object[7];
        a1[0] = 7;
        a1[1] = 13;
        a1[4] = 5;
        a1[5] = 20;
        a1[6] = 19;
        System.out.println("Circular Array Capacity == " + a1.length);
        System.out.println("Circular Array Size == " + 5);
        //Iteration over the elements in a circular array
        abir1.IterateForward(a1, 4, 7);
        abir1.IterateBackward(a1, 4, 5);
        //Linearizing a circular array
        Object[] Linear = abir1.LinearCircularArray(a1, 4, 5);
        abir1.IterateForward(Linear, 0, 5);
        //Resizing a circular array
        Object[] resize = abir1.ResizeCircularArray(a1, 4, 5);
        abir1.IterateForward(resize, 4, 5);
        //Inserting an element in a circular array
        Object[] insert = abir1.InsertElement(a1, 4, 5, 55, 2);
        abir1.IterateForward(insert, 4, 6);
        //Removing an element in a circular array
        Object[] remove = abir1.RemoveElement(a1, 4, 5, 2);
        abir1.IterateForward(remove, 4, 4);
    }
}
