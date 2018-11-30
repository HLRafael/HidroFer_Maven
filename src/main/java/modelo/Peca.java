package modelo;

/* Serializable para poder salvar o objeto para arquivo */
public class Peca implements java.io.Serializable {
    /* essa peca que vc queria? */
    /* ID esta relacionado ao estoque, ainda nao implementado */
    /* int ID; */
    String Name;
    String Tipo;
    int Quant;
    double Price;
    
    public Peca (String Name, String Tipo, int Quant, double Price){
        this.Name = Name;
        this.Tipo = Tipo;
        this.Quant = Quant;
        this.Price = Price;
    }
    
    public Peca (){
        //Constructor para peça sem argumentos
    }
    
    public void setType (String Tipo){
        this.Tipo = Tipo;
    }
    
    public String getType (){
       return this.Tipo;
    }
    
    public void setQuant (int Quant){
        this.Quant = Quant;
    }
    
//    public int getID (){
//        return ID;
//    }
    
//    public void setID (int ID){
//        this.ID = ID;
//    }
    
    public String getName (){
        return Name;
    }
    
    public void setName (String name){
        this.Name = name;
    }
    
    public int getQuant (){
        return Quant;
    }
    
    public double getPrice (){
        return Price;
    }
    
    public void setPrice (Double Price){
        this.Price = Price;
    }
}
