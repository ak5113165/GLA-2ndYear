package OOPSGLA;

public class LAB2 {
    public static void main(String[] args) {
    //pre increment operator
        int b=5;
        System.out.println(++b);//6
      //post increment operator
        int a=5;
        System.out.println(a++);//5
        System.out.println(a);//6

//        int c=5;
//        int d=++c;
//        System.out.println(d);//6
//        System.out.println(c);//6

        int c=5;
        int d=c++;
        System.out.println(d);//5
        System.out.println(c);//6

        int x=10;
        System.out.println(--x);//9
        System.out.println(x++);//9
        System.out.println(x);//10

        int z=5;
        System.out.println(z-- + 2);
        System.out.println(z);

        int e=5;
        int g=e++ + 10;
        System.out.println(e);
        System.out.println(g);

        int h=3;
        int i=h++ + ++h + h++ + h++;
        System.out.println(h);
        System.out.println(i);

        int j=2;
        int k=j++ + --j + ++j;
        System.out.println(j);
        System.out.println(k);

        //Bitwise operators
        //5 :101
        // 00000000000000000000000000000101
        // 00000000000000000000000000001010
        // 00000000000000000000000000010100

        int bit=5<<2;
        System.out.println(bit);



    }
}
