package modelo;

/* Serializable para poder salvar o objeto para arquivo */
public class Cliente implements java.io.Serializable {
    String Name;
    String Email;
    String Phone;
    public Endereco addres;
    
    public Cliente (String Name, String Email, String Phone, Endereco addres){
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.addres = addres;
    }
    
    public Cliente (){
        addres = new Endereco();
    }
    
    public void setName (String Name){
        this.Name = Name;
    }
    
    public void setEmail (String Email){
        this.Email = Email;
    }
    
    public void setPhone (String Phone){
        this.Phone = Phone;
    }
    
    public String getName (){
        return Name;
    }
    
    public String getEmail (){
        return Email;
    }
    
    public String getPhone (){
        return Phone;
    }
    
    @Override
    public String toString(){
        return "Cliente{Name="+Name+",Email="+Email+",Phone="+Phone+","+addres.toString()+"}";
    }
}
