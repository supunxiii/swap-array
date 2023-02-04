import java.util.Scanner;
public class swapArr{
  public static void main(String []args){
    Scanner userinput = new Scanner(System.in);
    double[] numbers = new double[]{13.3, 16.1, 666.6, 310.23, 113.33, 16.1,
    61.16, 613.6, 23.13, 13.31, 1776.61, 23.27, 1999.111, 991199.23, 61.9996,
  13.616, 99.116, 13.63, 1919.1776, 13.1999};
  int temp = 0, i, j;
  System.out.println("Before swapping: ");
  for(int x = 0; x < numbers.length; x++){
    System.out.print(numbers[x]+ " ");
  }
  System.out.println();
  System.out.println("Enter the first position you wanna swap: ");
  i = userinput.nextInt();
  System.out.println("Enter the second position you wanna swap: ");
  j = userinput.nextInt();
  System.out.println();
  double valCast = temp;
  valCast = numbers[i];
  numbers[i] = numbers[j];
  numbers[j] = valCast;

  System.out.println("After the swapping: ");
  for(int x = 0; x < numbers.length; x++){
    System.out.println(numbers[x]+ " ");
  }
  }
}
