
        
        
      import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Conversion
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  
    void menu()throws IOException
    {
        while(true)
        {
        System.out.println("\nMENU");
        System.out.println("1.-DECIMAL => BINARIO");
        System.out.println("2.-DECIMAL => HEXADECIMAL");
        System.out.println("3.-DECIMAL => OCTAL\n");
      
        System.out.println("4.-BINARIO => DECIMAL");
        System.out.println("5.-BINARIO => HEXADECIMAL");
        System.out.println("6.-BINARIO => OCTAL\n");
      
        System.out.println("7.-HEXADECIMAL => DECIMAL");
        System.out.println("8.-HEXADECIMAL => BINARIO");
        System.out.println("9.-HEXADECIMAL => OCTAL\n");
      
        System.out.println("10.-OCTAL => DECIMAL");
        System.out.println("11.-OCTAL => BINARIO");
        System.out.println("12.-OCTAL => HEXADECIMAL\n");
        System.out.print("13.-SALIR\n OPCION: ");
      
        int opc=Integer.parseInt(in.readLine());
        String valor;
        System.out.print("\n");
      
            switch(opc)
            {
                case 1:
                    System.out.println("elegiste decimal a binario");
                    System.out.print("DECIMAL= ");
                    valor=in.readLine();
                    dec_bin(valor);
                    break;
                case 2:
                    System.out.println("Elegiste decimal a hexadecimal");
                    System.out.print("DECIMAL= ");
                    valor=in.readLine();
                    dec_hex(valor);
                    break;
                case 3:
                    System.out.println("elegiste decimal a octal");
                    System.out.print("DECIMAL= ");
                    valor=in.readLine();
                    dec_oct(valor);
                    break;
                case 4:
                    System.out.println("elegiste binario a decimal");
                    System.out.print("nBINARIO= ");
                    valor=in.readLine();
                    bin_dec(valor);
                    break;
                case 5:
                    System.out.println("elegiste binario a hexadecimal");
                    System.out.print("nBINARIO= ");
                    valor=in.readLine();
                    bin_hex(valor);
                    break;
                case 6:
                    System.out.println("elegiste binario a octal");
                    System.out.print("nBINARIO= ");
                    valor=in.readLine();
                    bin_oct(valor);
                    break;
                case 7:
                    System.out.println("elegiste hexadecimal a binario");
                    System.out.print("nHEXADECIMAL= ");
                    valor=in.readLine();
                    hex_dec(valor);
                    break;
                case 8:
                    System.out.println("elegiste hexadecimal a binario");
                    System.out.print("nHEXADECIMAL= ");
                    valor=in.readLine();
                    hex_bin(valor);
                    break;
                case 9:
                    System.out.println("elegiste hexadecimal a octal ");
                    System.out.print("HEXADECIMAL= ");
                    valor=in.readLine();
                    hex_oct(valor);
                    break;
                case 10:
                    System.out.println("octal a decimal ");
                    System.out.print("OCTAL= ");
                    valor=in.readLine();
                    oct_dec(valor);
                    break;
                case 11:
                    System.out.println("octal a binario");
                    System.out.print("OCTAL= ");
                    valor=in.readLine();
                    oct_bin(valor);
                    break;
                case 12:
                    System.out.println("octal a hexadecimal");
                    System.out.print("OCTAL= ");
                    valor=in.readLine();
                    oct_hex(valor);
                    break;
                case 13:
                    System.out.println(" fin del programa gracias ");
                    System.exit(0);
                    break;
            }
        }
    }
  
    void dec_bin(String valor)
    {
        int dec=Integer.parseInt(valor);
        valor=Integer.toBinaryString(dec);
        System.out.print("BINARIO: "+valor);
    }
  
    void dec_hex(String valor)
    {
        long dec=Integer.parseInt(valor);
        valor=Integer.toHexString((int) (long) dec);
        System.out.print("HEXADECIMAL: "+valor);
    }
  
    void dec_oct(String valor)
    {
        long dec=Integer.parseInt(valor);
        valor=Integer.toOctalString((int) (long) dec);
        System.out.print("OCTAL: "+valor);
    }
  
    void bin_dec(String valor)
    {
        long dec=Integer.parseInt(valor,2);
        System.out.print("DECIMAL: "+dec);
    }
  
    void bin_hex(String valor)
    {
        long dec=Integer.parseInt(valor,2);
        valor=Integer.toHexString((int) dec);
        System.out.print("HEXADECIMAL: "+valor);
    }
  
    void bin_oct(String valor)
    {
        long dec=Integer.parseInt(valor,2);
        valor=Integer.toOctalString((int) dec);
        System.out.print("OCTAL: "+valor);
    }
  
    void hex_dec(String valor)
    {
        long dec=Integer.parseInt(valor,16);
        System.out.print("DECIMAL: "+dec);
    }
  
    void hex_bin(String valor)
    {
        long dec=Integer.parseInt(valor,16);
        valor=Integer.toBinaryString((int) (long) dec);
        System.out.print("BINARIO: "+valor);
    }
  
    void hex_oct(String valor)
    {
        long dec=Integer.parseInt(valor,16);
        valor=Integer.toOctalString((int) dec);
        System.out.print("OCTAL: "+valor);
    }
  
    void oct_dec(String valor)
    {
        long dec=Integer.parseInt(valor,8);
        System.out.print("DECIMAL: "+dec);
    }
  
    void oct_bin(String valor)
    {
        long dec=Integer.parseInt(valor,8);
        valor=Integer.toBinaryString((int) (long) dec);
        System.out.print("BINARIO: "+valor);
    }
  
    void oct_hex(String valor)
    {
        long dec=Integer.parseInt(valor,8);
        valor=Integer.toHexString((int) (long) dec);
        System.out.print("HEXADECIMAL: "+valor);
    }
  
    public static void main(String [] args) throws IOException
    {
        Conversion conversion=new Conversion();
        conversion.menu();
    }
}


