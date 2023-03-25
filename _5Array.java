import java.util.Scanner;


public class _5Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n;
        System.out.println("Enter the size");
        n= scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
           
            System.out.print("Enter the value: ");
            arr[i]= scanner.nextInt();
            
        }
        System.out.print("Array elements are: ");
        for(int i=0;i<n;i++)
        {
           
            System.out.print(arr[i] + " ");
              
        }


    }
}
