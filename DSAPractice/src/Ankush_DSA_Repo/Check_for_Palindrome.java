package Ankush_DSA_Repo;

import java.util.Scanner;

/*
## **Check for palindrome**
Given a string of length N. Check if the given string is a palindrome without using any built-in
functionality.

#### **Sample Input**
	input: N = 9, string: malayalam

#### **Sample Output**
	Output: Yes

#### **Sample Input**
	input: N = 5, string: masai

#### **Sample Output**
	Output: No

#### **Sample Explanation**
Self explanatory.

#### **Expected Time Complexity**
__O__(N), where N is the size of the string

#### **Expected Space Complexity**
__O__(1), i.e., constant space complexity.

#### **Constraints**
	1 <= N <= 100000
 */
public class Check_for_Palindrome {
    public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();
   String str= sc.next();
  int start=0,end=str.length()-1;
  boolean flag= true;
  while(start<=end) {
      if (str.charAt(start) != str.charAt(end)) {
          flag = false;
          break;
      }
      start++;
      end--;
  }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
