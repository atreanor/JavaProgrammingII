package lecture_09;
/*
 * Class to test TV class
 */
public class TestTV {  
	// main method
	public static void main(String[] args) {
		// Create tv1
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(10);

		System.out.println("tv1: channel is " + tv1.channel + 
				" and volume level is " + tv1.volume);

		// Create tv2
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();

		System.out.println("tv2: channel is " + tv2.channel + 
				" and volume level is " + tv2.volume);
	}
}
