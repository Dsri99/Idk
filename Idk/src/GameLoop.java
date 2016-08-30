public class GameLoop {
	public static boolean running = false;
	
	public static void run() {
		while(running) {
			Match.main();
		}
	}
	public static void stop() {
		running = false;
	}
	public static void start() {
		running = true;
	}
	public static void main(String [] args) {
		start();
		run();
	}
}