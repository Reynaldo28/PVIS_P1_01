public class Billing {
    private Double precioli;
    private Double cantperd;
    private Double cupon;
    
    public Billing(Double p){
        this.precioli=p;
    }
     public Billing(Double p, Double c){
        this.cantperd=c;
        this.precioli=p;
        
    }
       public Billing(Double p, Double c, Double cu){
        this.cantperd=c;
        this.precioli=p;
        this.cupon=cu;
    }
    
    public Double computeBill(Double p) {
        
        return (precioli*0.8)+precioli;
    }
    
    
     public Double computeBill( Double p, Double c) {
        
        return (precioli*cantperd)*0.8;
    }
     public Double computeBill( Double p, Double c, Double cu) {
        
      return ((precioli*cantperd)*cupon)+(precioli*0.8);
    }
    
    public Double getPrecioli() {
        return precioli;
    }

    public void setPrecioli(Double precioli) {
        this.precioli = precioli;
    }
    
}