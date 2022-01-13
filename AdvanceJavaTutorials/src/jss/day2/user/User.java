/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jss.day2.user;

/**
 *
 * @author Jayasankar
 */
public class User
{
	//All final attributes
	private final String firstName; // required
	private final int age; // optional
	private final String phone; // optional


	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.age = builder.age;
		this.phone = builder.phone;
	
	}

	//All getter, and NO setter to provde immutability
	public String getFirstName() {
		return firstName;
	}
	
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	

	@Override
	public String toString() {
		return "User: "+this.firstName+", "+this.age+", "+this.phone;
	}

	public static class UserBuilder
	{
		private final String firstName;
		private int age;
		private String phone;

		public UserBuilder(String firstName) {
			this.firstName = firstName;
		}
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder address(String address) {

			return this;
		}
		//Return the finally consrcuted User object
		public User build() {
			User user =  new User(this);
			validateUserObject(user);
			return user;
		}
		private void validateUserObject(User user) {
			//Do some basic validations to check
			//if user object does not break any assumption of system
		}
	}
        
        public static void main(String[] args) 
{
	User user1 = new User.UserBuilder("TEST NAME 1")
	.age(30)
	.phone("1234567")
	.build();

	System.out.println(user1);

	User user2 = new User.UserBuilder("TEST NAME 2")
	.age(40)
	.phone("5655")

	.build();

	System.out.println(user2);

	User user3 = new User.UserBuilder("TEST NAME 3")
	//No age
	//No phone
	.build();

	System.out.println(user3);
}
}