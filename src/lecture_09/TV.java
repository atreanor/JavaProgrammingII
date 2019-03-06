package lecture_09;
/*
 * Class defines a remote control device
 */
public class TV {
	// create current channel, current volume & TV on/off variables
	int channel;
	int volume;
	boolean on;
	
	// Class constructor
	TV() {
		channel = 1; // set default channel to 1
		volume = 5; // set default volume to 5
		on = false; // by default the TV is off
	}
	// method turns on TV
	void turnOn() {
		if(!on) {
			on = true;
		}
	}
	
	// method turns off TV
	void turnoff() {
		if (on) {
			on = false;
		}
	}
	
	// method sets a new channel for this TV
	void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
	// method sets a new volume level for this TV
	void setVolume(int newVolume) {
		if (on && newVolume >= 0 && newVolume <= 50) {
			volume = newVolume;
		}
	}
	
	// method increases the channel number by 1
	void channelUp() {
		if ( on && channel < 120) {
			channel++;
		}
	}
	
	// method decreases the channel number by 1
	void channelDown() {
		if (on & channel > 1) {
			channel--;
		}
	}
	
	// method increases the volume level by 1
	void volumeUp() {
		if (on && volume < 50) {
			volume++;
		}
	}
	
	// method decreases the volume level by 1
	void volumeDown() {
		if (on && volume > 1) {
			volume--;
		}
	}
}
