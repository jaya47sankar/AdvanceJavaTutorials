package jss.day2.lombok;

public class UserMain {
	
	public static void main(String args[])
	{
		User user1 = User.builder().id(10).name("User1").phone("9876543210").address("Address1").build();
		User user2 = User.builder().id(10).name("User1").phone("9876543210").address("Address1").build();
                
           
		
		System.out.println("USER 1 : "+user1);
		System.out.println("USER 2 : "+user2);

	}

}
