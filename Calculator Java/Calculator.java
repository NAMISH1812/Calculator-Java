import java.util.Scanner;
import java.lang.Math;
class Calculator{
    public static void calculator(double a,double b,int choice){
        double res;
        switch (choice) {
            case 1:
                res=a+b;
                System.out.println("The sum of "+" "+a +" "+" and "+ " "+b+" " +" is : "+roundto2(res));
                break;
            case 2:
                res=a-b;
                 System.out.println("The difference of "+" "+a +" "+" and "+" " +b +" "+" is : "+roundto2(res));
                break;
            case 3:
                res=a*b;
                 System.out.println("The product of "+" "+a+" " +" and "+ " "+b+" " +" is : "+roundto2(res));
                break;
            case 4:
            if (b==0) System.out.println("Invalid Input");
            else{ 
            res= a/ b;
             System.out.println("The quotient  of "+" "+a+" " +" and "+ " "+b+" " +" is : "+roundto2(res));
            break;
            }
            case 14:
            res=Math.pow(a, b);
            System.out.println("The Power  of "+" "+a+" " +" and "+ " "+b+" " +" is : "+roundto2(res));
            break;
            
            default:
            System.out.println("Unknown operation.");
                 break;
           
        }
    }
    public static void performSingleOperandCalculation(double a,int choice){
        double res;
        switch (choice) {
            case 5:
            if(a<0) System.out.println("Invalid input!");
            else{
                res=Math.sqrt(a);
            System.out.println("The Square Root of"+" "+a+" is : "+roundto2(res));
            }
            
            break;
            case 6:
            res=Math.cbrt(a);
            System.out.println("The Cube  Root of"+" "+a+" is : "+roundto2(res));
            break;
            case 7:
            res=Math.pow(a,2);
            System.out.println("The Square of "+" "+a+" is : "+roundto2(res));
            break;
            case 8:
            res=Math.exp(a);
            System.out.println("The exponent of"+" "+a+" is : "+roundto2(res));
            break;
            case 9:
            a=Math.toRadians(a);
            res=Math.sin(a);
            System.out.println("The Sine of"+" "+a+" is : "+roundto2(res));
            break;
            case 10:
            a=Math.toRadians(a);
            res= Math.cos(a);
             System.out.println("The Cosine of"+" "+a+" is : "+roundto2(res));
             break;
            case 11:
            a=Math.toRadians(a);
            res=Math.tan(a);
            System.out.println("The tan of"+" "+a+" is : "+roundto2(res));
             break;
            case 12:
            if(a<0) System.out.println("Invalid input!");
            else{
                res=Math.log10(a);
            System.out.println("The log of"+" "+a+" is : "+Math.round(res*100.0)/100.0);
            }
             break;
            case 13:
            if(a<0) System.out.println("Invalid input!");
            else{
                 res=Math.log(a);
             System.out.println("The ln of"+" "+a+" is : "+Math.round(res*100.0)/100.0);
            }
           
             break;
        
            default:
            System.out.println("Unkown Operation.");
                break;
        }

    }
    public static double roundto2(double res){
        res=Math.round(res*100.0)/100.0;
        return res;
    }
    public static void main(String[] args) {
        double a,b;
        int choice;
        
        
        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Square root\n6.Cube root\n7.Square\n8.Exponential\n9.Sine\n10.Cosine\n11.Tan\n12.Log\n13.ln\n14.Power\n15.Exit");
        System.out.print("Enter your choice :");
          choice = scan.nextInt();
        if((choice>=1 && choice<=4) || choice == 14){
        
        System.out.print("Enter the value of a : ");
        a=scan.nextDouble();
     
        System.out.print("Enter the value of b : ");
        b=scan.nextDouble();
        calculator(a,b,choice);
        }
        if(choice>=5 && choice<=13){
        
        System.out.print("Enter the value of a : ");
        a=scan.nextDouble();
        performSingleOperandCalculation(a, choice);
        
        
        }
        if (choice==15) System.out.println("Thank you for using this project.");
        if(choice>15) System.out.println("Invalid Choice!");
        
     
}while(choice!=15);
    scan.close();
}
}