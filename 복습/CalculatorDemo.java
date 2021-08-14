class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
        this.setOprands(left, right);       //-- check~!!!! 오버로딩하면 14,15줄의 중복을 이런식으로 줄일 수 있음!!
		System.out.println("setOprands(int left, int right, int third)");
        //this.left = left;
        //this.right = right;
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}
/*
setOprands(int left, int right)
30
10
setOprands(int left, int right)
setOprands(int left, int right, int third)
60
20
계속하려면 아무 키나 누르십시오 . . .
*/