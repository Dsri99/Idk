public class Team extends SelectTeam {
	public String name;
	public boolean hasBall;
	
	public Team(String Name) {
		name = Name;
	}
	
	public static boolean isTeam(Team t, Player p) {
		if (p.team == t.name) {
			return true;
		}
		else {
			return false;
		}
	}
	public static class Player {

		public int currentX;
		public int currentY;
		boolean hasBall;
		
		//Pitch Position Coordinates
		public int xPos;
		public int yPos;
		public int sumPos = xPos + yPos;
		
		public boolean isTeam;
		public String name; //y
		public String team; //y
		
		// Simple Stats Created
		public int age;
		public int gamesPlayed; 
		public int sprintSpeed; //y
		public int acceleration;
		public int control; //y
		public int agility; //y
		public int balance; //y
		public int technique; //y
		public int creativity; //y
		public int strenght; //y
		public int intercept; //y
		public int stamina; //y
		public int accuracy; //y
		public int shotPower; //y
		public int confort;	
		public int vision; //y
		public int aggressiveness; //y
		public int heading;
		public int jump;
		

		//Keeper Stats
		public int positioning;
		public int reflexes;
		public int distribution;
		public int diving;
		
		//Sumed Stats Created
		
		public int shooting; //y
		public int passing; //y
		public int retention; //y 
		public int experience; //y
		
		//Complex Stats Created //y
		public static class dribbling {
			static int technicalD;
			static int retensiveD;
			static int traslatoryD;
		}
		public static class pass {
			static int shortP;
			static int longP;
			static int throughP;
			static int crossP;
			
		}
		public static class tackle {
			static int standingT;
			static int slideT;
			static int foulT;
		}
		public static class shoot {
			static int finishingS;
			static int longS;
			static int finesseS;
			static int flairS;
		}
		

		public Player (String Name, String Team, /*Keeper Stats */ int Positioning, int Reflexes, int Distribution, int Diving) {
			name = Name;
			team = Team;
			positioning = Positioning;
			reflexes = Reflexes;
			distribution = Distribution;
			diving = Diving;
		}
		public Player (String Name, String Team,/*Dribbles*/ int TechnicalD, int RetensiveD, int TraslatoryD, /*Passes*/ 
		int ShortP, int LongP, int ThroughP, int CrossP, /*Tackles*/ int StandingT, int SlideT,int FoulT, /*Shots*/ int FinishingS,
		int LongS, int FinesseS, int FlairS, /*Other Stats*/ int SprintSpeed, int Acceleration, int Technique,
		int Creativity, int Intercept, int Stamina, int Accuracy, int ShotPower, int Vision,int Agility, int Balance,
		int Control, int Strenght, int Aggressiveness, int Jump, int Heading) {
			
			//Simple Stats Define
			name = Name;
			team = Team;
			sprintSpeed = SprintSpeed;
			acceleration = Acceleration;
			technique = Technique;
			creativity = Creativity;
			intercept = Intercept;
			stamina = Stamina;
			accuracy = Accuracy;
			shotPower = ShotPower;
			vision = Vision;
			agility = Agility;
			balance = Balance;
			control = Control;
			strenght = Strenght;
			aggressiveness = Aggressiveness;
			jump = Jump;
			heading = Heading;
			
			//Positioning
			
			//Complex Stats Define
			
			//Dribbles
				dribbling.technicalD = TechnicalD;
				dribbling.retensiveD = RetensiveD;
				dribbling.traslatoryD = TraslatoryD;
				
			//Passes
				pass.shortP = ShortP;
				pass.longP = LongP;
				pass.throughP = ThroughP;
				pass.crossP = CrossP;
			
			//Tackles
				tackle.standingT = StandingT;
				tackle.slideT = SlideT;
				tackle.foulT = FoulT;
				
			//Shots
				shoot.finishingS = FinishingS;
				shoot.longS = LongS;
				shoot.finesseS = FinesseS;
				shoot.flairS = FlairS;
				
			//Summed Stats Define
			shooting = (accuracy + technique + shotPower + shoot.finishingS + shoot.longS + shoot.finesseS + shoot.flairS) /7 ;
			passing = (pass.shortP + pass.longP + pass.throughP + vision) /4;
			retention = (agility + balance + dribbling.technicalD + dribbling.retensiveD + dribbling.traslatoryD + control + strenght)/7;
			experience = (age + gamesPlayed)/2;
		}
	}
	Player [] p = new Player[60];
}