import java.util.HashMap;
import java.util.stream.Stream;

public class Task2 {

        public static void main(String[] args) {
            int intsArray[] = parseIntArray(args);
            int sum = 13;

            printPairs(intsArray,intsArray.length, sum);
        }

    private static int[] parseIntArray(String[] stringsArray) {
        return Stream.of(stringsArray).mapToInt(Integer::parseInt).toArray();
    }

    static void printPairs(int intsArray[], int elementsNumber, int sum) {
        HashMap<Integer, Integer> intPairMap = new HashMap<>();
        for(int i = 0; i < elementsNumber; i++){
            int subtractDifference = sum - intsArray[i];
            if (intPairMap.containsKey(subtractDifference)) {
                int count = intPairMap.get(subtractDifference);
                for(int j = 0; j < count; j++)
                    System.out.print(subtractDifference + ", " + intsArray[i] + "\n");
            }if (intPairMap.containsKey(intsArray[i])) {
                intPairMap.put(intsArray[i], intPairMap.get(intsArray[i]) + 1);
            } else {
                intPairMap.put(intsArray[i], 1);
            }
        }
    }
}
