"import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  String time = sc.nextLine();  
  System.out.println(time);
  
  /* 배열과 split 으로 코드 작성 해보기
  String[] time = sc.next().split("":"");
  System.out.println(time[0] + "":"" + time[1]);
  
  // printf 로도 작성 해보기
  System.out.printf(""%s:%s"", time[0], time[1]);
  */
  
  sc.close();
 }

}"
