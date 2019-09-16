
public class Box {
double height,width,depth;
Box()
{
	height=0;
	width=0;
	depth=0;
}
Box(double h,double w,double d)
{
	height=h;
	width=w;
	depth=d;
}
Box(double a)
{
	height=width=depth=a;
}
void volume()
{
	double vol=height*width*depth;
	System.out.println("Volume is "+vol);
}
public static void main(String args[])
{
	Box b1=new Box();
	b1.volume();
	Box b2=new Box(2.5);
	b2.volume();
	Box b3=new Box(1.5,2,6.0);
	b3.volume();
}
}

