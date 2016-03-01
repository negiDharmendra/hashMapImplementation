import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayTest {
    @Test
    public void testGetLengthGivesCurrentSizeOfArray() {
        MyArray<Object> myArray = new MyArray<>(4);
        assertEquals(4, myArray.getSize());
    }

    @Test
    public void testGetLengthGivesCurrentCountOfTheElementInTheArray() {
        MyArray<Object> myArray = new MyArray<>(4);
        assertEquals(0, myArray.getLength());
    }

    @Test
    public void testAddAllowsToInsertAnElementIntoArray() {
        MyArray<Object> myArray = new MyArray<>(1);
        assertEquals(1, myArray.add(43));
    }

    @Test
    public void testAddThrowsExceptionWhenElementIsBeingAddOutSideTheArrayIndex() {
        MyArray<Object> myArray = new MyArray<>(1);
        assertEquals(1, myArray.add(43));
        try {
            myArray.add(44);
        } catch (IndexOutOfBoundsException err) {
            assertEquals(err.getMessage(), "Index is 1 and size is 1");
        }
    }

    @Test
    public void testResizeArrayIncreasesArraySizeToTheGivenSize() {
        MyArray<Object> myArray = new MyArray<>(1);
        assertEquals(1, myArray.add(43));
        myArray.resizeArray(10);
        assertEquals(10, myArray.getSize());
    }

    @Test
    public void testResizeArrayThrowExceptionWhenArrayIsBeingResizedUpToMaximumLimit() {
        MyArray<Object> myArray = new MyArray<>(1);
        int newSize = Integer.MAX_VALUE;
        try {
            myArray.resizeArray(newSize);
        } catch (IndexOutOfBoundsException err) {
            assertEquals(err.getMessage(), "Maximum Size is "+Integer.MAX_VALUE+" and size to be grown is "+newSize);
        }
    }
}