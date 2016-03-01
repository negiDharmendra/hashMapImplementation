import static java.lang.System.arraycopy;

public class MyArray<T> {
    private Object[] list;
    private int nextIndex = -1;
    private int size;

    public MyArray(int size) {
        this.list = new Object[size];
        this.size = size;
        nextIndex = 0;
    }

    public int getLength() {
        return nextIndex;
    }

    public int add(T element) {
        if (checkArraySize())
            throw new IndexOutOfBoundsException(indexOutOfBoundMessage());
        list[nextIndex] = element;
        nextIndex++;
        return nextIndex;
    }

    private String indexOutOfBoundMessage() {
        return "Index is "+nextIndex+" and size is "+size;
    }

    private boolean checkArraySize() {
        return getLength() == getSize();
    }

    public int getSize() {
        return size;
    }

    public void resizeArray(int newSize) {
        if(confirmMaximumSizeOfArray(newSize))
            throw new ArrayIndexOutOfBoundsException(arrayIndexOutOfBoundMessage(newSize));
        Object [] newList = new Object[newSize];
        arraycopy( list, 0,  newList, 0, nextIndex);
        maintainArraySizeInfo(newSize);
        list = newList;
    }
    private String arrayIndexOutOfBoundMessage(int newSize) {
        return "Maximum Size is "+Integer.MAX_VALUE+" and size to be grown is "+newSize;
    }

    private boolean confirmMaximumSizeOfArray(int newSize) {
        return newSize==Integer.MAX_VALUE;
    }

    private void maintainArraySizeInfo(int newSize) {
        size = newSize;
    }
}
