package model;

public class Song{

	//Atribute

	private String tittle;
	private String releaseDate;
	private String artisName;
	private Genre genre; 
	private int duration;

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

	public String getTittle(){
		return tittle;
	}

	public void setTittle(String tittle){
		this.tittle = tittle;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getArtisName(){
		return artisName;
	}

	public void setArtisName(String artisName){
		this.artisName = artisName;
	}

	public int getDuration(){
		return duration;
	}

	public void setDuratio(String tittle){
		this.duration = duration;
	}

	public Genre getGenre(){
		return genre;
	}

	public void setGenre(Genre genre){
		this.genre = genre;
	}
}