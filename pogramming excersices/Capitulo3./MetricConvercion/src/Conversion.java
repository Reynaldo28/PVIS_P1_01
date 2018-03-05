public class Conversion {
    private Double i;
    private Double g;
    public Double conversion1(){
        Double r = i * 2.54;
        return r;
    }
    public Double conversion2(){
        Double r2 = g * 3.7854;
        return r2;
    }
    public void setI(Double i){
        this.i = i;
    }
    public Double getI(){
        return this.i;
    }
    public void setG(Double g){
        this.g = g;
    }
    public Double getG(){
        return this.g;
    }
    
}