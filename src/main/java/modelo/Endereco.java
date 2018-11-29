package modelo;

/* Serializable para poder salvar o objeto para arquivo */
public class Endereco implements java.io.Serializable{
    String Street;
    String CEP;
    String Number;
    
    public Endereco (String Street, String CEP, String Number){
        this.Street = Street;
        this.CEP = CEP;
        this.Number = Number;
    }
    
    public Endereco (){
        
    }
    
    public String getStreet (){
        return Street;
    }
    
    public String getCEP (){
        return CEP;
    }
    
    public String getNumber (){
        return Number;
    }
    
    public void setStreet(String Street){
        this.Street = Street;
    }
    
    public void setCEP(String CEP){
        this.CEP = CEP;
    }
    
    public void setNumber(String Number){
        this.Number = Number;
    }
    
    @Override
    public String toString(){
        return "Enderco{Street="+Street+",CEP="+CEP+",Number="+Number+"}";
    }
}
