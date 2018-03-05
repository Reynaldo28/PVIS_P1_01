public class TestDigitalCamera {
    private String marca;
    private Integer pixeles;
    
    public TestDigitalCamera(String m, Integer p){
        if(p > 10){
            p = 10;
        }
        this.marca = m;
        this.pixeles = p;
    }
    public Integer calcularPrecio(){
        Integer pre = 0;
        if(pixeles <= 6){
            pre = 99;
        }else{
            pre = 129;
        }
        return pre;
    }
    public String toString(){
        return "La marca es " + marca + " la resolución es " + pixeles + " pixeles"; 
    }
    public void setMarca(String m){
        this.marca = m;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setPixeles(Integer p){
        this.pixeles = p;
    }
    public Integer getPixeles(){
        return this.pixeles;
    }
    
}