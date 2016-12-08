
/**
 * Created by jason chou on 2016/12/8.
 */
public class arraymaximunage {
    public static void main(String[] arges)
    {
        int [] age= {3,5,8,9,0};
        int biggest;
        biggest = age [0];
        int smallest;
        smallest = age[0];
        int k;
        int partialsum=age[0];
        for (k=1;k<5;k++) {
            if (biggest > age[k]) {
            } else {
                biggest = age[k];
            }
        }System.out.println("the maximun age is "+biggest);
        for (k=1;k<5;k++)
        {
            partialsum+=age[k];
            if (smallest>age[k])
            {
                smallest =age[k];
            }
        }System.out.println("the smallest age is "+smallest);

        System.out.println("the averege is "+((double)partialsum/5));
    }
}

