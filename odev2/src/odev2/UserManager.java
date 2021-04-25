package odev2;

public class UserManager {
	public void addUsers(User user)
	{
		System.out.println(user.name + " kullanýcýsý sisteme eklendi...");
	}
	
	public void getUsersId(User user)
	{
		System.out.println(user.name + " adlý kullanýcýnýn id'si: " + user.id);

	}
}
