package Ankush_DSA_Repo;

import java.util.Scanner;

/*
## **Fizz Buzz**
Given an integer N. Print the numbers from 1 to N and for multiples of ‘3’ print “Fizz” instead of the number,
 for the multiples of ‘5’ print “Buzz” and for multiples of both 5 and 3 print "FizzBuzz"

#### **Sample Input**
	input: N = 10

#### **Sample Output**
	Output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz

#### **Sample Explanation**
Self explanatory.

#### **Expected Time Complexity**
__O__(N)

#### **Expected Space Complexity**
__O__(1), i.e., constant space complexity.

#### **Constraints**
	1 <= N <= 100000
 */
public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
for(int i =1;i<=num;i++) {
    if (i % 3 == 0 && i % 5 == 0)
        System.out.print("FizzBuzz ");
    else if (i % 3 == 0)
        System.out.print("Fizz ");
    else if (i % 5 == 0)
        System.out.print("Buzz ");
    else
        System.out.print(i + " ");
}
    }
}
