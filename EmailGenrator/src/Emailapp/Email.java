package Emailapp;

import java.util.Scanner;

public class Email 
{
	private String FirstName;
	private String LastName;
	private String Password;
	private String Department;
	private int MailboxCapacity;
	private String AlternativeEmail;
	private String Email;
	
	public Email(String firstName,String lastName) 
	{
		this.FirstName=firstName;
		this.LastName=lastName;
		this.Department=setDepartment();
		this.setPassword(genratePassword(8));
		System.out.println(Password);
		this.Email= FirstName+"."+LastName+"@"+Department+"Centennial.com";
		
	}
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:\n1. Sales \n2.Development \n3.Accounting \n0. for none :");
		Scanner x = new Scanner(System.in);
		int dep = x.nextInt();
		if (dep==1) { return "sales.";}
		else if (dep==2) { return "development.";}
		else if (dep==3) { return "accounting.";}
		else { return "";}	
	}
	
	
	private String genratePassword(int length){
	    String ranPass ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
	    char[] pass = new char[length];
	    for(int i=0;i<length;i++)
	    {
	        int ran = (int) (Math.random()*ranPass.length());
	        pass[i]=ranPass.charAt(ran);
	    }
		return new String(pass);
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		MailboxCapacity = mailboxCapacity;
	}

	public void setAlternativeEmail(String alternativeEmail) {
		AlternativeEmail = alternativeEmail;
	}
	public String getName() {
		return FirstName+' '+LastName;
	}
	
	public int getMailboxCapacity() {
		return MailboxCapacity;
	}

	public String getEmail() {
		return Email;
	}

}
