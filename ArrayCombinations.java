public class ArrayCombinations {
    public static void printCombinations(int[] arr1, int[] arr2) {
        for (int i : arr1) {
            for (int j : arr2) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        printCombinations(arr1, arr2);
    }
}
