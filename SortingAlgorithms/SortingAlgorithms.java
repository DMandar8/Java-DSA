package SortingAlgorithms;

public class SortingAlgorithms {

    public int[] bubbleSort(int arr[]){   
        //Ascending order Bubble Sort....// Time Complexity: O(n^2)

        int size = arr.length;

        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        return arr;

    }


    public int[] selectionSort(int arr[]){
        //Ascending order Selection Sort....// Time Complexity: O(n^2)
        int n = arr.length;

        for(int i=0; i<n-1; i++){

            int smallest = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }

        return arr;
    }

    public int[] insertionSort(int[] arr){
        
        //Ascending order Selection Sort....// Time Complexity: O(n^2)

        int n = arr.length;

        for(int i=1; i<n; i++){
           int key = arr[i];
           int j = i-1;

           while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
           }

           arr[j+1] = key;
        }

        return arr;
    }

   
}
