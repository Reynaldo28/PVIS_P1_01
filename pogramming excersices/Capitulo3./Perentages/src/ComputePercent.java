public class ComputePercent {
    private Double a;
    private Double b;
    public Double porcentaje(){
        Double r = (a * 100)/b;
        return r;
    }
    public void setA(Double a){
        this.a = a;
    }
    public Double getA(){
        return this.a;
    }
    public void setB(Double b){
        this.b = b;
    }
    public Double getB(){
        return this.b;
    }
}