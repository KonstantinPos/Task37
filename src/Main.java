public class Main {
    public static void main(String[] args) {
        int arr[] = new int[8];

        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 10) + 1;
            arr[i] = a;
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
