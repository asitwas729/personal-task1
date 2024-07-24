package calculator;

import java.util.Scanner;

public class App_ {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int firstNumber = 0;
    int secondNumber = 0;
    char FBO;   // 사칙연산(Four Basic Operations)
    int result = 0;   // 계산 결과
    String end = "";  // 종료의사를 물어보는 변수
    while( !end.equals("exit") ){
      System.out.print("첫 번째 숫자를 입력하세요: ");
      firstNumber = sc.nextInt();
      System.out.print("두 번째 숫자를 입력하세요: ");
      secondNumber = sc.nextInt();
      System.out.println(firstNumber + " " + secondNumber);
      System.out.print("사칙연산 기호를 입력하세요: ");
      FBO = sc.next().charAt(0);
      System.out.println(FBO);

      if((firstNumber >= 0) && (secondNumber >= 0)){
        if(FBO == '+'){
          result = firstNumber + secondNumber;
          System.out.println("결과: " + result);
        } else if(FBO == '-'){
          result = firstNumber - secondNumber;
          System.out.println("결과: " + result);
        } else if(FBO == '*'){
          result = firstNumber * secondNumber;
          System.out.println("결과: " + result);
        } else if(FBO == '/'){
          if((firstNumber > 0) && (secondNumber > 0)){
            result = firstNumber / secondNumber;
            System.out.println("결과: " + result);
          } else{
            System.out.println("나눗셈 연산에서 0이 입력될 수 없습니다.");
          }
        } else {
          System.out.println("사칙연산 부호를 잘못 입력하셨습니다.");
        }
      } else{
        System.out.println("양의 정수를 입력해주세요.");
      }
      System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
      end = sc.next();
    }
      System.out.println("종료 됩니다.");
      System.exit(0);   // 자바 시스템 종료 구문






  }
}
