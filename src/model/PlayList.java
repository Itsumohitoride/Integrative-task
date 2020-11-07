package model;

public abstract class PlayList{

	//Attribute

	public final static int SEVEN = 7;
	private String name;
	private double duration;

	//Relations

	private Genre[] genre;
	private Song[] songPlay;

	//Methods

	/**
	*<b>name:</b> PlayList <br>
	* Create a object play list. <br>
	* <b>post:</b> A object play list has created. <br>
	* @param name is the name of the play list. namePlay != null y namePlay != "".
	*/

	public PlayList(String name){

		this.name = name;
		this.duration = 0;
		songPlay = new Song[MCS.N_SONG];
		genre = new Genre[SEVEN];
		genre[0] = Genre.DESCONOCIDO;
	}

	/**
	*<b>name:</b> addSongToPList <br>
	* Add a song in the play list. <br>
	* <b>post:</b> save the song in the play list. <br>
	* @param objSong is the object song. objSong != null y objSong != "".
	* @param objUser is the object user. objUser != null y objUser != "".
	* @return <code>String</code> specifying message is the message of the action to add a song into a play list.
	*/

	public String addSongToPList(Song objSong, User objUser){

		String message = "";
		boolean verific = false;
		boolean verificGenre = false;
		boolean verificGenreList = false;

		for(int i = 0;i<MCS.N_SONG && !verific;i++){
			
			if(songPlay[i] == null){

				verific = true;

				songPlay[i] = objSong;

				for(int k = 0; k<genre.length && !verificGenre; k++){
					if(genre[k] == objSong.getGenre()){
						verificGenre = true;
					}
				}
				if(!verificGenre){
					for(int p = 0; p<genre.length && !verificGenreList; p++){
						if(genre[p] == null || genre[p] == Genre.DESCONOCIDO){
							verificGenreList = true;
							genre[p] = objSong.getGenre();
						}
					}
				}

				message = "Se aniadio exitosamente la cancion a la play list";
			}
		}
		if(!verific){

			message = "La lista se encuentra llena, no se puede agregar mas canciones";
		}

		return message;
	}

	/**
	* <b>name:</b> getName <br>
	* Gets the name of the play list.
	* <b>post:</b> gets the name of the play list.
	* @return <code>String</code> specifying name is the name of the play list.
	*/

	public String getName(){
		return name;
	}

	/**
	* <b>name:</b> setName <br>
	* Alters the name of the play list.
	* <b>post:</b> alters the name of the play list.
	* @param name is the name of the play list.
	*/

	public void setName(String name){
		this.name = name;
	}

	/**
	* <b>name:</b> getDuration <br>
	* Gets the duration of the play list.
	* <b>post:</b> gets the duration of the play list.
	* @return <code>double</code> specifying duration is the duration of the play list.
	*/

	public double getDuration(){
		return duration;
	}

	/**
	* <b>name:</b> setDuration <br>
	* Alters the duration of the play list.
	* <b>post:</b> alters the duration of the play list.
	* @param duration is the duration of the play list.
	*/

	public void setDuration(double duration){
		this.duration = duration;
	}

	/**
	* <b>name:</b> getGenre <br>
	* Gets the list of the genres of the play list.
	* <b>post:</b> gets the list of the genres of the play list.
	* @return <code>Genre</code> specifying genre is the list of the genres of the play list.
	*/

	public Genre[] getGenre(){
		return genre;
	}

	/**
	* <b>name:</b> setGenre <br>
	* Alters the list genres of the play list.
	* <b>post:</b> alters the list of the genres of the play list.
	* @param genre is the genre is the list of the genres of the play list.
	*/

	public void setGenre(Genre[] genre){
		this.genre = genre;
	}
}