/**
 * Created by Михаил on 22.08.2015.
 */
public class Box
{
int height,width;

    Box (int height, int w)
    {
        this.height=height;
        width=w;
    }
    boolean equals(Box box1)
    {
        if(box1.height==height&&box1.width==width) return true; else return false;
    }
    void view()
    {
        System.out.println(height+width);
    }
//    void test(int a)
//    {
//        System.out.println("test int");
//    }
    void test(double a)
    {
        System.out.println("test double");
    }
}
