package Ankush_DSA_Repo;

import java.util.Scanner;

/*
## **Power of 2**
Given a positive integer N. Check if it is a power of two or not.

#### **Sample Input**
	input: N = 4

#### **Sample Output**
	Output: Yes


#### **Sample Explanation**
4 can be represented as 2*2. Hence it's prime factorisation includes no prime except 2. Hence it can be represented as a power of 2.

#### **Expected Time Complexity**
__O__(log(N)), where N is the positive integer.

#### **Expected Space Complexity**
__O__(1), i.e., constant space complexity.

#### **Constraints**
	1 <= N <= 10000000000000
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Double ans=Math.log(n)/Math.log(2);
        if(ans%1!=0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
