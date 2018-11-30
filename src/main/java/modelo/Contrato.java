package modelo;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Serializable para poder salvar o objeto para arquivo */
public class Contrato implements java.io.Serializable {
    String ID; /* ID consiste da data de criacao do contrato */
    Date date;
    String localDePerfuracao;
    public Cliente client;
    public maoDeObra labor; 
    public HashMap<String, Peca> pecasMap;
    float Total;
    boolean Type; /* true é contrato, flase é orcamento preventivo */
     
    public Contrato (){
        /* Criacao do ID do contrato no momento da criacao do objeto */
        this.ID = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);
        client = new Cliente();
        date = new Date();
        labor = new maoDeObra();
        pecasMap = new HashMap<>();
    }
    
    public String getID (){
        return ID;
    }
    
    public Date getDate (){
        return date;
    }
    
    public void setDate (Date set){
        this.date = set;
    }
    
    public void setID (String set){
        this.ID = set;
    }
    
    public void setLocalP(String localP){
        this.localDePerfuracao = localP;
    }
    
    public String getLocalP(){
        return this.localDePerfuracao;
    }
    
    public boolean getType(){
        return this.Type;
    }
    
    public void setType(boolean type){
        this.Type = type;
    }
    
    public void addPeca(Peca toAdd){
        this.pecasMap.put(toAdd.getName(), toAdd);
    }
    
    /* calcula e seta o total, pecas + maodeobra */
    void calculateAndSetTotal(){
        this.Total = 0f;
        this.Total += this.labor.getPrice();
        this.pecasMap.keySet().forEach((String key) -> {
            Total += pecasMap.get(key).getPrice();
        });
    }
    
    /* usado para debugar */
    @Override
    public String toString(){
        return "Contrato{ID="+ID+",Date="+date.toString()+",localDePerfuracao="+localDePerfuracao+","+client.toString()+","+labor.toString()+"}";
    }
    
    public void setHashMap(HashMap<String,Peca> toSet){
        this.pecasMap = new HashMap<>(toSet);
    }
    /* TODO: Terminar metodos */
}
