import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class Solution1
{

  public static String solution(String S) {


    StringBuilder rev = new StringBuilder();

    rev.append(S);

    rev = rev.reverse();

    System.out.println(rev);

    return rev.toString();


    // write your code in Java SE 8
  }
  public static void main(String[] args)
  {
    String input = "Hello";

    String output = solution(input);

  }
}
