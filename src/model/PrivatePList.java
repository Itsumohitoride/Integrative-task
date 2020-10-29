package model;

public class PrivatePList extends PlayList{

	//Relation

	private User namePriv;

	//Methods

	public PrivatePList(String namePlay,User namePriv){

		super(namePlay);
		this.namePriv = namePriv;
	}

	public User getNamePriv(){
		return namePriv;
	}

	public void setNamePriv(User namePriv){
		this.namePriv = namePriv;
	}
	
}