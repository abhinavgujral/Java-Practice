package Ankush_DSA_Repo;

import java.util.Arrays;
import java.util.Scanner;

/*
## **Check for anagrams**
Check whether two given strings X and Y of sizes N and M respectively are anagram of each other or not.

#### **Sample Input**
	input: N = 4, X = abcd, M = 4, Y = dacb

#### **Sample Output**
	Output: Yes

#### **Sample Explanation**
All the characters of string "abcd" is present in "dacb" and in same frequencies. Hence both are anagram of each other.

#### **Expected Time Complexity**
__O__(NLog(N)), where N is the lenght of the given string

#### **Expected Space Complexity**
__O__(1), i.e., constant space complexity.

#### **Constraints**
	1 <= N,M <= 100000
 */
public class Check_for_anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String x = sc.next();
        int M = sc.nextInt();

        String y = sc.next();
        if (N != M)
            System.out.println("No");
        else {
            char[] str1 = x.toCharArray();
            char[] str2 = y.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if (str1[i] != str2[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
