public class Intereses {
   private Double d;
   public Double dinero(){
       Double b = (d * 5) / 100;
       Double c = d + b;
       return c;
   }
    public void setD(Double d){
        this.d = d;
    }
    public Double getD(){
        return this.d;
    }
}