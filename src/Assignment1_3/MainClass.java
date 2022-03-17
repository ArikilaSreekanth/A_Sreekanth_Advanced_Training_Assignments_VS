package Assignment1_3;

public class MainClass {
	
	public void createBooks() {
		Book1_3 bk[] = new Book1_3[2];		 
	      bk[0] = new Book1_3("Java Programing ", 350.50);
	      bk[1] = new Book1_3("Let Us C", 200.00);
	      for(int i = 0; i<bk.length; i++) {
		         bk[i].display();
		         System.out.println(" ");
	      }
	    
	      }
	
	public void showBooks() {
		  	createBooks();
		
	}
	public static void main(String args[])  {
	    MainClass c1 = new MainClass();  
		c1.showBooks();
	   
	      }
	   }
