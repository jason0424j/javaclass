import java.util.Scanner;

/**
 * Created by jason chou on 2016/11/17.
 */
public class classwork2 {
    public static void main(String[] args)
    {
        double score;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your score");
        score = scanner.nextDouble();
        if (score>4)
        {
            System.out.print("a");
        }else
            {
            if(score>3)
            {
                System.out.print("b");
            }else
                {
                    if(score>2)
                    {
                        System.out.print("c");
                    }else
                        {
                            if(score>1)
                            {
                                System.out.print("d");
                            }else
                                {
                                    System.out.print("e");
                                }
                        }
                }
        }
    }
}
