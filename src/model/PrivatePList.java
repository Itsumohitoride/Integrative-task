package model;

public class PrivatePList extends PlayList{

	//Relation

	private User namePriv;

	//Methods

	/**
	*<b>name:</b> PrivatePList <br>
	* Create a private play list. <br>
	* <b>post:</b> save the private play list. <br>
	* @param namePlay is the name of the play list. namePlay != null y namePlay != "".
	* @param namePriv is the name of the user who have permission to add songs into the play list. namePriv != null y namePriv != "".
	*/

	public PrivatePList(String namePlay, User namePriv){

		super(namePlay);
		this.namePriv = namePriv;
	}

	/**
	*<b>name:</b> addSongToPList <br>
	* Add a song in the play list. <br>
	* <b>post:</b> save the song in the play list. <br>
	* @param objSong is the object song. objSong != null y objSong != "".
	* @param objUser is the object user. objUser != null y objUser != "".
	* @return <code>String</code> specifying message is the message of the action to add a song into a play list.
	*/

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

	/**
	* <b>name:</b> getNamePriv <br>
	* Gets the user who have permission to add song into the play list.
	* <b>post:</b> gets the user who have permission to add song into the play list.
	* @return <code>User</code> specifying namePriv is a object user who have permission to add song into the play list.
	*/

	public User getNamePriv(){
		return namePriv;
	}

	/**
	* <b>name:</b> setNamePriv <br>
	* Alters the user who have permission to add song into the play list.
	* <b>post:</b> alters the user who have permission to add song into the play list.
	* @param namePriv Is the object user who have permission to add song into the play list.
	*/

	public void setNamePriv(User namePriv){
		this.namePriv = namePriv;
	}
}