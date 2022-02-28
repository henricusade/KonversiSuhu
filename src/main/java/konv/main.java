package konv;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int temp;
        
        System.out.print("\nProgram Konversi Suhu \n--------------------\n\nInput Data\n---------------");
        System.out.print("\nSuhu dalam celcius : "); 
        double cel = Input.nextDouble();
        konversii kvsi = new konversii();
        kvsi.c = cel;  
        
        do{
            System.out.print("\nOpsi \n-----------\n1. Lihat Data Konversi \n2. Edit Data Konversi");
            System.out.print("\n3. Exit \nMasukkan opsi : "); int pil = Input.nextInt(); temp = pil;
            
            switch (pil){
                case 1: kvsi.hitung(); break;
                
                case 2: System.out.print("\nInput Data \n-----------\nSuhu dalam celcius : ");
                        double cel2 = Input.nextDouble();
                        kvsi.c = cel2; break;
                
                case 3: System.out.print("\n Terimakasih");
                
                default : System.out.print("\n Opsi yang anda masukkan tidak tersedia\n");
            
            }
        
        }while ( temp != 3);
        
        
        
    }
    
}
