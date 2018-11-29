package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class listaContrato {
    /* hashMap ja implementa Serializable por padrao */
    public Map<String, Contrato> contratoMap;
        
    public void writeContrato (String fileName){
        try{
            File fileOne = new File(fileName);
            FileOutputStream fos = new FileOutputStream(fileOne); 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.contratoMap);
            oos.flush();
            oos.close();
            fos.close();
            
        } catch (IOException e){}   
    }
    
    public void loadContrato (String fileName){
        try{
            File toRead = new File(fileName);
            FileInputStream fis = new FileInputStream(toRead);
            ObjectInputStream ois = new ObjectInputStream(fis);
            HashMap<String, Contrato> mapFromFile = (HashMap<String, Contrato>)ois.readObject();
            this.contratoMap = new HashMap<>(mapFromFile);
            
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {}
    }
    
    public void addContrato (Contrato contract){
        this.contratoMap.put(contract.getID(), contract);
    }
    
    public Contrato getContrato (String ID){
        if(contratoMap.containsKey(ID)){
            return contratoMap.get(ID);
        }
        else
            return null;
    }
    
    public ArrayList<String> getAllContractIDs(){
        ArrayList<String> contractIdList = new ArrayList<>();
        
        System.out.println("bug");
        this.contratoMap.keySet().forEach((String key) -> {
            System.out.println(key);
            contractIdList.add(key);
        });
        
        return contractIdList;
    }

    public listaContrato() {
        this.contratoMap = new HashMap<>();
    }
}
