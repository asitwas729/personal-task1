package calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {
  final double PI = 3.14159;  // 파이값은 상수이기때문에 final사용

  // private로 직접 접근을 막음
  private List<Double> areaResult;

  // areaResult값을 조회하는 getter 메서드
  public List<Double> getAreaResult(){
    return areaResult;
  }

  // areaResult값을 수정하는 setter 메서드
  public void setAreaResult(List<Double> areaResult){
    this.areaResult = areaResult;
  }

  public CircleCalculator(){
    this.areaResult = new ArrayList<Double>();
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

}
