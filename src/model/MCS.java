package model;

public class MCS{

	//Attribute

	public final static int N_USERS = 10;
	public final static int N_PLIST = 20;
	public final static int N_SONG = 50;
	public final static int ZERO = 0;
	public final static int FIVE = 5;

	//Relation

	private User[] users;
	private PlayList[] playList;
	private Song[] songsPool;

	//Methods

	/**
	*<b>name:</b> MCS <br>
	* Create a object mcs. <br>
	* <b>post:</b> A object mcs has created. <br>
	*/

	public MCS(){

		users = new User[N_USERS];
		playList = new PlayList[N_PLIST];
		songsPool = new Song[N_SONG];
	}

	/**
	*<b>name:</b> createUser <br>
	* create an user. <br>
	* <b>post:</b> save an user. <br>
	* @param name is the name of the user.
	* @param password is the password of the user.
	* @param age is the age of the user.
	* @return <code>boolean</code> specifying verific is the result of the creation of an user.
	*/

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

	/**
	*<b>name:</b> addSong <br>
	* Create a song. <br>
	* <b>post:</b> save the song and updates the counter of the user's category. <br>
	* @param name is the name of the user who enters the song. name != null y name != "".
	* @param tittle is the name of the song. tittle != null y tittle != "".
	* @param releaseDate is the date of the creation of the song. releaseDate != null y releaseDate != "".
	* @param artisName is the name of the artist of the song. artisName != null y artisName != "".
	* @param genre is the option who select de genre of the song.
	* @param duration is the duration of the song. duration greater than 0.
	* @return <code>boolean</code> specifying verific is the result of the creation of a song.
	*/

	public boolean addSong(String name, String tittle, String releaseDate, String artisName,int genre, int duration){

		boolean verific = false;
		User objUser = findUserToPlayList(name);

		for(int i = 0; i<songsPool.length && !verific; i++){
			if(songsPool[i] == null){
				songsPool[i] = new Song(tittle,releaseDate,artisName,genre,duration);
				objUser.changeCategory();
				verific = true;
			}
		}

		return verific;
	}

	/**
	*<b>name:</b> findUser <br>
	* Verific if the user exists in the data base. <br>
	* <b>post:</b> send the result of the check. <br>
	* @param name is the name of the user. name != null y name != "".
	* @return <code>boolean</code> specifying verific is the result of find an user to know if it exists.
	*/

	public boolean findUser(String name){

		boolean verific = false;

		for(int i = 0; i<users.length && !verific; i++){

			if(users[i] != null && name.equalsIgnoreCase(users[i].getName())){
				verific = true;
			} 
		}

		return verific;
	}

	/**
	*<b>name:</b> findUserToPlayList <br>
	* Verific if the user exists in the data base. <br>
	* <b>post:</b> send the result of the check. <br>
	* @param name is the name of the user. name != null y name != "".
	* @return <code>User</code> specifying objUser is the object users.
	*/

	public User findUserToPlayList(String name){

		User objUser = null;
		boolean verific = false;

		for(int i = 0; i<users.length && !verific; i++){

			if(users[i] != null && name.equalsIgnoreCase(users[i].getName())){
				objUser = users[i];
				verific = true;
			} 
		}
		return objUser;
	}

	/**
	*<b>name:</b> finSong <br>
	* Verific if the song exists in the data base. <br>
	* <b>post:</b> send the result of the check. <br>
	* @param tittle is the name of the song. name != null y name != "".
	* @param artisName is the name of the artist of the song. artisName != null y artisName != "".
	* @return <code>boolean</code> specifying verific is the result of find a song to know if it exists.
	*/

	public boolean findSong(String tittle, String artisName){

		boolean verific = false;

			for(int i = 0; i<songsPool.length && !verific; i++){

				if(songsPool[i] != null && songsPool[i].getTittle().equalsIgnoreCase(tittle) && songsPool[i].getArtisName().equalsIgnoreCase(artisName)){
					verific = true;
				}
			}

		return verific;
	}

	/**
	*<b>name:</b> finSongToPlayList <br>
	* Verific if the song exists in the data base. <br>
	* <b>post:</b> send the result of the check. <br>
	* @param nameSong is the name of the song. name != null y name != "".
	* @param nameArtist is the name of the artist of the song. artisName != null y artisName != "".
	* @return <code>Song</code> specifying objSong is the object song.
	*/

	public Song findSongToPlayList(String nameSong, String nameArtist){

		Song objSong = null;
		boolean verific = false;

			for(int i = 0; i<songsPool.length && !verific; i++){

				if(songsPool[i] != null && songsPool[i].getTittle().equalsIgnoreCase(nameSong) && songsPool[i].getArtisName().equalsIgnoreCase(nameArtist)){
					objSong = songsPool[i];
					verific = true;
				}
			}
		return objSong;
	}

	/**
	*<b>name:</b> findPlayList <br>
	* Verific if the play list exists in the data base. <br>
	* <b>post:</b> send the result of the check. <br>
	* @param name is the name of the play list. name != null y name != "".
	* @return <code>boolean</code> specifying verific is the result of find a play list to know if it exists.
	*/

	public boolean findPlayList(String name){

		boolean verific = false;

		for (int i = 0;i<playList.length && !verific; i++) {
			if(playList[i] != null && playList[i].getName().equalsIgnoreCase(name)){
				verific = true;
			}
		}
		return verific;
	}

	/**
	*<b>name:</b> findPlayListPublic <br>
	* Verific if the public play list exists in the data base. <br>
	* <b>post:</b> send the result of the check. <br>
	* @param name is the name of the play list. name != null y name != "".
	* @return <code>boolean</code> specifying verific is the result of find a public play list to know if it exists.
	*/

	public boolean findPlayListPublic(String name){

		boolean verific = false;

		for (int i = 0;i<playList.length && !verific; i++) {
			if(playList[i] != null && playList[i].getName().equalsIgnoreCase(name) && playList[i] instanceof PublicPList){
				verific = true;
			}
		}
		return verific;
	}

	/**
	*<b>name:</b> findPlayListToSong <br>
	* Verific if the public play list exists in the data base. <br>
	* <b>post:</b> send the result of the check. <br>
	* @param name is the name of the play list. name != null y name != "".
	* @return <code>PlayList</code> specifying objPlay is the result of find a public play list to know if it exists.
	*/

	public PlayList findPlayListToSong(String name){

		PlayList objPlay = null;
		boolean verific = false;

		for(int i = 0; i<playList.length && !verific; i++){

			if(playList[i] != null && name.equalsIgnoreCase(playList[i].getName())){
				objPlay = playList[i];
				verific = true;
			} 
		}
		return objPlay;
	}

	/**
	*<b>name:</b> createPlayList <br>
	* Create a private play list. <br>
	* <b>post:</b> save the private play list. <br>
	* @param namePlay is the name of the play list. namePlay != null y namePlay != "".
	* @param namePriv is the name of the user who have permission to add songs into the play list. namePriv != null y namePriv != "".
	*/

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

	/**
	*<b>name:</b> createPlayList <br>
	* Create a shared play list. <br>
	* <b>post:</b> save the shared play list. <br>
	* @param namePlay is the name of the play list. namePlay != null y namePlay != "".
	* @param nameShared are the names of the users who have permission to add songs into the play list. nameShared != null y nameShared != "".
	* @param cont is the num of the users who have permission to add song into the play list.
	*/

	public void createPlayList(String namePlay, String[] nameShared, int cont){

		User[] objUser = new User[FIVE];
		boolean verific = false;

		for(int i = 0; i<playList.length && !verific; i++){
			if(playList[i] == null){

				for (int k = 0;k<FIVE; k++) {
					objUser[i] = findUserToPlayList(nameShared[i]);
				}
				
				playList[i] = new SharedPList(namePlay,objUser,cont);
				verific = true;
			}
		}
	}

	/**
	*<b>name:</b> createPlayList <br>
	* Create a public play list. <br>
	* <b>post:</b> save the public play list. <br>
	* @param namePlay is the name of the play list. namePlay != null y namePlay != "".
	*/

	public void createPlayList(String namePlay){

		boolean verific = false;

		for(int i = 0; i<playList.length && !verific; i++){
			if(playList[i] == null){
				playList[i] = new PublicPList(namePlay);
				verific = true;
			}
		}
	}

	/**
	*<b>name:</b> showUsers <br>
	* Create a list of the users. <br>
	* <b>post:</b> send the list of the users. <br>
	* @return <code>String</code> specifying message is the list of the user.
	*/

	public String showUsers(){

		String message = "";

		if(users[ZERO] == null){
			message += "**********************************************************************\n                   No hay ningun usuario registrado                   \n**********************************************************************";
		}
		else{
			for(int i = 0; i<users.length; i++){
				if(users[i] != null){

					message +=  "*************  User **************\n"+
								"**  UserName: "+users[i].getName()+
								"\n**  Age: "+users[i].getAge()+
								"\n**  Category: "+users[i].getCategory()+
								"\n**********************************\n";
				}
			}
		}

		return message;
	}

	/**
	*<b>name:</b> showSongs <br>
	* Create a list of the songs in the pool. <br>
	* <b>post:</b> send the list of the song. <br>
	* @return <code>String</code> specifying message is the list of the song.
	*/

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

					message +=  "*************  Song **************\n"+
								"**  Tittle: "+songsPool[i].getTittle()+
								"\n**  Artist: "+songsPool[i].getArtisName()+
								"\n**  Duration: "+(int)minute+":"+(int)second+
								"\n**  Genre: "+songsPool[i].getGenre()+
								"\n**********************************\n";
				}
			}
		}

		return message;
	}

	/**
	*<b>name:</b> showPList <br>
	* Create a list of the play list. <br>
	* <b>post:</b> send the list of the play lists. <br>
	* @return <code>String</code> specifying message is the list of the play lists.
	*/

	public String showPList(){

		String message = "";
		String messageGenre = "";
		String messageShared = "";
		double residue;
		double hour;
		double minute;
		double second;
		double totalTime;

		PublicPList objPlay; 
		PrivatePList objPrivate;
		SharedPList objShared;

		if(playList[ZERO] == null){
			message += "**********************************************************************\n                   No hay ninguna play list registrada                   \n**********************************************************************";
		}
		else{
			for(int i = 0; i<playList.length; i++){
				if(playList[i] != null && playList[i] instanceof PublicPList){

					objPlay = (PublicPList) playList[i];

					residue = (playList[i].getDuration() % 3600);
					hour = ((playList[i].getDuration()-residue)/3600);
					minute = (residue/60);
					second = (residue % 60);

					for(int k = 0; k<playList[i].getGenre().length; k++){
						if(playList[i].getGenre()[k] != null){
							messageGenre += playList[i].getGenre()[k]+",";
						}
					}

					message +=  "*************  PlayList **************\n"+
								"**  Tittle: "+playList[i].getName()+
								"\n**  Duration: "+(int)hour+":"+(int)minute+":"+(int)second+
								"\n**  Genre: "+messageGenre+
								"\n**  Calificacion: "+objPlay.getCalification()+
								"\n**********************************\n";
				}
				else if(playList[i] != null && playList[i] instanceof PrivatePList){

					objPrivate = (PrivatePList) playList[i];

					residue = (playList[i].getDuration() % 3600);
					hour = ((playList[i].getDuration()-residue)/3600);
					minute = (residue/60);
					second = (residue % 60);

					for(int k = 0; k<playList[i].getGenre().length; k++){
						if(playList[i].getGenre()[k] != null){
							messageGenre += playList[i].getGenre()[k]+",";
						}
					}

					message +=  "*************  PlayList **************\n"+
								"**  Tittle: "+playList[i].getName()+
								"\n**  Duration: "+(int)hour+":"+(int)minute+":"+(int)second+
								"\n**  Genre: "+messageGenre+
								"\n**  Usuarios permitidos: "+objPrivate.getNamePriv().getName()+
								"\n**********************************\n";
				}
				else if(playList[i] != null && playList[i] instanceof SharedPList){

					objShared = (SharedPList) playList[i];

					residue = (playList[i].getDuration() % 3600);
					hour = ((playList[i].getDuration()-residue)/3600);
					minute = (residue/60);
					second = (residue % 60);

					for(int k = 0; k<playList[i].getGenre().length; k++){
						if(playList[i].getGenre()[k] != null){
							messageGenre += playList[i].getGenre()[k]+",";
						}
					}
					for(int p = 0; p<objShared.getNameShared().length; p++){
						if(objShared.getNameShared()[p] != null){
							messageShared += objShared.getNameShared()[p].getName()+",";
						}
					}

					message +=  "*************  PlayList **************\n"+
								"**  Tittle: "+playList[i].getName()+
								"\n**  Duration: "+(int)hour+":"+(int)minute+":"+(int)second+
								"\n**  Genre: "+messageGenre+
								"\n**  Usuarios permitidos: "+messageShared+
								"\n**********************************\n";
				}
			}
		}

		return message;
	}

	/**
	*<b>name:</b> addSongToPlist <br>
	* Add a song into a play list. <br>
	* <b>post:</b> send the object play list, the object user and the object song to add a song into a play list. <br>
	* @param nameList is the name of the list. nameList != null y nameList != "".
	* @param name is the name of the user. name != null y name != "".
	* @param nameSong is the name of the song. nameSong != null y nameSong != "".
	* @param nameArtist is the name of the artist of the song. nameArtist != null y nameArtist != "".
	* @return <code>String</code> specifying message result of the action of add song into a play list.
	*/

	public String addSongToPList(String nameList, String name, String nameSong, String nameArtist){

		PlayList objPlay = findPlayListToSong(nameList);
		User objUser = findUserToPlayList(name);
		Song objSong = findSongToPlayList(nameSong,nameArtist);

		String message = "";

		if(objPlay instanceof SharedPList){
			message = ((SharedPList)objPlay).addSongToPList(objSong,objUser);
		}
		else if(objPlay instanceof PrivatePList){
			message = ((PrivatePList)objPlay).addSongToPList(objSong,objUser);
		}
		else if(objPlay instanceof PublicPList){
			message = ((PublicPList)objPlay).addSongToPList(objSong,objUser);
		}

		return message;
	}

	/**
	*<b>name:</b> addCalification <br>
	* Add a calification for a public play list. <br>
	* <b>post:</b> save the calification of the public play list. <br>
	* @param name is the name of the public play list. name != null y name != "".
	* @param calification is the calification of the public play list.
	* @return <code>String</code> specifying message result of the action of add a calification for a public play list.
	*/

	public String addCalification(String name, double calification){

		PlayList objPlay = findPlayListToSong(name);

		String message = "";

		message = ((PublicPList)objPlay).addCalification(calification);

		return message;
	}

	/**
	* <b>name:</b> getUsers <br>
	* Gets the users.
	* <b>post:</b> gets the users.
	* @return <code>User</code> specifying users is a list of the objects users.
	*/

	public User[] getUsers(){
		return users;
	}

	/**
	* <b>name:</b> setUsers <br>
	* Alters the list of users.
	* <b>post:</b> alters the list of users.
	* @param users Is the list of the users.
	*/

	public void setUsers(User[] users){
		this.users = users;
	}

	/**
	* <b>name:</b> getPlayList <br>
	* Gets the play list.
	* <b>post:</b> gets the play list.
	* @return <code>PlayList</code> specifying playList is a list of the objects play list.
	*/

	public PlayList[] getPlayList(){
		return playList;
	}

	/**
	* <b>name:</b> setPlayList <br>
	* Alters the list of play list.
	* <b>post:</b> alters the list of the play list.
	* @param playList is the list of the play list.
	*/

	public void setPlayList(PlayList[] playList){
		this.playList = playList;
	}

	/**
	* <b>name:</b> getSongsPool <br>
	* Gets the songs in the pool.
	* <b>post:</b> gets the songs in the pool.
	* @return <code>Song</code> specifying songsPool is a list of the objects songs.
	*/

	public Song[] getSongsPool(){
		return songsPool;
	}

	/**
	* <b>name:</b> setSongsPool <br>
	* Alters the list of songs.
	* <b>post:</b> alters the list of the songs.
	* @param songsPool is the list of the songs.
	*/

	public void setSongsPool(Song[] songsPool){
		this.songsPool = songsPool;
	}
}