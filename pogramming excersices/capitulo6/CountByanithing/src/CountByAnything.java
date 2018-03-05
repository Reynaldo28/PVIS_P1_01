public class CountByAnything {
    public static void main(String[]args){
        int n = 0;
        
        while(n <= 10){
            n = n + 5;
            System.out.println(n);
            if(n % 50 == 0){
                System.out.printf("\n %d",n);
            }
        }
    }
}