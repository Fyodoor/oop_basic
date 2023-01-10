package two.box_with_disks;

public class DiskVideo extends Disk{
    //Polja

//    private String name;
//    private int year;
    private String studio;
    private String director;
    private int longTime;



    //constructor
    public DiskVideo(String name, int year) {
        super(name, year);
    }

    @Override
    public void printAllInfo() {
        System.out.println(getName() + " " + getYear() + " " + getDirector() + " " + getStudio() + " "
        + getLongTime());
    }

    public DiskVideo(String name, int year, String studio, String director, int longTime) {
        super(name, year);
        this.studio = studio;
        this.director = director;
        this.longTime = longTime;
    }

    //methods


    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLongTime() {
        return longTime;
    }

    public void setLongTime(int longTime) {
        this.longTime = longTime;
    }
}
