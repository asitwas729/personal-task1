package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
  // private로 직접 접근을 막음
  private List<Integer> resultList;
  private List<Double> areaResult;
  private AddOperator addOperator;
  private SubtractOperator subtractOperator;
  private MultiplyOperator multiplyOperator;
  private DivideOperator divideOperator;
  private ModOperator modOperator;




  // 기본 생성자
  public Calculator(){
    this.resultList = new ArrayList<Integer>();
    this.areaResult = new ArrayList<Double>();
    this.addOperator = new AddOperator();
    this.subtractOperator = new SubtractOperator();
    this.multiplyOperator = new MultiplyOperator();
    this.divideOperator = new DivideOperator();
    this.modOperator = new ModOperator();
  }


  public int Calculate(int a, int b, char c){
    int result = 0;
    if(c == '+'){
      result = addOperator.operate(a, b);
      resultList.add(result);
    } else if(c == '-'){
      result = subtractOperator.operate(a, b);
      resultList.add(result);
    } else if(c == '*'){
      result = multiplyOperator.operate(a, b);
      resultList.add(result);
    } else if(c == '/'){
      if(b != 0){
        result = divideOperator.operate(a, b);
        resultList.add(result);
      } else {
        System.out.println("나눗셈에서 분모에 0을 넣을수는 없습니다.");
      }
    } else if(c == '%'){
      result = modOperator.operate(a, b);
      resultList.add(result);
    }else{
      System.out.println("사칙연산기호를 잘못입력하셨습니다.");
    }
    return result;
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

  public void areaAnswer(String areaAnswer){
    System.out.println("입력값 : "+areaAnswer);
    if(areaAnswer.equals("remove")){
      if(!areaResult.isEmpty()){
        removeArea();
      } else{
        System.out.println("저장된 결과가 없습니다.");
      }
    } else if(areaAnswer.equals("inquiry")){
      if(areaResult.isEmpty()){
        System.out.println("저장된 결과가 없습니다.");
      } else{
        inquiryArea();
      }
    } else if(areaAnswer.equals("exit")){
      System.out.println("종료 됩니다.");
      System.exit(0);   // 자바 시스템 종료 구문
    }
  }

  public double calculateCircleArea(int radius){
    final double PI = 3.14159;  // 파이값은 상수이기때문에 final사용
    double result = 0;
    result = PI * radius * radius;
    areaResult.add(result);
    return result;
  }

  public void inquiryArea(){
    for(Double i: areaResult){
      System.out.print(i + " ");
    }
    System.out.println("");
  }

  public void removeArea(){
    areaResult.remove(0);
  }


  // resultList값을 조회하는 getter 메서드
  public List<Integer> getResultList(){
    return resultList;
  }

  // resultList값을 수정하는 setter 메서드
  public void setResultList(List<Integer> resultList) {
    this.resultList = resultList;
  }

  // areaResult값을 조회하는 getter 메서드
  public List<Double> getAreaResult(){
    return areaResult;
  }

  // areaResult값을 수정하는 setter 메서드
  public void setAreaResult(List<Double> areaResult){
    this.areaResult = areaResult;
  }



}
