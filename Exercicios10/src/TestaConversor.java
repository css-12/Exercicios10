
public class TestaConversor {
    
    public static void main(String[] args){
        
        try{
            
            ConversorDeTemperatura c1 = new ConversorDeTemperatura();
            c1.converterParaCelsius(-500);
            c1.converterParaFahrenheit(-300);
            
        }catch(MenorQueZeroAbsolutoException ex){
            
            System.out.println(ex.getMessage());
        }
    }
    
}
