

public class ArithmeticMethodos {
    public static void main(String[]args){
        Arit operacion = new Arit();
        Integer n = 90;
        operacion.setNum(n);
        Integer re1 = operacion.sumauno();
        Integer re2 = operacion.sumaDos();
        Integer re3 = operacion.sumaTres();
        System.out.println("La primer suma es: " + re1);
        System.out.println("La segunda suma es: " + re2);
        System.out.println("La tercera suma es: " + re3);
    }
}
