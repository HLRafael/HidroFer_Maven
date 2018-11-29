package modelo;

import java.math.BigDecimal;

/* Serializable para poder salvar o objeto para arquivo */
public class maoDeObra implements java.io.Serializable {
    String Company;
    double Price;
    
    public maoDeObra (String Company){
        this.Company = Company;
    }
    
    public maoDeObra (){
    
    }
    
    public void setComplany (String company){
        this.Company = company;
    }
    
    public void setPrice (Double Price){
        this.Price = Price;
    }
    
    public String getCompany (){
        return Company;
    }
    
    public Double getPrice (){
        return Price;
    }
    
    /* Funcao para debugar */
    @Override
    public String toString(){
        return "maoDoObra{Company="+Company+",Price="+Price+"}";
    }
}
