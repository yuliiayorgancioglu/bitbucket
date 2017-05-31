package HomeWork_021;

public class Main {

    public static void main(String[] args) {

        myArrayList myArray = new myArrayList();

        myArray.add(1);
        myArray.add(8);
        myArray.add(2);
        myArray.add(0);
        System.out.println("initial array: " + myArray.toString());

        myArray.remove(2);
        System.out.println("element removed/condition: " + myArray.toString());

        myArray.addNew(2);
        System.out.println("element added/condition: " + myArray.toString());

        System.out.println("if array contains specific: " + myArray.contains(2));

        System.out.println("find number by it's index: " + myArray.get(2));

        myArray.getMax();
        myArray.getMin();
        myArray.getAverage();
    }
}

