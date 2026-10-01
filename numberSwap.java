import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter the number: ");
        int n=sc.nextInt();
        
        int divisor=1;
        int temp=n;
        
        while(temp>=10){
            divisor=divisor*10;
            temp=temp/10;
        }
        
        int firstdigit=(n/divisor);
        int lastdigit=n%10;
        int middledigit=(n%divisor)/10;
        
        int swapnumber=(lastdigit*divisor)+(middledigit*10)+firstdigit;
        System.out.println(swapnumber);
    
    }
}