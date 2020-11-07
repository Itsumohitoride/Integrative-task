package model;

public class PublicPList extends PlayList{

	//Attribute

	private double calification;
	private int contCalification;
	
	//Methods

	/**
	*<b>name:</b> PublicPList <br>
	* Create a public play list. <br>
	* <b>post:</b> save the public play list. <br>
	* @param namePlay is the name of the play list. namePlay != null y namePlay != "".
	*/

	public PublicPList(String namePlay){

		super(namePlay);
		calification = 0;
		contCalification = 0;
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

		String message = "La cancion se agrego correctamente";
		boolean verific = false;

		verific = true;
		message = super.addSongToPList(objSong,objUser);

		setDuration(getDuration()+objSong.getDuration());

		return message;
	}

	/**
	*<b>name:</b> addCalification <br>
	* Add a calification for a public play list. <br>
	* <b>post:</b> save the calification of the public play list. <br>
	* @param calification is the calification of the public play list.
	* @return <code>String</code> specifying message result of the action of add a calification for a public play list.
	*/

	public String addCalification(double calification){

		String message;

		contCalification++;
		setCalification((calification+getCalification())/contCalification);

		message = "Se agrego correctamente la calificacion";

		return message;
	}

	/**
	* <b>name:</b> getUsers <br>
	* Gets the calification of the play list.
	* <b>post:</b> gets the calification of the play list.
	* @return <code>double</code> specifying calification is the calification of the play list.
	*/

	public double getCalification(){
		return calification;
	}

	/**
	* <b>name:</b> setCalification <br>
	* Alters the calification of the play list.
	* <b>post:</b> alters the calification of the play list.
	* @param calification Is the calification of the play list.
	*/

	public void setCalification(double calification){
		this.calification = calification;
	}

	/**
	* <b>name:</b> getContCalification <br>
	* Gets the counter of the calification of the play list.
	* <b>post:</b> gets the counter of the calification of the play list.
	* @return <code>double</code> specifying contCalification is the counter of the calification of the play list.
	*/

	public double getContCalification(){
		return contCalification;
	}

	/**
	* <b>name:</b> setCalification <br>
	* Alters the counter of the calification of the play list.
	* <b>post:</b> alters the counter of the calification of the play list.
	* @param contCalification Is the counter of the calification of the play list.
	*/

	public void setContCalification(int contCalification){
		this.contCalification = contCalification;
	}
}