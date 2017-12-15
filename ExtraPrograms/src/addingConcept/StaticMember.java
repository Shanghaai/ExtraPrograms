package addingConcept;
public class StaticMember 
{
	static  int k = 20;
     static int x = 10;
	static public void display()
	{
		System.out.println("this is a test program");
	}
   public static void main(String[] args) 
   { 
	 //  MainClass m1 = new MainClass(); // object creation 
	  StaticMember.display();
	 System.out.println("k vlaue:"+StaticMember.k);
	// MainClass.x;
                          	 //calling display (non-static method)
   }
} 
