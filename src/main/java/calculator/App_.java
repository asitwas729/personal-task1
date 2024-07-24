package calculator;

import java.util.Scanner;

public class App_ {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요: ");
    long firstNumber = sc.nextLong();
    System.out.print("두 번째 숫자를 입력하세요: ");
    long secondNumber = sc.nextLong();
    System.out.println(firstNumber + " " + secondNumber);
    System.out.print("사칙연산 기호를 입력하세요: ");
    char FBO = sc.next().charAt(0);
    System.out.println(FBO);
  }
}
