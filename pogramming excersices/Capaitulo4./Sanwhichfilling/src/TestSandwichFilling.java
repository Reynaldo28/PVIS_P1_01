public class TestSandwichFilling {
    public static void main(String[]args){
        SandwichFilling sf1= new SandwichFilling ("tasajo",200);
        SandwichFilling sf2= new SandwichFilling ("salchicha",233);
        SandwichFilling sf3= new SandwichFilling ("atun",123);
        display(sf1);
        display(sf2);
        display(sf3);
    }

    private static void display(SandwichFilling s) {
        System.out.println("el sandwich de "+s.getFilling()+" tiene" +" "+s.getCalorias() +"  "+ "calorias");
    }
}