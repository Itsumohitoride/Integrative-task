package model;

public class SharedPList extends PlayList{

	//Relation

	private User[] nameShared;

	//Methods

	public SharedPList(String namePlay, User[] nameShared){

		super(namePlay);
		nameShared = new User[MCS.FOUR];
	}

	public User[] getNameShared(){
		return nameShared;
	}

	public void setNameShared(User[] nameShared){
		this.nameShared = nameShared;
	}
	
}