import java.io.*;
import java.util.Scanner;

public class App {
     
  public static void main(String[] args) {

      String s ,maxPalinString;
  	  int i, n,max;
  	 
      Scanner sc= new Scanner(System.in);
      s=sc.next();
      n=s.length();
    
      for(i=0;i<n;i++){
        String subStr = s.substring(i,n);
          checkMaxPalin(subStr);
        }
        System.out.println(maxPalinString)
      }
  public static void checkMaxPalin(String numString){
        int x=0,num, num2, sum =0 , max=0;
        String maxPalinString;
        num = Integer.parseInt(numString);
        num2=num;
        while(num >0){
           x=num % 10;
          sum = (sum*10)+x;
          num=num/10;
        }

        if(sum == num2){
          if(max < numString.length()){
          max=numString.length();
          maxPalinString= numString;
          }
        }
        else{
          checkMaxPalin(numString.substring(0,numString.length()-1));
        }

      }
}