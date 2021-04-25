package odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kodlama.io sitesinde ana ekrandaki kurslarýn listelendiði alanlar özellik nesnesi olarak tanýmalanýr.
		User user1 = new User(1, "Emirhan Akman", "emirhan_0607@hotmail.com", "sifreemir", 25);
		User user2 = new User(2, "Ayça Demir", "aycademir@gmail.com", "sifre1", 24);
		User user3 = new User(3, "Aslý Kaya", "aslikaya06@gmail.com", "sifreasli", 30);
		
		Category category1 = new Category(1,"C# + Angular","Engin Demiroð");
		Category category2 = new Category(2,"Java + React","Engin Demiroð");
		Category category3 = new Category(3,"Proglamlamaya Giriþ Temel Kursu","Engin Demiroð");
		
		UserManager userManager = new UserManager();
				
		
		
		User[] users = {user1,user2,user3};
		Category[] categorys = {category1,category2,category3};
		
		for (User user : users) 
		{
			System.out.println(user.name);
		}
		
		System.out.println("---------------------------------------------------");
		
		
		for(Category category : categorys )
		{
			System.out.println(category.courseName);
		}
		
		System.out.println("---------------------------------------------------");
		
		userManager.addUsers(user2);
		userManager.addUsers(user1);
		
		System.out.println("---------------------------------------------------");
		
		userManager.getUsersId(user1);
		userManager.getUsersId(user3);
	}

}
