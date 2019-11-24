
public class TestaMaterial {
    
    public static void main(String[] args){
        
        try{
            
            Material m1 = new Material("Cobre", -10);
            
        }catch(QuantidadeInvalidaException ex){
            
            System.out.println(ex.getMessage());
            
        }
    }
    
}
