package findoutput;

public class IncrementDecrement {

    public static void main(String[] args)
    {
        int i=1, j=2, k=3;

        int m = i-- - j-- - k--;

        System.out.println("i="+i);  //  i=0
        System.out.println("j="+j);  //  j=1
        System.out.println("k="+k); //   k=2
        System.out.println("m="+m); //   m=-4
    }
}
