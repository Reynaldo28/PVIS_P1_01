

public class Paintp {
    private Double l;
    private Double a;
    private Double h;
    public Double calcularPrecio(){
        Double r1 = (h * l) * 2;
        Double r2 = (h * a) * 2;
        Double r3 = r1 + r2;
        Double r4 = (r3 / 350) * 32;
        return r4;
    }
    public void setL(Double l){
        this.l = l;
    }
    public Double getL(){
        return this.l;
    }
    public void setA(Double a){
        this.a = a;
    }
    public Double getA(){
        return this.a;
    }
    public void setH(Double h){
        this.h = h;
    }
    public Double getH(){
        return this.h;
    }
    
}