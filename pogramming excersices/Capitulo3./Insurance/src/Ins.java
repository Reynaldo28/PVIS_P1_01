public class Ins {
    private Integer edad;
    public Integer mensualidad(){
        Integer d = edad / 10;
        Integer r = (d + 15) * 20;
        return r;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public Integer getEdad(){
        return this.edad;
    }
}