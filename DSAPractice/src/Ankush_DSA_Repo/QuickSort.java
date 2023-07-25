package Ankush_DSA_Repo;

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
    public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    int[] arr= new int[n];

    for(int i =0 ;i<n; i++)
        arr[i] = sc.nextInt();


    
    }
}
