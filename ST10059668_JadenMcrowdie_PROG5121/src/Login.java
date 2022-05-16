
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaden Mcrowdie
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first name");
         String firstName=input.nextLine();
         System.out.println("Please enter your last name");
         String lastName=input.nextLine();
    System.out.println("Please enter your username ,it should contain 5 characters and an underscore");
    String username = input.nextLine();
     checkUserName(username);
      System.out.println("Enter password");
    String password = input.nextLine();
    checkPasswordComplexity(password); 
    System.out.println("Enter your username: ");
    String loginUsername;
     username = input.nextLine(); 
      System.out.println("Enter your password : ");
     String loginPassword= input.nextLine();
     String registerUser;
      JOptionPane.showMessageDialog(null,"Welcome to EasyKanban"); 
      JOptionPane.showInputDialog(null, "Option 1 Add task\n Option2 Show Report\n Option 3 Quit");
      JOptionPane.showMessageDialog(null," ");
      JOptionPane.showMessageDialog(null,"Insert Number of Tasks");
      JOptionPane.showInputDialog(null,"Insert task name");
      JOptionPane.showMessageDialog(null , "Add login feature");
   JOptionPane.showMessageDialog(null,"Please enter a task description of less than \n" +"50 characters ");
   JOptionPane.showMessageDialog(null,"Task successfully captured");
   JOptionPane.showInputDialog(null,"Option 1 To do\n Option 2 Doing\n Option 3 Done");
   
   
   
    }
    
    
  public static boolean checkUserName (String username){
        
    boolean underscore= false;
    boolean limit=false;
  
    for ( int i =0;i<username.length();++i){
         
       if(username.length() <= 5){
             limit = true;
         }
                
                 if(username.charAt(i)==95){
                 underscore=true;
                 
                 } 
    
     }
    
    if (underscore && limit){
        System.out.println("username captured");
        return true;
    }else {
        
        System.out.println("not captured");
        
    }
    return false;
  }
    
    public static boolean checkPasswordComplexity(String password){
   
   boolean uppercase = false;
   boolean digit = false;
   boolean specialCharacter= false;
   boolean passwordlimit = false;
   
   for(int x = 0; x < password.length(); x++){
        if(password.length() <= 8){
             passwordlimit = true;
             if(password.charAt(x)>=65 && password.charAt(x)<=90){
                 uppercase=true;
                 if(password.charAt(x)>=48 && password.charAt(x)<=57){
                     digit=true;
                     if(password.charAt(x)>=33 && password.charAt(x)<=47 || password.charAt(x)>=58 && password.charAt(x)<=64 || password.charAt(x)>=91 && password.charAt(x)<=96 || password.charAt(x)>=123 && password.charAt(x)<=126){
                 specialCharacter=true;
                     }
                     if(uppercase && digit && specialCharacter && passwordlimit);
                     System.out.println("Password successfully captured");
                     
                 }else{
                     System.out.println("Password is not successfully captured");
                     return false;
                 }
            
             }
        }
   }
    return true;
    }

    public static String registerUser ( String username, String password){
        if(checkUserName(username) && checkPasswordComplexity(password)==true){
            System.out.println("You are successfully registered");
            return "you are registered" ;
        }
        else
    System.out.println("Incorrect username or password");
   return "you are not registered" ;
}
    
    public static boolean loginUser(String username ,String password){
        
        boolean loginUsername=false;
        boolean loginPassword=false;
        
        if(username.equals(username)){
            loginUsername=true;
            
        }
        if(password.equals(password)){
            loginPassword=true;
           
            
        }
        if(loginUsername && loginPassword ==true){ 
            System.out.println("Welcome it is great to see you again");
            return true;
        }   
        else{
            System.out.println("Incorrect username or password");
        }
        return false;
    }
    
   public static String returnLoginStatus (String username, String password, String inpUser , String inpPass){
       
       if(inpUser.equals(username) && inpPass.equals(password)==true){
           System.out.println("A successful login");
           return "successful login";
           }
       else{
           System.out.println("A failed login");
           
       }
       return "unsuccessful login" ;
       
   }
    
}


        
    

             
        
   

    

   
    

