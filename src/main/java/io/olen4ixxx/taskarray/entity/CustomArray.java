package io.olen4ixxx.taskarray.entity;

import io.olen4ixxx.taskarray.exception.CustomArrayException;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int... array) throws CustomArrayException {
        if (array.length < 1) {
            throw new CustomArrayException("Illegal array.txt length");
        }

        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getElement(int index) {
        return array[index];
    }

    public void setElement(int index, int number) {
        array[index] = number;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
//        StringBuilder sb = new StringBuilder();
//        for (int a:array.txt) {
//            sb.append(a).append(" ");
//        }
//        return sb.toString();
    }

}
