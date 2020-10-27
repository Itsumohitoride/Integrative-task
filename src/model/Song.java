package model;

public class Song{

	//Atribute

	private String name;
	private String password;
	private String age;
	private int duration;

	public User(String tittle, String releaseDate, String artisName, int duration){

		this.tittle = tittle;
		this.releaseDate = releaseDate;
		this.artisName = artisName;
		this.duration = duration;
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

	public String toString(){
		return "";
	}
}