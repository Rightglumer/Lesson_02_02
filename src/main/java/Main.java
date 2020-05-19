public class Main {

    public static void main(String[] args) {
        String[][] myArray;

        // MyArraySizeException
        //myArray = new String[][] { {"1", "2", "3", "4"}, {"5", "6", "7", "8"} };

        // MyArrayDataException
        //myArray = new String[][] { {"1a", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"} };

        // Correct array
        myArray = new String[][] { {"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"} };

        try {
            int result = calcArray(myArray);
            System.out.println("Result is " + result);
        }
        catch (Exception e) {
            System.out.println("Error while calculating.");
        }
    }

    public static int calcArray(String[][] inputArray) throws Exception {
        int sumValue = 0;
        try {
            if (inputArray.length != 4 || inputArray[0].length != 4) {
                throw new MyArraySizeException("Array should by 4 x 4.", inputArray.length, inputArray[0].length);
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (!inputArray[i][j].matches("-?\\d+")) {
                        throw new MyArrayDataException("Value not is integer.", inputArray[i][j]);
                    }
                    sumValue += Integer.valueOf(inputArray[i][j]);
                }
            }
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage() + " " + e.getCurrentSize());
            throw new Exception();
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage() + " " + e.getCurrentValue());
            throw new Exception();
        }
        return sumValue;
    }
}
