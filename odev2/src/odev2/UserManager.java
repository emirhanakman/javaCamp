package odev2;

public class UserManager {
	public void addUsers(User user)
	{
		System.out.println(user.name + " kullan�c�s� sisteme eklendi...");
	}
	
	public void getUsersId(User user)
	{
		System.out.println(user.name + " adl� kullan�c�n�n id'si: " + user.id);

	}
}
