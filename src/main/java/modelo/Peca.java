package modelo;

import java.math.BigDecimal;

/* Serializable para poder salvar o objeto para arquivo */
public class Peca implements java.io.Serializable {
    /* essa peca que vc queria? */
    int ID;
    String Name;
    int Quant;
    double Price;
    
    public Peca (){
        //Constructor para peça sem argumentos
    }
    
    public void setQuant (int Quant){
        this.Quant = Quant;
    }
    
    public int getID (){
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public String getName (){
        return Name;
    }
    
    public void setName(String name){
        this.Name = name;
    }
    
    public int getQuant (){
        return Quant;
    }
    
    public double getPrice (){
        return Price;
    }
    
    public void setPrice(Double Price){
        this.Price = Price;
    }
    
}
