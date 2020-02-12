/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 01-12S18009 Novita Enjelia Hutapea
 * @author 01-12S18061 Angela Simamora
 */

public class main {
   
 /* class-level attributes */
private static List<String> nims = new ArrayList<>();
private static List<String> names = new ArrayList<>();
/* program emtry point */
public static void main(String[] _args) {
// see https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
Scanner in = new Scanner(System.in);
String s;
boolean quit = false;

do{
s = in.nextLine();
// see https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 String[] tokens = s.split(" ");
String output = "";

switch (tokens[0]) {
case "add":
    main.add(tokens[1], tokens[2]);
    break;
case "find":
    output = find(tokens[1]);
    break;
case "count":
    output = "" + count();
    break;
case "reset":
    reset();
    break;
case "exit":
    quit = true;
}

if (output.length() > 0) {
    System.out.println(output);
    }
  } while (!quit);
}

/**
 * Adds a new student data.
 *
 * @param _nim Student number
 * @param _name Student name
 */
 public static void add(String _nim, String _name) {
     int check = 0;
     for(int i = 0; i < nims.size(); i++){
         if(_nim.equals(nims.get(i))){
             check++;
         }
     }
     if(check == 0) {
         nims.add(_nim);
         names.add(_name);
     }
 }
/**
 * Finds a student based on the student number.
 * @param _nim Student number
 * @return When the given student number does exist in the storage, return a string that represent the student data.
 * Otherwise, <code>NULL</code> is returned.
 */

public static String find(String _nim) {
    int index = nims.indexOf(_nim);
    
    if (index >= 0) {
        return nims.get(index) + " " + names.get(index);
    }
    
    return "";
}

 /**
 * Counts the number of student data stored.
 *
 * @return A numerical value representing the number of student data stored in the program
*/

public static int count() {
    int counting = 0;
    
    if(nims.size()>0){
    counting = nims.size();  
    }
    else{
    }
return counting;
}
/**
 * Removes all student data.
 */
public static void reset() {
    nims.clear();
    names.clear();
  }




}
