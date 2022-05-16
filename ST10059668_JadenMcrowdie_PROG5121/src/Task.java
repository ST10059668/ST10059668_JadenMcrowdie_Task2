/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaden Mcrowdie
 */
public class Task {
    //methods
    int var =0;
   //global variable
  String taskName;
  int taskNumber;
  String taskDescription;
  String developerDetails;
  int taskDuration;
  String taskID;
  String taskStatus;
  
public  boolean checkTaskDescription( String taskDescription){
    for ( int i =0;i<taskDescription.length();++i){
        if( taskDescription.length()<=50)
            
            return true ;
  
       
            }
    return false;
}

public static String createTaskID(String taskName,int taskNumber,String developerDetails){
   
    developerDetails = developerDetails.substring(0,2);
    taskName = taskName.substring(3,5);
       
 return "task id";   
}
}
public static String printTaskDetails(taskStatus){

if(taskStatus.equals(Option 1)){
return "To do";
}

else if (taskStatus.equals(Option 2)){
return "Doing";

}

if(taskStatus.equals(Option 3)){
return "Done";
}

}