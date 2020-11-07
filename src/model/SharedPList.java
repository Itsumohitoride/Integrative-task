package model;

public class SharedPList extends PlayList{

	//Relation

	private User[] nameShared;

	//Methods

	public SharedPList(String namePlay, User[] nameShared, int cont){

		super(namePlay);
		this.nameShared = nameShared; 

	}

	@Override

	public String addSongToPList(Song objSong, User objUser){

		String message = "";
		boolean verific = false;

		for (int i = 0;i<nameShared.length && !verific;i++) {
			if(nameShared[i] != null && objUser.getName().equals(nameShared[i])){
				verific = true;
			}	
		}

		if(verific){

			message = super.addSongToPList(objSong,objUser);

			setDuration(getDuration()+objSong.getDuration());
		}
		else{
			message = "El usuario no tiene permisos para esta lista";
		}

		return message;
	}

	public User[] getNameShared(){
		return nameShared;
	}

	public void setNameShared(User[] nameShared){
		this.nameShared = nameShared;
	}
	
}