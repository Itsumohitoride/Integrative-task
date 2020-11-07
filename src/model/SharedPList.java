package model;

public class SharedPList extends PlayList{

	//Relation

	private User[] nameShared;

	//Methods

	/**
	*<b>name:</b> SharedPList <br>
	* Create a shared play list. <br>
	* <b>post:</b> save the shared play list. <br>
	* @param namePlay is the name of the play list. namePlay != null y namePlay != "".
	* @param nameShared are the names of the users who have permission to add songs into the play list. nameShared != null y nameShared != "".
	* @param cont is the num of the users who have permission to add song into the play list.
	*/

	public SharedPList(String namePlay, User[] nameShared, int cont){

		super(namePlay);
		this.nameShared = nameShared;
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

	/**
	* <b>name:</b> getNameShared <br>
	* Gets the users who have permission to add song into the shared play list.
	* <b>post:</b> gets the users who have permission to add song into the shared play list.
	* @return <code>User</code> specifying users is a list of the objects users.
	*/

	public User[] getNameShared(){
		return nameShared;
	}

	/**
	* <b>name:</b> setNameShared <br>
	* Alters the list of users who have permission to add song into the shared play list.
	* <b>post:</b> alters the list of users who have permission to add song into the shared play list.
	* @param nameShared Is the list of the users who have permission to add song into the shared play list.
	*/

	public void setNameShared(User[] nameShared){
		this.nameShared = nameShared;
	}
	
}