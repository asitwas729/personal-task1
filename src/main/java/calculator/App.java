package calculator;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요(양의 정수): ");
    // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
    int number1 = sc.nextInt();
    System.out.print("두 번째 숫자를 입력하세요(양의 정수): ");
    // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
    int number2 = sc.nextInt();
    System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
    String FBO1 = sc.next();    // FBO : Four Basic Operations
    char FBO2 = FBO1.charAt(0);
    // 결과값 저장
    int result = 0;
    //입력값 양의 정수인지 판별
    if (number1 < 0) {
      System.out.println("첫번째 숫자가 양의 정수가 아닙니다.");
    } else if (number2 < 0) {
      System.out.println("두번째 숫자가 양의 정수가 아닙니다.");
    } else {
      if (FBO2 == '+') {
        result = number1 + number2;
      } else if (FBO2 == '-') {
        result = number1 - number2;
      } else if (FBO2 == '*') {
        result = number1 * number2;
      } else if (FBO2 == '/') {
        result = number1 / number2;
      } else {
        System.out.println("사칙연산 기호를 잘못 입력하셨습니다.");
      }
      // 입력받은 연산 기호 구분
      System.out.println("결과: " + result);
      System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
      String end = sc.next();


      if(end != "exit"){
          System.out.print("첫 번째 숫자를 입력하세요(양의 정수): ");
          number1 = sc.nextInt();
          System.out.print("두 번째 숫자를 입력하세요(양의 정수): ");
          number2 = sc.nextInt();
          System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
          FBO1 = sc.next();
          FBO2 = FBO1.charAt(0);
          // 결과값 저장
          // 입력값 양의 정수인지 판별
            if (number1 < 0) {
              System.out.println("첫번째 숫자가 양의 정수가 아닙니다.");
            } else if (number2 < 0) {
              System.out.println("두번째 숫자가 양의 정수가 아닙니다.");
            } else {  // 입력받은 연산 기호 구분
              if (FBO2 == '+') {
                result = number1 + number2;
              } else if (FBO2 == '-') {
                result = number1 - number2;
              } else if (FBO2 == '*') {
                result = number1 * number2;
              } else if (FBO2 == '/') {
                result = number1 / number2;
              } else {
                System.out.println("사칙연산 기호를 잘못 입력하셨습니다.");
              }
              System.out.println("결과: " + result);
              System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
              end = sc.next();
              }
        } else if(end == "exit"){
          System.exit(0);
      }
    }
  }
}