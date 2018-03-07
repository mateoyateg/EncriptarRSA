package encriptar;
import encripta.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,p,q,fi,z,s;
        
        Encriptar e = new Encriptar();
        e.leerCadena("JUNIOR TU PAPA");
        
        System.out.println("Ingrese el numero primo n");
        n = sc.nextInt();
        
        System.out.println("Ingrese el numero primo p");
        p = sc.nextInt();
        
        System.out.println("Ingrese el numero primo q");
        q = sc.nextInt();
        
        fi = (p-1)*(q-1);
        z=p*q;
        
        s=n+1;
        
        while ( (n*s)%fi !=1 ){
          s++;  
        }
        
        
        
    }
}
