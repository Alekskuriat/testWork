package packageOne;

public class testClass {
    public static void main(String[] args){
        initArray(17);

    }

    private static void initArray(int varA) {
        int[] arr = new int[varA];
        for (int i = 0; i < varA; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

}
