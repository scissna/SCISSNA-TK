import java.util.*;

class publisher
{
  String pub_name;
  publisher(String pname)
    {
      pub_name=pname;
      
    }
    
    void display()
      {
        System.out.println("publisher name" +pub_name);
        
      }
class book extends publisher
 {
   String title,author;
   book(String pname,String titl,String auth)
   {
     super(pname);
     title=titl;
     author=auth;
   }
   
   void display()
    { 
      super.display();
      System.out.println("Book Title:"+title);
      System.out.println("Book Author:"+author);
    }
    

class literature extends book
 {
  String type;
  literature(String pname,String titl,String auth,String typ)
  {
  super(pname,titl,auth);
  type=typ;
  }
  void display()
   {
    super.display();
    System.out.println("Book type:"+type);
   }
