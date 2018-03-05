public class Patient {
    private String  identificacion;
    private Integer edad;
    private String bloodData;

     public Patient(String i,String b, Integer e){
      this.identificacion=i;
      this.edad=e;
      this.bloodData=b;
       
   }
   public Patient(){
      this.identificacion="0";
      this.edad=0;
      this.bloodData="0+";
       
   }
   
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTiposangre() {
        return bloodData;
    }

    public void setTiposangre(String tiposangre) {
        this.bloodData = tiposangre;
    }
   
    public String toString(){
        
        return "Edad"+edad+"identificacion"+identificacion+"tipo de sangre"+bloodData;
        
        
        
    }
    
            
}