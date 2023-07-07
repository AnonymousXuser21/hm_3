import java.util.Arrays;
public class Main {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;


            System.out.println(Arrays.toString(arr));
        }
    }




    public static void main(String[] args) {

//        ОСНОВНОЕ ДЗ

        double[] array = {15.214, 12.42112, -2.4123, 5.21, 5.12, 88.11, -12.44, -112.22, 796.6555, -85.5, 55.5, -12.79, 54.22, -86.88, 90.67};

        double allFinalAnswer = 0;
        int counter = 0;
        boolean negativeNumber = false;


        for (double forNow : array) {


           if (!negativeNumber){
               if (forNow < 0){
                   negativeNumber = true;
               }
           }

           else{
               if (forNow > 0){
                   allFinalAnswer += forNow;
                   counter++;
               }
           }

        }

        System.out.println(allFinalAnswer / counter);


//      ДЗ НА СООБРАЗИТЕЛЬНОСТЬ

        int[] arr = {1, -2, -4, 15, -2, 2, -20, 30, 3, 6, 8};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}