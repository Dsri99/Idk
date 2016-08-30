import java.util.Scanner;

public class Match {
	public static void probe(String s) {
		System.out.println("||PROBE " + s);
	}
	
	public static void space(int d) {
	int x = 1;
		while(x <= d){
			System.out.println(" ");
			x = x+1;
		}
	}
	
	static Team playerTeam;
	static Team computerTeam;
	public static boolean teamName(String s,Team t) {
		if (s.equals(t.name)) {
			return true;
		}
		else {
			return false;
		}
	}
		@SuppressWarnings("resource")
		public static void assignPositions(Team t) {
			int x = 1;
			while (t.p[x] != null) {
			String inputX;
			int xResult;
			//XPos
			System.out.print("Assign " + t.p[x].name + " to: (x coordinate) ");
			
			//Gives xResult var given by user and parses it into an integer
			Scanner user_inputX = new Scanner(System.in);
			inputX = user_inputX.next();
			xResult = Integer.parseInt(inputX);
			//**
			t.p[x].xPos = xResult;
			
			//YPos
			String inputY;
			int yResult;
			System.out.print("Assign " + t.p[x].name + " to: (y coordinate) ");
			
			//Gives yResult var given by user and parses it into an integer
			Scanner user_inputY = new Scanner(System.in);
			inputY = user_inputY.next();
			yResult = Integer.parseInt(inputY);
			//**
			
			t.p[x].yPos = yResult;
			
			x = x+1;
			}
		}
	public static void printPlayers(Team t) {
		int x = 1;
		System.out.println(t.name);
		space(1);
		while (t.p[x] != null) {
			System.out.println(t.p[x].name);
			x = x+1;
		}
		space(2);
	}
	public static Team.Player seekSpot(Team t, int x, int y) {
		int val = 1;
		while (t.p[val] != null) {
			if (t.p[val].currentX == x && t.p[val].currentY == y) {
				return t.p[val];
			}
			else {
				val = val + 1;
			}
		}
		return t.p[val];
	}
	public static Team.Player seekRow(Team t, int y) {
		int val = 1;
		while (t.p[val] != null) {
			if (t.p[val].currentY == y) {
				return t.p[val];
			}
			else {
				val = val + 1;
			}
		}
		return t.p[val];
	}
	public static Team.Player seekColumn(Team t, int y) {
		int val = 1;
		while (t.p[val] != null) {
			if (t.p[val].currentY == y) {
				return t.p[val];
			}
			else {
				val = val + 1;
			}
		}
		return t.p[val];
	}
	public static class Game {
		public static void changeStatus() {
			
		}
		public static void main() {
			int x = 1;
	 		while (x < 12660000) {
	 			changeStatus();
				probe(String.valueOf(x));
				x = x + 1;
			}
		}
	}
	public static void startMatch(Team pl, Team com) {
		int x = 1;
		int y = 1;
		while (pl.p[x] != null) {
			pl.p[x].currentX = pl.p[x].xPos;
			pl.p[x].currentY = pl.p[x].yPos;
			x = x+1;
		}
		while (com.p[y] != null) {
			com.p[y].currentX = com.p[y].xPos;
			com.p[y].currentY = com.p[y].yPos;
			y = y+1;
		}
	}
	public static void giveBall(Team.Player p) {
		if (!(p.hasBall)) {
			p.hasBall = true;
		}
	}
	public static void takeBall(Team.Player p) {
		if (p.hasBall) {
			p.hasBall = false;
		}
	}
	public static void main() {
		System.out.print("Player 1 team: ");
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		String input;
		input = user_input.next();
		
		if (teamName(input,SelectTeam.barcelona())) {
			playerTeam = SelectTeam.barcelona();
			computerTeam = SelectTeam.bayern();
			System.out.println("The player's team is now defined as " + playerTeam.name);
			System.out.println("The com's team is now defined as " + computerTeam.name);
			space(1);
			printPlayers(SelectTeam.bayern());
			printPlayers(SelectTeam.barcelona());
		}
		if (teamName(input,SelectTeam.bayern())) {
			playerTeam = SelectTeam.bayern();
			computerTeam = SelectTeam.barcelona();
			space(1);
			System.out.println("The player's team is now defined as " + playerTeam.name);
			System.out.println("The com's team is now defined as " + computerTeam.name);
			printPlayers(SelectTeam.barcelona());
			printPlayers(SelectTeam.bayern());
		}
		System.out.println(playerTeam.name + "'s lineup:");
		assignPositions(playerTeam);
		space(2);
		System.out.println(computerTeam.name + "'s lineup:");
		assignPositions(computerTeam);
		startMatch(playerTeam,computerTeam);
		space(1);

		Game.main();
	
		//Ends Loop
		GameLoop.stop();
	}
}
	