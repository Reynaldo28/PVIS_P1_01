public class Bread {
    private String pan;
    private Integer calorias;
    public final static String MOTTO = "The staff of life";
    public Bread(String b, Integer c){
        this.pan=b;
        this.calorias=c;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }
}