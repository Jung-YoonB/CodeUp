"import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  String[] dNum = sc.next().split(""\\.""); 
        
  System.out.println(dNum[0]);
  System.out.println(dNum[1]);

  sc.close();
 }

}"
