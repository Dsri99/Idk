public class SelectTeam extends GameLoop{
	
	public static int seekAvailableNum(Team t) {
		
		int x = 1;
		while (t.p[x] != null) {
			x = x+1;
		}
		return x;
	}
	public static void establishPlayer(Team t, Team.Player p ) {
		if (Team.isTeam(t, p)) {
			t.p[seekAvailableNum(t)] = p;
		}
	}
	public static Team barcelona() {
		//Barcelona
		Team barcelona = new Team("Barcelona");

			//Messi
			Team.Player messiL = new Team.Player("Messi", "Barcelona", 92, 95, 94, 88, 86, 90, 83, 68, 59, 68, 96, 87, 96, 83, 90, 94, 95, 90, 60, 86, 96, 83, 90, 92, 93, 93, 74, 78, 77, 75);
			establishPlayer(barcelona,messiL);
			
			//Iniesta
			Team.Player iniestaA = new Team.Player("Iniesta", "Barcelona", 85, 92, 87, 94, 94, 93, 84, 78, 70, 62, 82, 85, 86, 84, 80, 86, 94, 95, 81, 76, 96, 82, 90, 85, 89, 90, 75, 78, 68, 72);
			establishPlayer(barcelona,iniestaA);
			
			//Neymar
			Team.Player neymar = new Team.Player("Neymar", "Barcelona", 90, 82, 87, 86, 81, 88, 80, 66, 60, 69, 91, 85, 90, 83, 85, 92, 93, 87, 65, 82, 86, 85, 84, 92, 90, 94, 67, 75, 75, 80);
			establishPlayer(barcelona,neymar);
			
			//Suarez
			Team.Player suarezL = new Team.Player("Suarez", "Barcelona", 79, 82, 85, 86, 74, 83, 68, 83, 65, 82, 94, 90, 92, 89, 80, 83, 76, 80, 66, 83, 89, 85, 74, 83, 80, 84, 88, 89, 85, 89);
			establishPlayer(barcelona,suarezL);
			
			//Rakitic
			Team.Player rakiticI = new Team.Player("Rakitic", "Barcelona", 84, 78, 85, 88, 89, 92, 87, 72, 79, 71, 82, 85, 86, 80, 80, 83, 84, 85, 76, 80, 86, 82, 88, 88, 86, 84, 77, 70, 68, 80);
			establishPlayer(barcelona,rakiticI);
			
			//Busquets
			Team.Player busquetsS = new Team.Player("Busquets", "Barcelona", 88, 89, 82, 87, 83, 87, 73, 90, 83, 75, 71, 73, 73, 82, 72, 78, 87, 85, 85, 84, 86, 70, 85, 80, 88, 86, 88, 80, 73, 84);
			establishPlayer(barcelona,busquetsS);
			
			//Jordi Alba
			Team.Player albaJ = new Team.Player("Jordi Alba", "Barcelona", 80, 84, 82, 80, 83, 82, 86, 87, 82, 80, 76, 61, 73, 74, 90, 90, 79, 80, 84, 86, 80, 74, 82, 86, 84, 86, 78, 84, 72, 68);
			establishPlayer(barcelona,albaJ);
			
			//Mascherano
			Team.Player mascheranoJ = new Team.Player("Mascherano", "Barcelona", 80, 83, 76, 84, 84, 84, 74, 88, 86, 84, 70, 64, 80, 75, 72, 74, 85, 84, 89, 84, 86, 74, 77, 82, 76, 84, 83, 86, 73, 80);
			establishPlayer(barcelona,mascheranoJ);
			
			//Pique
			Team.Player piqueG = new Team.Player("Pique", "Barcelona", 80, 82, 73, 83, 84, 75, 65, 90, 87, 85, 71, 68, 65, 66, 67, 68, 85, 82, 88, 84, 84, 67, 81, 72, 73, 82, 86, 83, 84, 88);
			establishPlayer(barcelona,piqueG);
			
			//Dani Alves
			Team.Player alvesD = new Team.Player("Dani Alves", "Barcelona", 84, 85, 87, 85, 84, 85, 84, 85, 84, 80, 72, 85, 76, 84, 87, 87, 83, 86, 87, 85, 86, 86, 84, 84, 84, 87, 78, 82, 72, 67);
			establishPlayer(barcelona,alvesD);
			
			//Bravo
			Team.Player bravoC = new Team.Player("Bravo", "Barcelona", 84, 88, 84, 89);
			establishPlayer(barcelona,bravoC);
			
			//ter Stegen
			Team.Player terStegenM = new Team.Player("ter Stegen", "Barcelona", 82, 83, 84, 85);
			establishPlayer(barcelona,terStegenM);
			
			//Arda
			Team.Player turanA = new Team.Player("Arda", "Barcelona", 84, 82, 84, 83, 80, 82, 86, 72, 73, 70, 82, 84, 83, 82, 80, 84, 82, 87, 63, 77, 83, 83, 86, 84, 83, 85, 73, 76, 70, 70);
			establishPlayer(barcelona,turanA);
			
			//Mathieu
			Team.Player mathieuJ = new Team.Player("Mathieu", "Barcelona", 70, 73, 70, 76, 78, 74, 70, 84, 83, 80, 61, 67, 67, 68, 66, 64, 75, 77, 85, 80, 72, 73, 75, 70, 70, 76, 86, 86, 80, 83);
			establishPlayer(barcelona,mathieuJ);			
		return barcelona;
		
	}
	public static Team bayern () {
		//Bayern
		Team bayern = new Team("Bayern");

			//Lewandowski
			Team.Player lewandowskiR = new Team.Player("Lewandowski", "Bayern", 80, 83, 81, 83, 76, 80, 73, 72, 70, 76, 92, 90, 88, 88, 82, 78, 77, 79, 64, 80, 84, 88, 83, 82, 84, 83, 85, 85, 84, 87);
			establishPlayer(bayern,lewandowskiR);
			
			//Douglas Costa
			Team.Player costaDo = new Team.Player("Douglas Costa", "Bayern", 88, 83, 86, 82, 83, 83, 83, 65, 62, 73, 83, 82, 84, 80, 84, 89, 87, 84, 67, 76, 82, 80, 83, 90, 84, 86, 64, 83, 70, 65);
			establishPlayer(bayern,costaDo);
			
			//Thiago Alcantara
			Team.Player alcantaraT = new Team.Player("Thiago", "Bayern", 85, 83, 81, 84, 82, 80, 76, 72, 74, 76, 80, 83, 81, 77, 80, 84, 86, 83, 73, 72, 80, 80, 83, 84, 83, 86, 73, 80, 70, 70);
			establishPlayer(bayern,alcantaraT);
			
			//Vidal
			Team.Player vidalA = new Team.Player("Vidal", "Bayern", 83, 87, 83, 85, 83, 86, 80, 77, 72, 73, 82, 82, 83, 80, 77, 83, 84, 83, 73, 76, 79, 81, 81, 82, 83, 84, 76, 80, 76, 61);
			establishPlayer(bayern,vidalA);
			
			//Muller
			Team.Player mullerT = new Team.Player("Muller", "Bayern", 80, 83, 80, 76, 73, 83, 74, 70, 72, 76, 88, 83, 80, 84, 76, 77, 80, 76, 71, 84, 83, 84, 83, 82, 85, 80, 84, 86, 81, 85);
			establishPlayer(bayern,mullerT);
			
			//Ribery
			Team.Player riberyF = new Team.Player("Ribery", "Bayern", 86, 83, 87, 83, 86, 82, 87, 73, 72, 72, 82, 80, 83, 78, 88, 90, 84, 83, 62, 73, 83, 82, 83, 87, 86, 85, 80, 86, 70, 70);
			establishPlayer(bayern,riberyF);
			
			//Alaba
			Team.Player alabaD = new Team.Player("Alaba", "Bayern", 82, 84, 79, 83, 81, 79, 80, 83, 81, 75, 73, 80, 73, 72, 80, 74, 80, 77, 84, 82, 75, 76, 78, 76, 73, 80, 85, 84, 78, 84);
			establishPlayer(bayern,alabaD);
			
			//Boateng
			Team.Player boatengJ = new Team.Player("Boateng", "Bayern", 83, 80, 75, 82, 86, 85, 81, 85, 87, 79, 72, 78, 73, 81, 76, 72, 83, 84, 86, 83, 83, 83, 86, 69, 70, 83, 88, 84, 80, 86);
			establishPlayer(bayern,boatengJ);
			
			//Javi Martinez
			Team.Player martinezJ = new Team.Player("Martinez", "Bayern", 73, 76, 64, 80, 76, 73, 67, 86, 84, 75, 60, 62, 64, 65, 72, 70, 74, 76, 84, 80, 76, 70, 79, 76, 73, 77, 83, 84, 80, 83);
			establishPlayer(bayern,martinezJ);
			
			//Lahm
			Team.Player lahmP = new Team.Player("Lahm", "Bayern", 84, 82, 80, 83, 84, 80, 82, 82, 79, 75, 72, 78, 77, 73, 73, 76, 84, 83, 85, 85, 82, 71, 83, 81, 82, 84, 77, 80, 70, 72);
			establishPlayer(bayern,lahmP);
			
			//Neuer
			Team.Player neuerM = new Team.Player("Neuer", "Bayern", 88, 92, 90, 87);
			establishPlayer(bayern,neuerM);
			
			//Starke
			Team.Player starkeT = new Team.Player("Starke", "Bayern", 77, 79, 76, 82);
			establishPlayer(bayern,starkeT);
			
			//Gotze
			Team.Player gotzeM = new Team.Player("Gotze", "Bayern", 82, 85, 85, 83, 80, 84, 80, 73, 70, 70, 82, 83, 81, 80, 83, 84, 86, 85, 70, 78, 83, 81, 84, 83, 84, 80, 74, 79, 64, 65);
			establishPlayer(bayern,gotzeM);
			
			//Coman
			Team.Player alonsoX = new Team.Player("Alonso", "Bayern", 83, 86, 81, 84, 86, 84, 85, 79, 70, 73, 76, 83, 80, 83, 67, 73, 84, 85, 73, 83, 84, 82, 86, 83, 80, 85, 83, 78, 76, 80);
			establishPlayer(bayern,alonsoX);
		return bayern;
	}

}