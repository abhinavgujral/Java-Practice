package Ankush_DSA_Repo;

import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

/*
## **Balanced parenthesis**
Given a string S having N characters. Any of the characters of the string are either of '(', '{', '[', ')', '}', ']'.
Check whether the pairs and the orders of '{', '}', '(', ')', '[', ']' are correct or not.


#### **Sample Input**
	input: N = 6
	S :


#### **Sample Output**
	A: -"Yes"

#### **Sample Input**
	input: N = 4
	S : [(])

#### **Sample Output**
	A: -"No"

#### **Sample Explanation**
Self explanatory.

#### **Expected Time Complexity**
__O__(N), where N is the size of the string S.

#### **Expected Space Complexity**
__O__(N), where N is the size of the string S.

#### **Constraints**
	1 <= N <= 100000
 */
public class BalancedParentesis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        String str= sc.next();
        Stack<Character> stack = new Stack<>();
        boolean flag=false;
        for(int i =0;i<n;i++){
            if((str.charAt(i)==')')||(str.charAt(i)==']')||(str.charAt(i)=='}')){
            if(stack.isEmpty())
                break;
            else
            {
                char stackTop= stack.peek();
                if((stackTop=='{'&&str.charAt(i)=='}')
                        ||(stackTop=='('&&str.charAt(i)==')')
                        ||(stackTop=='['&&str.charAt(i)==']')) {
                    stack.pop();
                }
                else break;
            }

            }
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
                stack.push(str.charAt(i));
            }
        }
        if(stack.empty())
            System.out.println("Yes");
        else System.out.println("No");


    }
}

