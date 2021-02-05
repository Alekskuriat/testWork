package packageOne;

public class testClass {
    public static void main(String[] args){
        initArray(5);
        initDimensionalArray(5,5);

    }

    private static void initArray(int varA) {
        int[] arr = new int[varA];
        for (int i = 0; i < varA; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    private static void initDimensionalArray(int varA, int varB) {

        int[][] table = new int[varA][varB];
        for (int i = 0; i < varA; i++) {
            for (int j = 0; j < varB; j++) {
                table[i][j] = (int)(Math.random()*100);
                System.out.print("arr[" + i + "," + j + "] = " + table[i][j] + "; ");
            }
            System.out.println();
        }

    }

}
