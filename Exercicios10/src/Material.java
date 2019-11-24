
public class Material {
    
    private String nome;
    private int quantidade;
    
    public Material(String n, int q) throws QuantidadeInvalidaException{
        this.setNome(n);
        this.setQuantidade(q);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public double getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int q) throws QuantidadeInvalidaException{
        
        if(q < 0){
            throw new QuantidadeInvalidaException("Quantidade Inválida");
        }
        this.quantidade = q;
    }
    
}
