package model;

public class User{

	//Atribute

	private String name;
	private String password;
	private int age;
	private Category category;
	private int contCategory;

	//Methods

	/**
	*<b>name:</b> User <br>
	* Create a object user. <br>
	* <b>post:</b> A object user has created. <br>
	* @param name is the name of the user.
	* @param password is the password of the user.
	* @param age is the age of the user.
	*/

	public User(String name, String password, int age){

		this.name = name;
		this.password = password;
		this.age = age;
		this.category = Category.NEWBIE;
		this.contCategory = 0;
	}

	/**
	* <b>name:</b> getName <br>
	* Gets the name of the user.
	* <b>post:</b> gets the name of the user.
	* @return <code>String</code> specifying name is the name of the user.
	*/

	public String getName(){
		return name;
	}

	/**
	* <b>name:</b> setName <br>
	* Alters the name of the user.
	* <b>post:</b> alters the name of the user.
	* @param name is the name of the user.
	*/

	public void setName(String name){
		this.name = name;
	}

	/**
	* <b>name:</b> getPassword <br>
	* Gets the password of the user.
	* <b>post:</b> gets the password of the user.
	* @return <code>String</code> specifying password is the password of the user.
	*/

	public String getPassword(){
		return password;
	}

	/**
	* <b>name:</b> setPassword<br>
	* Alters the password of the user.
	* <b>post:</b> alters the password of the user.
	* @param password is the password of the user.
	*/

	public void setPassword(String password){
		this.password = password;
	}

	/**
	* <b>name:</b> getAge <br>
	* Gets the age of the user.
	* <b>post:</b> gets the age of the user.
	* @return <code>int</code> specifying age is the age of the user.
	*/

	public int getAge(){
		return age;
	}

	/**
	* <b>name:</b> setAge<br>
	* Alters the age of the user.
	* <b>post:</b> alters the age of the user.
	* @param age is the age of the user.
	*/

	public void setAge(int age){
		this.age = age;
	}

	/**
	* <b>name:</b> getCategory <br>
	* Gets the category of the user.
	* <b>post:</b> gets the category of the user.
	* @return <code>Category</code> specifying category is the category of the user.
	*/

	public Category getCategory(){
		return category;
	}

	/**
	* <b>name:</b> setCategory<br>
	* Alters the category of the user.
	* <b>post:</b> alters the category of the user.
	* @param category is the category of the user.
	*/

	public void setCategory(Category category){
		this.category = category;
	}

	/**
	* <b>name:</b> getContCategory <br>
	* Gets the counter of the category of the user.
	* <b>post:</b> gets the counter of the category of the user.
	* @return <code>contCategory</code> specifying conCategory is the counter of the category of the user.
	*/

	public int getContCategory(){
		return contCategory;
	}

	/**
	* <b>name:</b> setContCategory<br>
	* Alters the counter of the category of the user.
	* <b>post:</b> alters the counter of the category of the user.
	* @param contCategory is the counter of the category of the user.
	*/


	public void setContCategory(int contCategory){
		this.contCategory = contCategory;
	}

	/**
	* <b>name:</b> cCategory <br>
	* Add 1 to counter of the category of the user.
	* <b>post:</b> Add 1 to counter of the category of the user.
	*/

	public void cCategory(){

		contCategory++;
	}

	/**
	* <b>name:</b> changeCategory <br>
	* Change the category of the user.
	* <b>post:</b> Save the new category of the user.
	*/

	public void changeCategory(){

		cCategory();

		if(contCategory >= 30){
			setCategory(Category.STAR_CONTRIBUTOR);
		}
		else if(contCategory >= 10){
			setCategory(Category.MILD_CONTRIBUTOR);
		}
		else if(contCategory >= 3){
			setCategory(Category.LITTLE_CONTRIBUTOR);
		}
	}
}