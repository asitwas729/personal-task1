package calculator;


import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char FBO;
    String end = "";
    while(true){
      System.out.print("첫 번째 숫자를 입력하세요(양의 정수): ");
      // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
      int number1 = sc.nextInt();
      System.out.print("두 번째 숫자를 입력하세요(양의 정수): ");
      // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
      int number2 = sc.nextInt();
      System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
      // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
      String beforeFBO = sc.nextLine();    // FBO : Four Basic Operations
      System.out.println(beforeFBO);
      FBO = beforeFBO.charAt(0);
      System.out.println(FBO);

      // 결과값 저장
      int result = 0;
      //입력값 양의 정수인지 판별
      if (number1 < 0) {
        System.out.println("첫번째 숫자가 양의 정수가 아닙니다.");
      } else if (number2 < 0) {
        System.out.println("두번째 숫자가 양의 정수가 아닙니다.");
      } else {
        if (FBO == '+') {
          result = number1 + number2;
        } else if (FBO == '-') {
          result = number1 - number2;
        } else if (FBO == '*') {
          result = number1 * number2;
        } else if (FBO == '/') {
          result = number1 / number2;
        } else {
          System.out.println("사칙연산 기호를 잘못 입력하셨습니다.");
        }
        // 입력받은 연산 기호 구분
        System.out.println("결과: " + result);
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        end = sc.nextLine();
      if(end.equals("exit")){
        break;
      }
    }

      System.exit(0);
    }
  }
}