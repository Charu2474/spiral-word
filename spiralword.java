import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        String str=sh.nextLine();
        int len=str.length();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(i==0)
                {
                    System.out.print(str.charAt(j)+" ");
                }
                else if(i==len-1)
                {
                     System.out.print(str.charAt(len-1-j)+" ");
                }
                else if(j==0)
                {
                     System.out.print(str.charAt(i)+" ");

                }
                else if(j==len-1)
                {
                    System.out.print(str.charAt(len-1-i)+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
