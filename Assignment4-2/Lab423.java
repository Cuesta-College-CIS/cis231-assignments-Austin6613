import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int sum = 0, avg = 0, count = 0, num, max = Integer.MIN_VALUE;
	   
	   // you need to find min also.
      
	   while(true) {
         num = scnr.nextInt();
         if (num < 0) break;
         
         if (num > max) max = num;
         sum += num;
         count++;
         avg = (sum / count);
      }

	   // Sum of the all numbers except min and max
	   // sum = sum - min - max
	   // avg = sum / (the number of all numbers except min and max. e.g, count - 2 )
	   
      if (count == 0) {
         System.out.println("0 0");
      } else {
         
     
      
      
      
      // Use the below line to print the result
      System.out.printf("%d %.2f\n", sum, avg);
   }
}
}
