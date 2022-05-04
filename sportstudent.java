import java.util.*;
interface student
{
 int score=10;
 void displayscore();
}

interface sports
{
 int score=25;
 void displaysportscore();
}

class result implements student,sports
{
  public void displayscore()
   {
     System.out.println("Academic Score is:" +student.score);
   }
  public void displaysportscore()
   {
     System.out.println("sports score is:" +sports.score);
   }

public class sportsstudent result
{
 public static void main(String args[])
  {
    result x=new result();
    x.displayscore();
    x.displaysportscore();
  }	
}
}