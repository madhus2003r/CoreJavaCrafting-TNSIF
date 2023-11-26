package tnsif.dayfour;

public class Base {
	 
	  int varDefault = 30;
	  public int varPublic = 40;
	  private int varPrivate = 80;
	  protected int varProtected = 90;
	  
	  //Declaring methods default,public ,private and protected
	  void methodDefault()
	  {
		  System.out.println("Default access Base class");
		  System.out.println(" Default variable : " + varDefault);
	  }
	  
	  public void methodPublic() {
		  
		  System.out.println(" Public Access Base class");
		  System.out.println("Public variable : " +varPublic );
		  
	  }
	  
	  private void methodPrivate () {
		  System.out.println(" Private Access Base class");
		  System.out.println("Private variable : " +varPrivate );
	  }
	  
	  protected void methodProtected() {
		  System.out.println(" Protected Access Base class");
		  System.out.println("Protected variable : " +varProtected );
	  }

}
