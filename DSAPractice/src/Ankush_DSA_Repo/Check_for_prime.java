package Ankush_DSA_Repo;

import java.util.Scanner;

/*
## **Check for prime**
Given an integer N. Check whether N is prime or not.

#### **Sample Input**
	input: N = 10

#### **Sample Output**
	Output: No

#### **Sample Input**
	input: N = 7

#### **Sample Output**
	Output: Yes

#### **Sample Explanation**
Self explanatory.

#### **Expected Time Complexity**
__O__(sqrt{N})

#### **Expected Space Complexity**
__O__(1), i.e., constant space complexity.

#### **Constraints**
	1 <= N <= 1000000000
 */
public class Check_for_prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        for(int i =2;i<Math.sqrt(num);i++){
            if(num%i==0) {
                System.out.println("No");
                break;
            }
        }
        System.out.println("Yes");
    }
}
