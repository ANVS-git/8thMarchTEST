import java.util.Scanner;

// public void fib(int n){
//     if(n<=1)
// }

public class Fibonacci{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the number: ");
        int n=sc.nextInt(); 
        int [] fib=new int[n+1];
        fib[0]=0; 
        fib[1]=1; 
        for(int i=2;i<n;i++){
           fib[i]=fib[i-1]+fib[i-2]; 
        }

        for(int i=0;i<n;i++){
            System.out.print(fib[i]+" ");
        }
    }
}