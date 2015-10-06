package csm10jlab06;
import java.util.Vector;


public class Professional {
   
    private String ProfName;
    private Vector<String> qualifications;
    
    
    public Professional (String Name){
        ProfName = Name;
    } 
    
    public String getName (){
        return ProfName;
    }
    
    public String[] getQualifications(){
        String[] temp = new String [qualifications.size()]; 
        
        for(int i = 0; i< temp.length; i++ ){
            temp[i] = qualifications.elementAt(i);
        }
        
        return temp;
    }
    
    
    public void addQualifications(String words){
        boolean check = false;
        for (int i = 0; i < qualifications.size() && check == check; i++){
            if (qualifications.elementAt(i).toLowerCase().equals(words.toLowerCase()))
                check = true;
        }
        if (!check)
        qualifications.addElement(words);
    }
    
    public boolean hasQualification(String qual){
        boolean search = false;
        
        for (int i = 0; i < qualifications.size() && search == false; i++){
            if (qualifications.elementAt(i).toLowerCase().equals(qual.toLowerCase()))
                search = true;
        }
        return true;
    }
    
    
    
}


