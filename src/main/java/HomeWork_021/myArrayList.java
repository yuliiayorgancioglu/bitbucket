package HomeWork_021;

/* Implement a custom collection of integers that allows to:
* add, when adding a new element, increase the value of each arrays element by the value of the new one.
* delete, when removing element, decrease the value of each arrays element by the value of the removed one.
* find element by value
* find element by index
* find maximum
* find minimum
* find average value of elements

  NOTE: Invalid imput for NULL and other characters but integers */

import java.util.ArrayList;

public class myArrayList extends ArrayList<Integer> {

    @Override
    public boolean add(Integer ınteger) {
        if (ınteger != null) {
            super.add(ınteger);
        }
        return true;
    }

    public boolean remove(Integer ınteger) {
        super.remove(ınteger);
        for (int i = 0; i < super.size(); i++) {
            int oldValue = super.get(i);
            int newValue = oldValue - ınteger;
            super.set(i, newValue);
        }
        return true;
    }

    public boolean addNew(Integer ınteger) {
        if (ınteger != null) {
            super.add(ınteger);
            for (int i = 0; i < super.size() - 1; i++) {
                int oldValue = super.get(i);
                int newValue = oldValue + ınteger;
                super.set(i, newValue);
            }
        }
        return true;
    }

    public void getMax() {
        Integer max = super.get(1);
        for (int i = 1; i < super.size(); ++i) {
            if (super.get(i) > max) {
                max = super.get(i);
            }
        }
        System.out.println("max value in array: " + max);
    }

    public void getMin() {
        Integer min = super.get(1);
        for (int i = 0; i < super.size(); ++i) {
            if (super.get(i) < min) {
                min = super.get(i);
            }
        }
        System.out.println("min value in array: " + min);
    }

    public void getAverage() {
        Integer sum = 0;
        for (int i = 0; i < super.size(); ++i) {
            sum = (sum + super.get(i));

        }
        System.out.println("average value of array elements: " + (double) sum / super.size());
    }
}


