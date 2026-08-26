package DSAGLA;

public class Lab11 {

    public boolean checkpallindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String reverse(String str)
    {
        char ch[]=str.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str="hello";
        String str3="world";

        String str1=new String("World");
        String str2=new String("GeeksforGeeks");

        // h e l l o
        //i=0 j=4 // o e l l h
        //i=1 j=3 // o l l e h
        //i=2 j=2

        // L a p t o p
        //i=0 j=5 // p a p t o L
        //i=1 j=4 // p o p t a L
        //i=2 j=3 // p o t p a L
        //i=3 j=2
        System.out.println(str2.length());
        for(int i=0;i<str2.length();i++)
        {
            System.out.println(str2.charAt(i));
        }

        str.concat(str3);

        str.contains("ell");

        // helloworld
        System.out.println(str.substring(1,3));


    }
}
