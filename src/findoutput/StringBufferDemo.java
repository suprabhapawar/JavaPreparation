package findoutput;

public class StringBufferDemo {

    String s= null;
    void print(String s1)
    {System.out.println("String method called");

        System.out.println(s1);


    }

    void print(StringBuffer s2)
    {System.out.println("StringBuffer method called");

        System.out.println(s2);
    }

    public static void main(String[] args) {
        StringBufferDemo s = new StringBufferDemo();
        String s1= null;
        s.print(s1);


    }

}
