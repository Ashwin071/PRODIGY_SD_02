import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a = r.nextInt(101);
        System.out.print("Guess the Number:");
        int b = sc.nextInt();
        int i = 1;
        while(a!=b){
            if(a>b){
                System.out.print("Too Low,Guess the Number:");
                int c = sc.nextInt();
                b=c;
            }else{
                System.out.print("Too High,Guess the Number:");
                int c = sc.nextInt();
                b=c;
            }
            i++;
        }
        System.out.println("you have Guessed the correct Number:"+a);
        System.out.println("How many times you have Guessed:" + i);
        sc.close();
    }
}
