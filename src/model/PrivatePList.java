package model;

public class PrivatePList extends PlayList{

	//Relation

	private User namePriv;

	//Methods

	public PrivatePList(String namePlay, User namePriv){

		super(namePlay);
		this.namePriv = namePriv;
	}

	@Override

	public String addSongToPList(Song objSong, User objUser){
		String message = "";
		boolean verific = false;

		if(objUser.getName().equals(namePriv.getName())){

			verific = true;
			message = super.addSongToPList(objSong,objUser);

			setDuration(getDuration()+objSong.getDuration());
		}
		else{
			message = "El usuario no tiene permisos para esta lista";
		}

		return message;
	}

	public User getNamePriv(){
		return namePriv;
	}

	public void setNamePriv(User namePriv){
		this.namePriv = namePriv;
	}
	
}