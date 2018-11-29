package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Estoque {
    /* hashMap ja implementa Serializable por padrao */
    public Map<String, Peca> estoqueMap;

    public Estoque() {
        this.estoqueMap = new HashMap<>();
    }
    
    public void addEstoque (Peca peca){
        estoqueMap.put(peca.getName(), peca);
    }
    
    public Peca getPeca (String Name){
        if(estoqueMap.containsKey(Name)){
            return estoqueMap.get(Name);
        }
        else
            return null;
    }
    
    public ArrayList<String> getPecasList(){
        ArrayList<String> pecalist = new ArrayList<>();
        
        estoqueMap.keySet().forEach((key) -> {
            pecalist.add(key);
        });
        
        return pecalist;
    }
}
