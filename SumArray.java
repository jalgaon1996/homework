package day9;
//wap to ask 5 numbers in an array and print  sum of array elements 
public class SumArray {

	public static void main(String[] args) {

      int a[]= {10,20,30,40,50};
      int sum=0;
      
      for(int k=0;k<5;k++)
      {
    	  sum= sum+ a[k];
      }
      System.out.println("total ="+sum);
 
	}

}
