"import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  String[] date = sc.next().split(""\\.""); 
  
  int year = Integer.valueOf(date[0]);
  int month = Integer.valueOf(date[1]);
  int day = Integer.valueOf(date[2]);
    
  System.out.printf(""%02d-%02d-%04d"", day, month, year);

  sc.close();
 }

}"
