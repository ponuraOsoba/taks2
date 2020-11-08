import java.util.Arrays;
import java.util.stream.Stream;



public class Task2 {

    public static void main(String[] args) {
            int intsArray[] = parseIntArray(args);
            int sum = 13;
            printPairs(intsArray, sum);
        }

    private static int[] parseIntArray(String[] stringsArray) {
        return Stream.of(stringsArray).mapToInt(Integer::parseInt).toArray();
    }

    private static void printPairs(int intsArray[], int minuend) {
        int elementsNumber = intsArray.length;
        Arrays.sort(intsArray);
        for(int i = 0; i < elementsNumber; i++){
          int subtrahend = intsArray[i];
          int difference = minuend - subtrahend;
          if(difference>=subtrahend && isPresent(difference,intsArray)){
              System.out.println(subtrahend +", " +difference);
          }
        }
    }

    private static boolean isPresent(int difference, int[] intsArray) {
           return Arrays.binarySearch(intsArray,difference)>=0;
    }
}
