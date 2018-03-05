public class Percentages {
    public static void main(String[]args){
        ComputePercent p = new ComputePercent();
        Double a1 = 2.0;
        Double a2 = 5.0;
        p.setA(a1);
        p.setB(a2);
        Double r = p.porcentaje();
        System.out.println("tu porcentaje es: " + r + "%");
    }
}
