//import
      //  java.util.Scanner;

public class Main
{
    public static void main(String args[])

            throws java.io.IOException{
        //  Scanner in = new Scanner(System.in);
        Main c = new Main();
        System.out.println("HELLO WORLD АЗАЗАЗАЗАЗАЗАЗАЗАЗ!!!  " + c.summa("Hello2",5, 10)+"|O_O|"+c.summa("Hello8",1,2,3,45,6,7,8,9));
        MyFirstGui gui = new MyFirstGui();

        Box c2 = new Box(15,23);
       // c2.SetDim(15,23);
        c2.view();

        /*12345*/
        // if (5 == 5) System.out.println("123");


        //int x;
        // v = System.in.read(); //читает символы :(
        // System.out.println(v);
        //  x=v;

        int v=3;
        int x=v*v < 6?3:7;

        first:
        {
            for (int i = 0, y = x; i <= 10; i++, y--)
            {
                if(i%2==0) continue;
                System.out.println(i + " =-= " + y);
                if(i==9) break first;
            }
        }
        int sum=0, mas[]={1,2,3,4,5,6,7,8,9,10};
        for(int k:mas) sum+=k;
        System.out.println(sum);
        c2.test(123);

        Box c3=new Box(15,23);
        if(c2.equals(c3)) System.out.println("TRUE c2 and с3вавава");
        c3=new Box(12,13);
        if(!c2.equals(c3)) System.out.println("False c2 and c3");

        C assist=new C(1,2,3);
        assist.Out();
        assist.Out(1);
        assist.Out(1,2);
    }
    private String summa(String mess, int ... a){

        int summa=0;
        for(int x:a) summa+=x;
        //System.out.println(mess);
        return summa+" "+mess;
    }
}
abstract class A
{
    int a,b;
    A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
        abstract void Out();

}
class B extends A
{
    int c;
    B(int a,int b,int c)
    {
        super(a,b);
        this.c=c;
    }
     void Out()

    {
        System.out.println("B "+c);
    }
}
class C extends B
{
    C(int a,int b,int c)
    {
        super(a,b,c);
    }
     void Out(int c,int b)

    {
        System.out.println("C "+c+" "+b);
    }
    void Out(int c)

    {
     //   super.Out();
        System.out.println("B in C "+c);
    }
}



