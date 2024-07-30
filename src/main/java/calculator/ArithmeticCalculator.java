package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {
  private AddOperator addOperator;
  private SubtractOperator subtractOperator;
  private MultiplyOperator multiplyOperator;
  private DivideOperator divideOperator;
  // private로 직접 접근을 막음
  private List<Integer> resultList;
  int result = 0;

  // resultList값을 조회하는 getter 메서드
  public List<Integer> getResultList(){
    return resultList;
  }

  // resultList값을 수정하는 setter 메서드
  public void setResultList(List<Integer> resultList) {
    this.resultList = resultList;
  }

  // 기본 생성자
  public ArithmeticCalculator(){
    this.resultList = new ArrayList<Integer>();
    this.addOperator = new AddOperator();
    this.subtractOperator = new SubtractOperator();
    this.multiplyOperator = new MultiplyOperator();
    this.divideOperator = new DivideOperator();
  }




  public int Calculate(int a, int b, char c){
    if(c == '+'){
      result = addOperator.operate(a, b, c);
      resultList.add(result);
    } else if(c == '-'){
      result = subtractOperator.operate(a, b, c);
      resultList.add(result);
    } else if(c == '*'){
      result = multiplyOperator.operate(a, b, c);
      resultList.add(result);
    } else if(c == '/'){
      if(b != 0){
        result = divideOperator.operate(a, b, c);
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
        removeResult();
      } else{
        System.out.println("저장된 결과가 없습니다.");
      }
    } else if(answer.equals("inquiry")){
      if(resultList.isEmpty()){
        System.out.println("저장된 결과가 없습니다.");
      } else{
        inquiryResults();
      }
    } else if(answer.equals("exit")){
      System.out.println("종료 됩니다.");
      System.exit(0);   // 자바 시스템 종료 구문
    }
  }


  public void removeResult(){
    resultList.remove(0);
  }

  public void inquiryResults(){
    for(int result: resultList){
      System.out.println(result + " ");
    }
    System.out.println("");
  }

}
