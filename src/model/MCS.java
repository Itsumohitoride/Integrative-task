package model;

public class MCS{

	//Attribute

	public final static int N_USERS = 9;
	public final static int N_PLIST = 19;
	public final static int N_SONG = 49;
	public final static int ZERO = 0;
	public final static int FOUR = 4;

	//Relation

	private User[] users;
	private PlayList[] playList;
	private Song[] songsPool;

	//Methods

	public MCS(){

		users = new User[N_USERS];
		playList = new PlayList[N_PLIST];
		songsPool = new Song[N_SONG];
	}

	public boolean createUser(String name, String password, int age){

		boolean verific = false;

		for(int i = 0; i<users.length && !verific; i++){
			if(users[i] == null){
				users[i] = new User(name,password,age);
				verific = true;
			}
		}

		return verific;
	}

	public boolean addSong(String tittle, String releaseDate, String artisName,int genre, int duration){

		boolean verific = false;
		for(int i = 0; i<songsPool.length && !verific; i++){
			if(songsPool[i] == null){
				songsPool[i] = new Song(tittle,releaseDate,artisName,genre,duration);
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

	public User findUserToPlayList(String name){

		User objUser;

		for(int i = 0; i<users.length && !verific; i++){

			if(users[i] != null && name.equalsIgnoreCase(users[i].getName())){
				objUser = users[i];
			} 
		}
		return objUser;
	}

	public boolean findSong(String tittle,String releaseDate, String artisName){

		boolean verific = false;

			for(int i = 0; i<songsPool.length && !verific; i++){

				if(songsPool[i] != null && songsPool[i].getTittle().equalsIgnoreCase(tittle) && songsPool[i].getReleaseDate().equalsIgnoreCase(releaseDate) && songsPool[i].getArtisName().equalsIgnoreCase(artisName)){
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

	public void createPlayList(String namePlay, String namePriv){

		User objUser = findUserToPlayList(namePriv);
		boolean verific = false;

		for(int i = 0; i<playList.length && !verific; i++){
			if(playList[i] == null){
				playList[i] = new PrivatePList(namePlay,objUser);
				verific = true;
			}
		}
	}

	public void createPlayList(String namePlay, String[] nameShared){

		User[] objUser = new User[FOUR];
		boolean verific = false;

		for(int i = 0; i<playList.length && !verific; i++){
			if(playList[i] == null){

				for (int k = 0;k<FOUR; k++) {
					objUser[i] = findUserToPlayList(nameShared[i]);
				}
				
				playList[i] = new PrivatePList(namePlay,objUser);
				verific = true;
			}
		}
	}

	public void createPlayList(String namePlay){

		boolean verific = false;

		for(int i = 0; i<playList.length && !verific; i++){
			if(playList[i] == null){
				playList[i] = new PublicPList(namePlay);
				verific = true;
			}
		}
	}

	public String showUsers(){

		String message = "";

		if(users[ZERO] == null){
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
		double residue;
		double hour;
		double minute;
		double second;

		if(songsPool[ZERO] == null){
			message += "**********************************************************************\n                   No hay ninguna cancion registrada                   \n**********************************************************************";
		}
		else{
			for(int i = 0; i<songsPool.length; i++){
				if(songsPool[i] != null){

					residue = (songsPool[i].getDuration() % 3600);
					hour = ((songsPool[i].getDuration()-residue)/3600);
					minute = (residue/60);
					second = (residue % 60);

					message += "*************  Song **************\n"+"**  Tittle: "+songsPool[i].getTittle()+"\n**  Artist: "+songsPool[i].getArtisName()+"\n**  Duration: "+(int)minute+":"+(int)second+"\n**  Genre: "+songsPool[i].getGenre()+"\n**********************************\n";
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