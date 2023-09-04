package collection;

public class RevString
{

    static String recursiveMethod(String str)
    {
        if ((null==str) || (str.length() <=1))
        {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args)
    {
        String str="SuPrabhA";
        StringBuffer s = new StringBuffer(str);
        System.out.println(s.reverse());

        char[] c1=str.toCharArray();
        for(int i =c1.length-1; i>=0; i-- )
        {
            System.out.println(c1[i]);
        }
        recursiveMethod(str);


    }

}
