package domain;

public class Student {
    private  String name;
    private String id;
    private String career;
    private int year;
    private String cel;
    private String mail;
    private String direction;

    public Student(String name, String id, String career, int year, String cel, String mail, String direction) {
        this.name = name;
        this.id = id;
        this.career = career;
        this.year = year;
        this.cel = cel;
        this.mail = mail;
        this.direction = direction;
    }

    public Student() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
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
     * @return the cel
     */
    public String getCel() {
        return cel;
    }

    /**
     * @param cel the cel to set
     */
    public void setCel(String cel) {
        this.cel = cel;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", career=" + career + ", year=" + year + ", cel=" + cel + ", mail=" + mail + ", direction=" + direction + '}';
    }
    
    /**
     *
     * @return
     */
    public int sizeIntBytess(){
        return 4 +this.getCel().length()*2+ this.getName().length()*2 + this.getId().length()* 2 + this.getCareer().length()*2 +this.getMail().length()* 2 + this.getDirection().length()* 0x2;
        
    }
}