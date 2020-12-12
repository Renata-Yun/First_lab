public class Primes
{
    public static void primes ()
    {
        boolean gus = true;
        for (int i=2; i<100; i++ )
        {
            gus = true;
            for (int j=2; j<i; j++)
            {
                if (i%j==0)
                {
                    gus = false;
                    break;
                }
            }
            if (gus==true)
                System.out.print(i+" ");
        }
    }
}
