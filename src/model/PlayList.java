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

	public PlayList(String name){

		this.name = name;
		this.duration = 0;
		songPlay = new Song[MCS.N_SONG];
		genre = new Genre[SEVEN];
		genre[0] = Genre.DESCONOCIDO;
	}

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

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getDuration(){
		return duration;
	}

	public void setDuration(double duration){
		this.duration = duration;
	}

	public Genre[] getGenre(){
		return genre;
	}

	public void setGenre(Genre[] genre){
		this.genre = genre;
	}
}