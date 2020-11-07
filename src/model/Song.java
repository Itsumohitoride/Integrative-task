package model;

public class Song{

	//Atribute

	private String tittle;
	private String releaseDate;
	private String artisName;
	private Genre genre; 
	private int duration;

	//Methods

	/**
	*<b>name:</b> Song <br>
	* Create a object song. <br>
	* <b>post:</b> A object song has created. <br>
	* @param tittle is the name of the song. tittle != null y tittle != "".
	* @param releaseDate is the date of the creation of the song. releaseDate != null y releaseDate != "".
	* @param artisName is the name of the artist of the song. artisName != null y artisName != "".
	* @param genre is the option who select de genre of the song.
	* @param duration is the duration of the song. duration greater than 0.
	*/

	public Song(String tittle, String releaseDate, String artisName, int genre, int duration){

		this.tittle = tittle;
		this.releaseDate = releaseDate;
		this.artisName = artisName;
		this.duration = duration;
		switch(genre){
			case 1:
			this.genre = Genre.ROCK;
			break;
			case 2:
			this.genre = Genre.HIPHOP;
			break;
			case 3:
			this.genre = Genre.CLASSICAL;
			break;
			case 4:
			this.genre = Genre.REGGEA;
			break;
			case 5:
			this.genre = Genre.SALSA;
			break;
			case 6:
			this.genre = Genre.METAL;
			break;
			case 7:
			this.genre = Genre.POP;
			break;
		}
	}

	/**
	* <b>name:</b> getTittke <br>
	* Gets the tittle of the song.
	* <b>post:</b> gets the tittle of the song.
	* @return <code>String</code> specifying tittle is the tittle of the song.
	*/

	public String getTittle(){
		return tittle;
	}

	/**
	* <b>name:</b> setTittle <br>
	* Alters the tittle of the song.
	* <b>post:</b> alters the tittle of the song.
	* @param tittle is the tittle of the song.
	*/

	public void setTittle(String tittle){
		this.tittle = tittle;
	}

	/**
	* <b>name:</b> getReleaseDate <br>
	* Gets the date of the song has created.
	* <b>post:</b> gets the date of the song has created.
	* @return <code>String</code> specifying releaseDate is the date of the song has created.
	*/

	public String getReleaseDate(){
		return releaseDate;
	}

	/**
	* <b>name:</b> setReleaseDate <br>
	* Alters the date of the song has created.
	* <b>post:</b> alters the date of the song has created.
	* @param releaseDate is the date of the song has created.
	*/

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	/**
	* <b>name:</b> getArtisName <br>
	* Gets the name of the artist of the song.
	* <b>post:</b> gets the name of the artist of the song.
	* @return <code>String</code> specifying artisName is the name of the artist of the song.
	*/

	public String getArtisName(){
		return artisName;
	}

	/**
	* <b>name:</b> setArtisName <br>
	* Alters the name of the artist of the song.
	* <b>post:</b> alters the name of the artist of the song.
	* @param artisName is the name of the artis of the song.
	*/

	public void setArtisName(String artisName){
		this.artisName = artisName;
	}

	/**
	* <b>name:</b> getDuration <br>
	* Gets the duration of the song.
	* <b>post:</b> gets the duration of the song.
	* @return <code>int</code> specifying duration is the duration of the song.
	*/

	public int getDuration(){
		return duration;
	}

	/**
	* <b>name:</b> setDuration <br>
	* Alters the duration of the song.
	* <b>post:</b> alters the duration of the song.
	* @param tittle is the duration of the song.
	*/

	public void setDuratio(String tittle){
		this.duration = duration;
	}

	/**
	* <b>name:</b> getGenre <br>
	* Gets the genre of the song.
	* <b>post:</b> gets the genre of the song.
	* @return <code>Genre</code> specifying genre is the genre of the song.
	*/

	public Genre getGenre(){
		return genre;
	}

	/**
	* <b>name:</b> setGenre <br>
	* Alters the genre of the song.
	* <b>post:</b> alters the genre of the song.
	* @param genre is the genre of the song.
	*/

	public void setGenre(Genre genre){
		this.genre = genre;
	}
}