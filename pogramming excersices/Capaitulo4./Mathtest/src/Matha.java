public class Matha {
    private Double raiz;
    private Double  seco;
    private Double  seco2;
    private Double  piso;
    private char    d ;
    private Integer numero;
    
    
    public Matha(Double r, Double s,Double s2 , Double p, char d, Integer n){
        this.raiz=Math.sqrt(r); 
        this.seco= Math.sin(s);
        this. seco2=  Math.cos(s2);
        this.piso=p;
        this.d=d;
        this.numero=n;
    }

    public Double getSeco2() {
        return seco2;
    }

    public void setSeco2(Double seco2) {
        this.seco2 = seco2;
    }

    public Integer getN() {
        return numero;
    }

    public void setN(Integer n) {
        this.numero = n;
    }
    
  

    public Double getRaiz() {
        return raiz;
    }

    public void setRaiz(Double raiz) {
        this.raiz = raiz;
    }

    public Double getSeco() {
        return seco;
    }

    public void setSeco(Double seco) {
        this.seco = seco;
    }

    public Double getPiso() {
        return piso;
    }

    public void setPiso(Double piso) {
        this.piso = piso;
    }

    public char getD() {
        return d;
    }

    public void setD(char d) {
        this.d = d;
    }

   
    
    public String toString (){
        return " "+raiz+" "+seco+" "+seco2+"numero"+numero;
    }
}