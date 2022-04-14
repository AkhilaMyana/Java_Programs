package sorting;

import java.util.regex.*;    
import java.util.*;    
public class GmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("Susmitha23@domain.co.in");  
        emails.add("Naveenkumar.90@domain.com");  
        emails.add("mallika-vanteru#@domain.co.in");  
        emails.add("Christina_pratap@domain.com");  
        emails.add("nishanth@67.domaincom");  
        //Add invalid emails in list  
        emails.add("@youTube.com");  
        emails.add("12john#domain.com");  
        //Regular Expression   
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  
