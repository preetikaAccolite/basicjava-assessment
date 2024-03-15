import java.util.*;
public class Excersice2{
    int functionforthrow(int a,int b) throws ArithmeticException{
      if (b==0){
          throw new ArithmeticException("you cannot divide a number by 0");
      }
      return a/b;
    }
    public static void main(String[] args){
        Excersice2 obj=new Excersice2();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(obj.functionforthrow(a,b));
        sc.close();


    }
}