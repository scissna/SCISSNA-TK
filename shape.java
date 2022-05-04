import java.util.*;
interface ap
 {
   void input();
   void area();
   void perimeter();
  }
  
 class rectangle implements ap
  {
    double length,breadth;
	void input(double l,double b)
	  {
	    length=l;
		breadth=b;
	  }
   }

void area()
{
  System.out.println("Area is:" +(length*breadth));
}

void perimeter()
{
   System.out.println("perimeter is" +(2*length*breadth));
   
}
}

class circle implements ap
{
 double r;
 void input(doubler1)
  {
    r=r1;
  }
}
void area()
{
 System.out.println("Area is:" +(3.14*r*r));
}

void perimeter()
{
  System.out.println("perimeter is:" +(2*3.14*r));
  
}
}

class shape
{
 public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("\n1.RECTANGLE\n2.CIRCLE\n3.EXIT");
	 System.out.println("Enter your choice:");
	 c=sc.nextInt();
	 
	 rectangle obj1=new rectangle[];
	 circle obj2=new circle[];
	 if(c==1)
	  {
	   obj1.input(l,b);
	   obj1.area();
	   obj1.perimeter();
	  }
	  
	  if(c==2)
	  {
	    obj2.input(r);
		obj2.area();
		obj2.perimeter();
	  }
	  
	 }
	} 
		