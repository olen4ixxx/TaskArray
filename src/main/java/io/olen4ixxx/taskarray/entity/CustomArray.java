package io.olen4ixxx.taskarray.entity;

import io.olen4ixxx.taskarray.exception.CustomArrayException;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int getElement(int index) throws CustomArrayException {
        if (index < 0 || index >= array.length) {
            throw new CustomArrayException("Index Out Of Bounds");
        }
        return array[index];
    }

    public void setElement(int index, int value) throws CustomArrayException {
        if (index < 0 || index >= array.length) {
            throw new CustomArrayException("Index Out Of Bounds");
        }
        this.array[index] = value;
    }

    public boolean isEmpty() {
        return this.getArray().length <= 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CustomArray otherArray = (CustomArray) obj;
        return Arrays.equals(otherArray.getArray(), array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}
