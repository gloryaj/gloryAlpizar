package domain;

public class Books extends Material{
    
    private int year;
    private String author;
    private boolean digital;

    public Books() {
        super();
    }

    public Books(int year, String author, boolean digital) {
        this.year = year;
        this.author = author;
        this.digital = digital;
    }

    public Books(int year, String author, boolean digital, String name, String code, int cantidad, boolean available) {
        super(name, code, cantidad, available);
        this.year = year;
        this.author = author;
        this.digital = digital;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the digital
     */
    public boolean isDigital() {
        return digital;
    }

    /**
     * @param digital the digital to set
     */
    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    @Override
    public String toString() {
        return super.toString()+"Books{" + "year=" + year + ", author=" + author + ", digital=" + digital + '}';
    }
    
}
