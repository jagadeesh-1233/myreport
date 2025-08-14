import java.util.Scanner;
public class neonnumber{
    public static void main(String[] args){
        int num,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        num=sc.nextInt();


        int square=num*num;
        while(square!=0){
            rem=square%10;
            sum+=rem;
            square/=10;
        }
        if(sum==num){
            System.out.println("it is a neon number:");
        }else{
            System.out.println("it is not a neon number:");
        }
    sc.close();
    }
}