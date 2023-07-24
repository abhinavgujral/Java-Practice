package Ankush_DSA_Repo;

import java.util.Scanner;

/*
## **Binary Representation to Number**
Given a binary string, output the integer so formed.

__Note__: Output the number so formed after converting the binary representation to the Integer

#### **Sample Input**
    00000000000000000000000000000111
#### **Sample Output**
    7
#### **Sample Explanation**
    Self Explanatory
#### **Expected Time Complexity**
__O__(1), constant time complexity
#### **Expected Space Complexity**
__O__(1), constant space complexity

#### **Constraints**
    1<= length of binary string <= 32

 */
public class BInaryRepresentation_to_Number {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str= sc.next();
    int num=0;
    int power=0;
    for(int i =31;i>=0;i--){
        int digit=str.charAt(i)-'0';
        num+= Math.pow(2,power++)*digit;
    }
        System.out.println(num);
    }
}
