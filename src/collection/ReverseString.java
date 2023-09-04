package collection;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Suprbahapawar";
        char[] c= str.toCharArray();

        for(int c1=c.length-1; c1>=0; c1--) {
            System.out.println(c[c1]);
        }

//        for(int c1=0; c1<str.length(); c1++) {
//            System.out.println(c[c1]);
//        }
//        StringBuffer s1= new StringBuffer(str);  // using sb
//        System.out.println(s1.reverse());
//       char c[]={'s', 'u', 'p', 'r', 'a'};
//       char c1[]= str.toCharArray();
//        System.out.println(str);
//        for( char c1=0; c1<c.length; c1++)
//        {
//            System.out.println(c[c1]);
//        }

//        for(int c1=c.length-1; c1>=0; c1--){
//            System.out.println(c[c1]);
//
//        }
//        char c[] = {'a', 'b', 'c', 'd', 'e'};
//
//        for (int i=1; i<=10; i++) {
////            System.out.println(i);
//            if(i%2==0)
//            {
//                System.out.println(i + " " + "even number");
//            }
//            else
//            {
//                System.out.println(i + " " + "odd number");
//            }
//
//        }

    }
}
