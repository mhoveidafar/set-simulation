package com.mhoveidafar.set;

public class SetSimulation {

    int count = 0;
    Object[] array = new Object[10];    // array of objects any type - should initialize, need size

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        else {
            return false;
        }
        // one liner if-else:
        // return count == 0;
    }

    public int size() {
        return count;
    }

    public void add(Object item) {
        // to not having limitation for array size:
        if (count == array.length) {
            Object[] newArray = new Object[count+1];

            System.arraycopy(array,0, newArray, 0, count);  // copy array items to newArray

            array = newArray;
        }

        // Set does not allow duplicates: So can add item only & if only the item is not existed in the Set
        if (findIndex(item) == -1) {
            array[count] = item;
            count++;
        }
    }

    public void remove(Object item) {
        // use created helper method
        int itemIndex = findIndex(item);

        // move last item in array to the index of requested item
        array[itemIndex] = array[count-1];

        // should make last item null
        array[count-1] = null;

        // size of the list (set) is the number of non-null items
        count--;
    }

    public int findIndex(Object item) {
        for (int i = 0; i < count; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;  // -1 acts like null when requested item is not in the array
    }
}
