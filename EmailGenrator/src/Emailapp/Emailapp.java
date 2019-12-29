package Emailapp;

public class Emailapp {

	public static void main(String[] args) {
	
		Email em1= new Email("Harshil","Macwan");
	 
	  em1.setMailboxCapacity(1000);
	 
	  System.out.print("Name: "+em1.getName()+"\nEmail: "+em1.getEmail()+
			  "\nMailbox Capacity: "+em1.getMailboxCapacity());

	}

}
