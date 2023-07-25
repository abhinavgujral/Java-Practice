package Ankush_DSA_Repo;


import java.util.Arrays;
import java.util.Scanner;


/*
## **Sort Using Quick Sort**
Given an input array, sort the array using Quick Sort

__Note__: Implement Quick Sort

#### **Sample Input**
    N = 6
    arr[] = { 2, 6, 3, 0, 4, 1 }
#### **Sample Output**
    Sorted Array: 0 1 2 3 4 6

#### **Sample Explanation**
    Self Explanatory

#### **Expected Time Complexity**
N: size of array

__O__(N*logN), Average Case
__O__(N^2), Worst Case
#### **Expected Space Complexity**
__O__(logN), Average Case
__O__(N), Worst case

#### **Constraints**
    1<= N <= 10^5

 */
public class QuickSort {



    public static void QuickSort(int[] arr, int start, int end){
        if(start>=end)
            return;
        int pivot=start+(end-start)/2;
        int low=start;
        int high=end;
        while(low<=high){
            while(arr[low]<pivot)   // inc the start until we find ele> pivot ele
                low++;
            while(arr[high]>pivot)  // // dec the end until we find ele< pivot ele
                high--;

            if(low<=high){                       // since we have pointer to elements which are at the wrong sides we can swap
                int temp= arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;high--;
            }
        }
        QuickSort(arr,start,high);
        QuickSort(arr,low,end);
    }

    public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr= new int[n];

    for(int i =0 ;i<n; i++)
        arr[i] = sc.nextInt();

           QuickSort(arr,0,n-1);
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));




    }
}
/*
6
2 6 3 0 4 1
 */