//Method returns a new array 
//Eliminating the duplicate values in the array

import java.util.Scanner;

public class Duplicate {
  //Main Method 
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

  //Input Array with a length of 10
    int[] values = new int[10];

  //Prompt the user to enter 10 values
    System.out.print("Enter ten values: ");
    for (int i = 0; i < values.length; i++)
      values[i] = input.nextInt();

  //Distinct numbers
    int[] distinctValues = eliminateDuplicates(values);

  //Display the new array
    System.out.print("The distinct values are: ");
    for (int e: distinctValues){
      if (e > 0)
        System.out.print(" " + e);
    }

    System.out.println();
  }

  //Elimination method
  public static int[] eliminateDuplicates(int[] list) {
    int [] distinctList = new int[list.length];
    int i = 0;
    for (int e: list) {
      if (linearSearch(distinctList, e) == -1) {
        distinctList[i] = e;
        i++;
      }
    }
    return distinctList;
  }
  //Linear Search
  public static int linearSearch(int[] array, int key) {
    for (int i = 0; i < array.length; i++) {
      if (key == array[i])
      return i;
    }
    return -1;
  }
}