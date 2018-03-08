package encriptar;


public class Encriptar {
    String cadena = "";
    private char[] aux2;
    
    
    public char[] transcribirCadena(String cadena){
        this.cadena = cadena;
        char[] ArrayCad = new char[cadena.length()];
        
        for (int i=0;i<cadena.length();i++){
            ArrayCad[i] = cadena.charAt(i);
        }
        
        return (ArrayCad);
    }
    
    
    public int[] asciiCadena(char[] ArrayCad){
        int[] ArrayAscii = new int[cadena.length()];
        this.aux2 = ArrayCad;
        
        for (int i=0;i<cadena.length();i++){
            ArrayAscii[i]= (int)ArrayCad[i];
        }
        
        return (ArrayAscii);
        
        
    }
    
   
}
