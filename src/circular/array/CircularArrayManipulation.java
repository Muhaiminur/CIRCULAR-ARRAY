package circular.array;

public class CircularArrayManipulation {
    //Iteration over the elements in a circular array

    public void IterateForward(Object[] a, int start, int size) {
        System.out.println("===========================Printing Circular Array Forward====================================================");
        int s = start;
        for (int c = 0; c < size; c++) {
            System.out.print(a[s] + " , ");
            s = (s + 1) % a.length;
        }
        System.out.println("");
    }

    public void IterateBackward(Object[] a, int start, int size) {
        System.out.println("===========================Printing Circular Array Backword====================================================");
        int s = (start + size - 1) % a.length;
        for (int c = 0; c < size; c++) {
            System.out.print(a[s] + " , ");
            s--;
            if (s == -1) {
                s = a.length - 1;
            }
        }
        System.out.println("");
    }
    //Linearizing a circular array

    public Object[] LinearCircularArray(Object[] a, int start, int size) {
        System.out.println("===========================Linearizing a circular array====================================================");
        Object[] linear = new Object[a.length];
        int s = start;
        for (int c = 0; c < size; c++) {
            linear[c] = a[s];
            s = (s + 1) % a.length;
        }
        return linear;
    }
    //Resizing a circular array

    public Object[] ResizeCircularArray(Object[] a, int start, int size) {
        System.out.println("===========================Resizing a circular array====================================================");
        Object[] resize = new Object[a.length + 10];
        int s = start;
        for (int c = 0; c < size; c++) {
            resize[c] = a[s];
            s = (s + 1) % a.length;
        }
        System.out.println("New Resize Array Size" + resize.length);
        return resize;
    }
    //Inserting an element in a circular array

    public Object[] InsertElement(Object[] a, int start, int size, Object elem, int pos) {
        System.out.println("===========================Inserting an element in a circular array====================================================");
        int nShift = size - pos;
        int from = (start + size - 1) % a.length;
        int to = (from + 1) % a.length;
        for (int c = 0; c < nShift; c++) {
            a[to] = a[from];
            System.out.print(a[to] + ",");
            to = from;
            from = from - 1;
            if (from == -1) {
                from = a.length - 1;
            }
        }
        int index = (start + pos) % a.length;
        a[index] = elem;
        System.out.println("");
        return a;
    }
    //Removing an element in a circular array

    public Object[] RemoveElement(Object[] a, int start, int size, int pos) {
        System.out.println("===========================Removing an element in a circular array====================================================");
        int nShift = size - pos - 1;
        int index = (start + pos) % a.length;
        int to = (index) % a.length;
        int from = (to + 1) % a.length;
        for (int c = 0; c < nShift; c++) {
            a[to] = a[from];
            System.out.println(a[to]);
            to = from;
            from = (from + 1) % a.length;
        }
        a[from] = null;
        return a;
    }
}
