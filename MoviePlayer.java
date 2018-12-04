package sample;

public class MoviePlayer extends Product implements MultimediaControl {


// JP Project Step 11
// Create a class called MoviePlayer that extends Product and implements MultimediaControl.


// Add 2 fields to this class called screen and monitor type and assign appropriate types to them.

private Screen screen;
private MonitorType monitorType;

// Complete the methods from the MultimediaControl interface in a similar fashion to the audio
// player.
// Create a toString method that calls the product toString, displays the monitor
// and the screen details.

MoviePlayer(String name, Screen screen, MonitorType monitorType) {
	super(name);
	this.screen = screen;
	this.monitorType = monitorType;
}

  @Override
  public void play() {
    System.out.println("Playing current track");

  }

  @Override
  public void stop() {
    System.out.println("Current track stopped");

  }

  @Override
  public void previous() {
    System.out.println("Returning to previous track");

  }

  @Override
  public void next() {
    System.out.println("Skipping to next track");

  }
  
  @Override
  public String toString() {
	  
	 return super.toString() + screen + "Monitor Type: " + monitorType + "\n";
	  
  }

  // added to remove interface error
    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
