package calculator;

import java.util.Scanner;

public class App_ {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요: ");
    int firstNumber = sc.nextInt();
    System.out.print("두 번째 숫자를 입력하세요: ");
    int secondNumber = sc.nextInt();
    System.out.println(firstNumber + " " + secondNumber);
    System.out.print("사칙연산 기호를 입력하세요: ");
    char FBO = sc.next().charAt(0);
    System.out.println(FBO);

    int result = 0;

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


  }
}
