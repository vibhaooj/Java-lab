import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a:");
        double a=sc.nextDouble();

        System.out.println("Enter b:");
        double b=sc.nextDouble();

        System.out.println("Enter c:");
        double c=sc.nextDouble();
        sc.close();

        double d=b*b-4*a*c;
        if(d>0){
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are real and distinct");
            System.out.println("Root1="+root1+" "+"Root2="+root2);   
        }
        else if(d==0){
            double root_1=-b/(2*a);
            double root_2=root_1;
            System.out.println("The roots are equal and real");
            System.out.println("Root1=Root2"+root_1);
        }
        else{
            double realpart=-b/(2*a);
            double imaginaryPart=Math.sqrt(-d)/(2*a);
            System.out.println("The roots are complex");
            System.out.println("Real part+"+""+imaginaryPart +" i and"+realpart +"-"+imaginaryPart +"i");
        }


    

    }
    
}