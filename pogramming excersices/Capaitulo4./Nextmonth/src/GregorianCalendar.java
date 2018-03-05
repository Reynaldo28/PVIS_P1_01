public class GregorianCalendar {
    private Integer dia;
   
    public  GregorianCalendar(Integer d) {
    this.dia=31-d;
    
}
   

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

  public String toString(){
      return "aun faltan :" +dia+" dias para que sea el siguiente mes";
  }
    
}