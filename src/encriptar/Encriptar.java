package encriptar;


public class Encriptar {
    String cadena = "";
    
    
    public void leerCadena(String cadena){
        this.cadena = cadena;
        char[] ArrayCad = new char[cadena.length()];
        int[] ArrayAscii = new int[cadena.length()];
        
        for (int i=0;i<cadena.length();i++){
            ArrayCad[i] = cadena.charAt(i);
            //System.out.println(ArrayCad[i]);//
        }
        
        for (int i=0;i<cadena.length();i++){
            ArrayAscii[i]= (int)ArrayCad[i];
            System.out.println(ArrayAscii[i]);
        }
        
        
    }
    
   
}
