package calculator;

public class Calculator {
  public int Calculate(int a, int b, char c){
    int result = 0;
    if(c == '+'){
      result = a + b;
    } else if(c == '-'){
      result = a - b;
    } else if(c == '*'){
      result = a * b;
    } else if(c == '/'){
      if(b != 0){
        result = a / b;
      } else {
        System.out.println("나눗셈에서 분모에 0을 넣을수는 없습니다.");
      }
    }else{
      System.out.println("사칙연산기호를 잘못입력하셨습니다.");
    }
    return result;
  }
}
