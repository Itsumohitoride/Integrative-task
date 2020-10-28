package model;

public class User{

	//Atribute

	private String name;
	private String password;
	private int age;
	private Category category;

	public User(String name, String password, int age){

		this.name = name;
		this.password = password;
		this.age = age;
		this.category = Category.NEWBIE;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String toString(){
		return "";
	}

	public Category getCategory(){
		return category;
	}

	public void setCategory(Category category){
		this.category = category;
	}

}