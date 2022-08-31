import java.util.Scanner;
import java.util.Arrays;
 
public class BinarySearch {
public static void main(String[] args) {
    //create an ArrayList object
    int arrayList[],num,counter,item;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of elements of Array");
    num = input.nextInt();
    arrayList = new int[num];
    System.out.println("Enter " + num + " integers");
    for (counter = 0; counter < num; counter++)
          arrayList[counter] = input.nextInt();
    System.out.println("Enter the value that you want to search :");
    item = input.nextInt();
    input.close();
    Arrays.sort(arrayList);
    System.out.printf(Arrays.toString(arrayList));  
    int index = Arrays.binarySearch(arrayList, + item);
    System.out.println("\nElement found at : " + index);
  }
}
