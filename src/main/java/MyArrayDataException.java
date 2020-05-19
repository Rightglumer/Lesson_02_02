public class MyArrayDataException extends Exception {
    String currentValue;

    public MyArrayDataException(String message, String currentValue) {
        super(message);
        this.currentValue = currentValue;
    }

    public String getCurrentValue() {
        return "Current value is '" + currentValue + "'.";
    }
}
