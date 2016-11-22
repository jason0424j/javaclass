/**
 * Created by jason chou on 2016/11/17.
 */
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args)
    {
        int f1;
        int s1;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What flavor do you want?(Type 1:Vanilla/2:Strawberry/3:Chocolate)");
        f1 = scanner.nextInt();

        System.out.println("What size of the ice cream do you want?(1:Big/2:Medium/3:Small)");
        s1 = scanner.nextInt();

        System.out.println("do you want cookies?(1:yes/2:no)");
        c = scanner.nextInt();

        if(f1 == 1){
            if(s1 ==1){
                if(c ==1){
                    System.out.println("You have to pay: NT$110");
                }else{
                    System.out.println("You have to pay: NT$100");
                }
            }else{
                if(s1==2){
                    if(c==1){
                        System.out.println("You have to pay: NT$90");
                    }else{
                        System.out.println("You have to pay: NT$80");
                    }
                }else{
                    if(s1==3){
                        if(c==1){
                            System.out.println("You have to pay: NT$70");
                        }else{
                            System.out.println("You have to pay: NT$60");
                        }
                    }else{
                        System.out.println("Please enter the correct inforation");
                    }
                }
            }
        }
        if(f1==3){
            if(s1==1){
                if(c==1){
                    System.out.println("You have to pay: NT$120");
                }else{
                    System.out.println("You have to pay: NT$110");
                }
            }else{
                if(s1==2){
                    if(c==1){
                        System.out.println("You have to pay: NT$100");
                    }else{
                        System.out.println("You have to pay: NT$90");
                    }
                }else{
                    if(s1==3){
                        if(c==1){
                            System.out.println("You have to pay: NT$80");
                        }else{
                            System.out.println("You have to pay: NT$70");
                        }
                    }else{
                        System.out.println("please enter the correct information");
                    }
                }
            }
        }
        if(f1==2){
            if(s1==1){
                if(c==1){
                    System.out.println("You have to pay: NT$130");
                }else{
                    System.out.println("You have to pay: NT$120");
                }
            }else{
                if(s1==2){
                    if(c==1){
                        System.out.println("You have to pay: NT$110");
                    }else{
                        System.out.println("You have to pay: NT$100");
                    }
                }else{
                    if(s1==3){
                        if(c==1){
                            System.out.println("You have to pay: NT$90");
                        }else{
                            System.out.println("You have to pay: NT$80");
                        }
                    }else{
                        System.out.println("please enter the correct information");
                    }
                }
            }
        }
    }
}
