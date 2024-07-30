package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
  // private로 직접 접근을 막음
  private List<Integer> resultList = new ArrayList<Integer>();

  public List<Integer> getResultList(){
    return resultList;
  }

  // resultList값을 수정하는 setter 메서드
  public void setResultList(List<Integer> resultList) {
    this.resultList = resultList;
  }
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
      if(!resultList.isEmpty()){
        resultList.remove(0);
      } else{
        System.out.println("저장된 결과가 없습니다.");
      }
    } else if(answer.equals("inquiry")){
      if(resultList.isEmpty()){
        System.out.println("저장된 결과가 없습니다.");
      } else{
        for(int inquiry : resultList){
          System.out.println(inquiry + " ");
        }
      }
    } else if(answer.equals("exit")){
      System.out.println("종료 됩니다.");
      System.exit(0);   // 자바 시스템 종료 구문
    }
  }
}
