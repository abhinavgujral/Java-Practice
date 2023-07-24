package Ankush_DSA_Repo;

import java.util.Scanner;

/*
## **Bubble sort**
Given an array A having N positive integers. Sort the array A using bubble sort.

#### **Sample Input**
	input: N = 5
	A : 5 1 6 3 7

#### **Sample Output**
	A: 1 3 5 6 7

#### **Sample Explanation**
Self explanatory.

#### **Expected Time Complexity**
__O__(N*N)

#### **Expected Space Complexity**
__O__(1), i.e., constant space complexity.

#### **Constraints**
	1 <= N <= 1000
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++)
            arr[i]=sc.nextInt();

        for(int i  =0;i<n;i++){
            for(int j=0;j<n-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         for(int i :arr)
             System.out.print(i+" ");
    }
}
