package SortingAlgorithms;

public class Main {

    public static void printArray(int arr[]){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};         
        int[] arr2 = {7, 10, 4, 2, 5, 1};
        int[] arr3 = {8, 40, 6, 2, 5, 1};

        SortingAlgorithms sr = new SortingAlgorithms();
        System.out.println();       
        System.out.println("-------------------------------------------------------------");

        
        sr.bubbleSort(arr);
        System.out.println("We sorted the array using bubble sort: ");
        printArray(arr);

        System.out.println();
        System.out.println("-------------------------------------------------------------");
    

        sr.selectionSort(arr2);
        System.out.println("We sorted the array using Selection sort: ");
        printArray(arr2);

        System.out.println();
        System.out.println("-------------------------------------------------------------");
       


        sr.insertionSort(arr3);
        System.out.println("We sorted the array using Insertion sort: ");
        printArray(arr3);

        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }
}
