package calculator;

import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // 인스턴스 생성
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
    CircleCalculator circleCalculator = new CircleCalculator();
    Scanner sc = new Scanner(System.in);
    String answer = ""; //의사를 물어보는 변수
    String areaAnswer = "";

    System.out.print("사칙연산은 1을 입력하고, 원의 넓이는 2를 입력하세요 : ");
    int choose = sc.nextInt();
    if(choose == 1){
      while( !answer.equals("exit") ){
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.println("입력한 값: "+num1 + " " + num2);
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);
        System.out.println(operator);

        if((num1 >= 0) && (num2 >= 0)){
          arithmeticCalculator.Calculate(num1, num2, operator);
        } else{
          System.out.println("양의 정수를 입력해주세요.");
        }
        System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) ");
        arithmeticCalculator.answer(sc.next());
        System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
        if(answer.equals("inquiry")){
          List<Integer> currentResult = arithmeticCalculator.getResultList();
          for(int results: currentResult){
            System.out.println(results+ " ");
          }
        }
        System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        arithmeticCalculator.answer(sc.next());
      }
    } else if(choose == 2){
        while(!areaAnswer.equals("exit")){
          System.out.print("원의 반지름을 입력: ");
          double result = circleCalculator.calculateCircleArea(sc.nextInt());
          System.out.println("원의 넓이는 "+result+"입니다.");
          System.out.print("저장된 원의 넓이를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
          if(areaAnswer.equals("inquiry")){
            List<Double> currentAreaResult = circleCalculator.getAreaResult();
            for(double i: currentAreaResult){
              System.out.println(i + " ");
            }
          }
          circleCalculator.areaAnswer(sc.next());
          System.out.print("가장 먼저 저장된 원의 넓이를 삭제하시겠습니까? (remove 입력 시 삭제) ");
          circleCalculator.areaAnswer(sc.next());
          System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
          circleCalculator.areaAnswer(sc.next());
        }
    } else {
      System.out.println("1과 2중 하나를 입력해주세요.");
    }



  }
}
