package calculator;

import java.util.ArrayList;

public class Calculator {
  ArrayList<Integer> resultList = new ArrayList<Integer>();
  public int Calculate(int a, int b, char c){
    int result = 0;
    if(c == '+'){
      result = a + b;
      resultList.add(result);
      System.out.println(resultList.toString());
    } else if(c == '-'){
      result = a - b;
      resultList.add(result);
    } else if(c == '*'){
      result = a * b;
      resultList.add(result);
    } else if(c == '/'){
      if(b != 0){
        result = a / b;
        resultList.add(result);
      } else {
        System.out.println("나눗셈에서 분모에 0을 넣을수는 없습니다.");
      }
    }else{
      System.out.println("사칙연산기호를 잘못입력하셨습니다.");
    }
    return result;
  }
  public void answer(String answer){
    System.out.println("입력값 : "+answer);
    if(answer.equals("remove")){
      resultList.remove(0);
    } else if(answer.equals("inquiry")){
      for(int inquiry : resultList){
        System.out.print(inquiry + " ");
      }
    } else if(answer.equals("exit")){
      System.out.println("종료 됩니다.");
      System.exit(0);   // 자바 시스템 종료 구문
    }
  }
}
