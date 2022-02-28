package konv;

public class konversii {
    double c,r,f,k;
    
    konversii(){
    this.c = c;
    }
    
    void hitung(){
        
        r = (4 * c)/5;
        f = (9 * c)/5 + 32;
        k = c + 273.15;
        
        System.out.println("\n- Suhu dalam celcius      : " + c +" C ");
        System.out.println("- Suhu dalam reamur       : " + r +" C ");
        System.out.println("- Suhu dalam fahrenheit   : " + f +" C ");
        System.out.println("- Suhu dalam kelvin       : " + k +" C ");
        
        if(c>0 && c<100){System.out.println("Kondisi Air Normal");}
        else if(c<=0){System.out.println("Kondisi Air Beku");}
        else if(c>=100){System.out.println("Kondisi Air Mendidih");}
    }
    
    
    
}
