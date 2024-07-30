package calculator;

import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Calculator 인스턴스 생성
    Calculator calculator = new Calculator();


    Scanner sc = new Scanner(System.in);
//    int result = 0;   // 계산 결과
    String answer = ""; //의사를 물어보는 변수
    //int[] resultArray = new int[3]; // 연산결과 10개를 저장할 수 있는 배열 선언
//    int count = 0;  // 배열 저장개수를 확인하기 위해 저장
//    ArrayList<Integer> resultList = new ArrayList<Integer>();
    while( !answer.equals("exit") ){
      System.out.print("첫 번째 숫자를 입력하세요: ");
      int num1 = sc.nextInt();
      System.out.print("두 번째 숫자를 입력하세요: ");
      int num2 = sc.nextInt();
      System.out.println("입력한 값: "+num1 + " " + num2);
      System.out.print("사칙연산 기호를 입력하세요: ");
      char operator = sc.next().charAt(0);
      System.out.println(operator);


  //1-6 주석처리
//      if((firstNumber >= 0) && (secondNumber >= 0)){
//        if(FBO == '+'){
//          result = firstNumber + secondNumber;
  //          if(count >= 3){
  //            count = 0;
  //            resultArray[count] = 0;
  //            resultArray[count] = result;
  //            System.out.println("count가 3이상인 경우 : " + count);
  //            count++;
  //          } else{
  //              if( resultArray[count] != 0){
  //                System.out.println("배열에 값이있는 경우 : "+resultArray[count]);
  //                resultArray[count] = 0;
  //                System.out.println("배열값 0으로 변경 : " +resultArray[count]);
  //                resultArray[count] = result;
  //                System.out.println("입력값을 비어진 배열에 넣었음 : "+resultArray[count]);
  //                count++;
  //                System.out.println("카운트값 : " +count);
  //              } else{
  //                System.out.println("배열값X,count3미만 결과: " + result + ", " + count);
  //                resultArray[count] = result;
  //                count++;
  //
  //              }
  //            }
//
//
//
//
//        } else if(FBO == '-'){
//          result = firstNumber - secondNumber;
//          if(count >= 3){
//            count = 0;
//            resultArray[count] = 0;
//            resultArray[count] = result;
//            System.out.println("count가 3이상인 경우 : " + count);
//            count++;
//          } else{
//            if( resultArray[count] != 0){
//              System.out.println("배열에 값이있는 경우 : "+resultArray[count]);
//              resultArray[count] = 0;
//              System.out.println("배열값 0으로 변경 : " +resultArray[count]);
//              resultArray[count] = result;
//              System.out.println("입력값을 비어진 배열에 넣었음 : "+resultArray[count]);
//              count++;
//              System.out.println("카운트값 : " +count);
//            } else{
//              System.out.println("배열값X,count3미만 결과: " + result + ", " + count);
//              resultArray[count] = result;
//              count++;
//            }
//          }
//        } else if(FBO == '*'){
//          result = firstNumber * secondNumber;
//          if(count >= 3){
//            count = 0;
//            resultArray[count] = 0;
//            resultArray[count] = result;
//            System.out.println("count가 3이상인 경우 : " + count);
//            count++;
//          } else{
//            if( resultArray[count] != 0){
//              System.out.println("배열에 값이있는 경우 : "+resultArray[count]);
//              resultArray[count] = 0;
//              System.out.println("배열값 0으로 변경 : " +resultArray[count]);
//              resultArray[count] = result;
//              System.out.println("입력값을 비어진 배열에 넣었음 : "+resultArray[count]);
//              count++;
//              System.out.println("카운트값 : " +count);
//            } else{
//              System.out.println("배열값X,count3미만 결과: " + result + ", " + count);
//              resultArray[count] = result;
//              count++;
//            }
//          }
//        } else if(FBO == '/'){
//          if((firstNumber > 0) && (secondNumber > 0)){
//            result = firstNumber / secondNumber;
//            if(count >= 3){
//              count = 0;
//              resultArray[count] = 0;
//              resultArray[count] = result;
//              System.out.println("count가 3이상인 경우 : " + count);
//              count++;
//            } else{
//              if( resultArray[count] != 0){
//                System.out.println("배열에 값이있는 경우 : "+resultArray[count]);
//                resultArray[count] = 0;
//                System.out.println("배열값 0으로 변경 : " +resultArray[count]);
//                resultArray[count] = result;
//                System.out.println("입력값을 비어진 배열에 넣었음 : "+resultArray[count]);
//                count++;
//                System.out.println("카운트값 : " +count);
//              } else{
//                System.out.println("배열값X,count3미만 결과: " + result + ", " + count);
//                resultArray[count] = result;
//                count++;
//              }
//            }
//          } else{
//            System.out.println("나눗셈 연산에서 0이 입력될 수 없습니다.");
//          }
//        } else {
//          System.out.println("사칙연산 부호를 잘못 입력하셨습니다.");
//        }
 //     }
      if((num1 >= 0) && (num2 >= 0)){
        calculator.Calculate(num1, num2, operator);
//        if(FBO == '+'){
//          result = firstNumber + secondNumber;
//          System.out.println("결과: "+result);
//          resultList.add(result);
//        } else if(FBO == '-'){
//          result = firstNumber - secondNumber;
//          resultList.add(result);
//        } else if(FBO == '*'){
//          result = firstNumber * secondNumber;
//          resultList.add(result);
//        } else if(FBO == '/'){
//            if(!(secondNumber == 0)){
//              result = firstNumber / secondNumber;
//              resultList.add(result);
//            }else {
//              System.out.println("나눗셈 연산에서 0이 입력될 수 없습니다.");
//            }
//        }
      } else{
        System.out.println("양의 정수를 입력해주세요.");
      }
      System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) ");
      calculator.answer(sc.next());
      System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
//      calculator.answer(sc.next());
      if(answer.equals("inquiry")){
        List<Integer> currentResult = calculator.getResultList();
        for(int results: currentResult){
          System.out.println(results+ " ");
        }
      }
      System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
      calculator.answer(sc.next());
    }
  }
}
