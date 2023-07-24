package Ankush_DSA_Repo;
/*
## **Binary Representation of a Number**
Write a program to print Binary representation of a given number.


#### **Sample Input**
    N = 7

#### **Sample Output**
    00000000000000000000000000000111
#### **Sample Explanation**
    Self Explanatory
#### **Expected Time Complexity**
__O__(1), constant time complexity
#### **Expected Space Complexity**
__O__(1), constant space complexity

#### **Constraints**
    0<= N <= (2^32)-1

 */

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Representation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int[] arr = new int[32];
        Arrays.fill(arr,0);
        int len = arr.length-1;
        while(num > 0){
            int temp = num % 2;
            arr[len] = temp;
            len--;
            num = num/2;
        }
        StringBuffer str= new StringBuffer();
        for(int i :arr){
            str.append(i);
        }
        System.out.println(str.toString());
    }
}
