public class MyArraySizeException extends Exception{
    int row;
    int col;

    public MyArraySizeException(String message, int row, int col) {
        super(message);
        this.row = row;
        this.col = col;
    }

    public String getCurrentSize() {
        return "Current size is [" + row + "][" + col + "].";
    }
}
