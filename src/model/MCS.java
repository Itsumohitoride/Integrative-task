package model;

public class MCS{

	//Attribute

	public final static int M_USERS = 10;
	public final static int M_PLIST = 20;
	public final static int M_SONG = 50;
	public final static int ONE = 1;

	//Relation

	private User[] users;
	private PlayList[] playList;
	private Song[] songsPool;

	//Methods

	public MCS(){

		users = new User[M_USERS];
		playList = new PlayList[M_PLIST];
		songsPool = new Song[M_SONG];
	}

	public boolean createUser(String name, String password, int age){

		boolean verific = false;

		for(int i = 0; i<users.length && !verific; i++){
			if(users[i] == null){
				user[i] = new User(name,password,age);
				verific = true;
			}
		}

		return verific;
	}

	public boolean addSong(String tittle, String releaseDate, String artisName, int duration){

		boolean verific = false;
		for(int i = 0; i<songsPool.length && !verific; i++){
				if(songsPool[i] == null){
					songsPool[i] = new Song(tittle,releaseDate,artisName,duration,duration);
					verific = true;
				}
		}

		return verific;
	}

	public boolean findUser(String name){

		boolean verific = false;

		for(int i = 0; i<users.length && !verific; i++){

			if(users[i] != null && name.equalsIgnoreCase(users[i].getName())){
				verific = true;
			} 
		}

		return verific;
	}

	public boolean findSong(String tittle,String releaseDate, String artisName){

		boolean verific = false;

		for(int i = 0; i<songsPool.length && !verific; i++){

			if(songsPool[i].getTittle().equalsIgnoreCase(tittle) && songsPool[i].getReleaseDate().equalsIgnoreCase(releaseDate) && songsPool[i].getArtisName().equalsIgnoreCase(artisName)){
				verific = true;
			}
		}

		return verific;
	}

	public boolean findPlayList(String name){

		boolean verific = false;

		for (int i = 0;i<playList.length && !verific; i++) {
			if(playList[i].getName().equalsIgnoreCase(name)){
				verific = true;
			}
		}
		return verific;
	}

	public boolean createPlayList(String namePlay){

		boolean verific = true;
		PlayList objPlayList = findPlayList();

		if(){

		}
	}

	public String showUsers(){

		String message = "";

		if(users[ONE] == null){
			message += "**********************************************************************\n                   No hay ningun usuario registrado                   \n**********************************************************************";
		}
		else{
			for(int i = 0; i<users.length; i++){
				if(users[i] != null){
					message += "*************  User **************\n"+"**  UserName: "+users[i].getName()+"\n**  Age: "+users[i].getAge()+"\n**  Category: "+users[i].getCategory()+"\n**********************************\n";
				}
			}
		}

		return message;
	}

	public String showSongs(){

		String message = "";

		if(songsPool[ONE] == ){
			message += "**********************************************************************\n                   No hay ninguna cancion registrada                   \n**********************************************************************";
		}
		else{
			for(int i = 0; i<songsPool.length; i++){
				if(songsPool[i] != null){
					message += "*************  Song **************\n"+"**  Tittle: "+songsPool[i].getName()+"\n**  Artist: "+songsPool[i].getArtisName()+"\n**  Duratio: "+songsPool[i].getDuration()+"**  Genre: "+songsPool[i].getGenre()+"\n**********************************\n";
				}
			}
		}

		return message;
	}

	public User[] getUsers(){
		return users;
	}

	public void setUsers(User[] users){
		this.users = users;
	}

	public PlayList[] getPlayList(){
		return playList;
	}

	public void setPlayList(PlayList[] playList){
		this.playList = playList;
	}

	public Song[] getSongsPool(){
		return songsPool;
	}

	public void setSongsPool(Song[] songsPool){
		this.songsPool = songsPool;
	}
}