public class Search {
    public static int findMaxElement(int[] array) {
        int maxNumber = array[0];
        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
}
