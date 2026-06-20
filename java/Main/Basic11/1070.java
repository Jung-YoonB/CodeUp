import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
    
  int month = sc.nextInt();
    
  switch(month) {
  
  case 1 : case 2 : case 12 :
   System.out.println(""winter"");
  break;
  
  case 3 : case 4 : case 5 :
   System.out.println(""spring"");
  break;
  
  case 6 : case 7 : case 8 :
   System.out.println(""summer"");
  break;
  
  case 9 : case 10 : case 11 :
   System.out.println(""fall"");
  break;
  
  default : System.out.println(""1 ~ 12 사이의 숫자만 입력 해 주세요."");
  }
  
  
  sc.close();
      
 }
