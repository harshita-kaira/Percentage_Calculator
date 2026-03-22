
import java.util.Scanner;
        
public class Main {
    static void main() {

        Scanner sc=new Scanner(System .in);
        System.out.println("Enter marks of maths : ");
        float a=sc.nextFloat();
        System.out.println("Enter marks of science : ");
        float b=sc.nextFloat();
        System.out.println("Enter marks of social science : ");
        float c=sc.nextFloat();
        System.out.println("Enter marks of english : ");
        float d=sc.nextFloat();
        System.out.println("Enter marks of subject It : ");
        float e=sc.nextFloat();
        System.out.println("Enter your total marks :");
        float f=sc.nextFloat();
        float percentage=(a+b+c+d+e)/f*100;
        System.out.println("Your percentage is : " + percentage +"%");






    }
}