package sample;

import java.util.Date;

public class AudioPlayer extends Product implements MultimediaControl {

    /* We require a concrete class that will allow us to capture the details of an audio player.
     * Create a class called AudioPlayer that is a subclass of Product and implements the
     * MultimediaControl interface.
     */

    // JP 5: The class will have 2 fields
    // String audioSpecification
    // ItemType mediaType
    private String audioSpecification;
    private ItemType mediaType;

    // Create a constructor that will take in 2 parameters – name and audioSpecification.
    // The constructor should call its parents constructor and also setup the media type.


    AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.AUDIO;
    }


    /* JP 5: Implement the methods from the MultimediaControl interface by simply
     * writing the action to the console.
     * E.g. in play System.out.println("Playing"); Normally we would have code that
     * would instruct the media player to play, but we will simply display a message */

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Track stopped");
    }

    @Override
    public void previous() {
        System.out.println("Returning to previous");

    }

    @Override
    public void next() {
        System.out.println("Skipping to next");

    }

    public String toString() {
        return super.toString() + "Audio Specification: " + audioSpecification + "\nMedia Type: "
                + mediaType + "\n";
    }

    @Override
    public int compareTo(Product product) {
        int comparer;
        comparer = this.name.compareTo(product.getName());
        return comparer;
    }

    // added to remove the implementation error from interface
    @Override
    public Date getManufactureDate(Date curDate) {
        return null;
    }
}
