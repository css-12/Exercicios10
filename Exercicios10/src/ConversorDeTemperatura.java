
public class ConversorDeTemperatura {
    
    public double converterParaCelsius(double f) throws MenorQueZeroAbsolutoException{
        
        if(f < -459.67){
            
            throw new MenorQueZeroAbsolutoException("Temperatura menor que o zero absoluto");
        }
        return ((f - 32) * (5/9));
    }
    
    public double converterParaFahrenheit( double c) throws MenorQueZeroAbsolutoException{
        
        if( c < -273.15){
            
            throw new MenorQueZeroAbsolutoException("Temperatura menor que zero absoluto");
        }
        return ((c * (9/5)) + 32);
    }
    
}
