import java.util.Scanner;
public class finding_largest {
    static int findlargest(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    publi static voidmian (String[]args){
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        int largest=findlargest(a,b);
        System.out.println("The largest number is: "+largest);
        sc.close();
        
    }
