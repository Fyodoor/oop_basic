package two.box_with_disks;

public class DiskAudio extends Disk{
    //polja

//    private String name;
    private String singer;
//    private int year;
    private int countOfTracks;



    // constructor
    public DiskAudio(String name, int year) {
        super(name, year);
    }

    @Override
    public void printAllInfo() {
        System.out.println(getName() + " " + getYear() + " " + getSinger() + " "
        + getCountOfTracks());
    }

    public DiskAudio(String name, int year, String singer, int countOfTracks) {
        super(name, year);
        this.singer = singer;
        this.countOfTracks = countOfTracks;
    }

    // methods


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCountOfTracks() {
        return countOfTracks;
    }

    public void setCountOfTracks(int countOfTracks) {
        this.countOfTracks = countOfTracks;
    }
}
