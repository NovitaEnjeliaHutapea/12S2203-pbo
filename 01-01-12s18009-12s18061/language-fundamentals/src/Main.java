/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01-12s18009 Novita Enjelia Hutapea
 * @author 01-12s18061 Angela Simamora
 */

import java.util.ArrayList;
public class Main {
    /* program emtry point */   
    public static void main(String[] _args) {  
        System.out.println("Hello, world!"); 
    // declaring and manipulation primitive variables
int gear = 1;
boolean result = true;
char capitalC = 'C';
byte b = 100;

System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);

 gear++;
result = !result;
capitalC += 4;

System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);

//26 in hexadecimal and binary
int hexVal = 0x1a;
int binVal = 0b11010;
System.out.println(hexVal + ", " + binVal);

// intantiating and manipulating objects
String name = "Wiro Sableng";
Short gearObject = 1;
Boolean resultObj = true;

System.out.println(name + ", " + gearObject + ", " + resultObj); 
 
name = name.toUpperCase();
gearObject++;
resultObj = (result == false) || !resultObj;

System.out.println(name + ", " + gearObject + ", " + resultObj);

//array, collection, and loop
ArrayList<Integer> numbers = new ArrayList<Integer>();

 
for (int i = 0; i < 10; ++i) {   
    for (int j = 0; j < 10 ; ++j) {     
        numbers.add(i + ' ' );   
    } 
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);
    numbers.add(8);
    numbers.add(9);
    numbers.add(10);
} 
 
for (int i = 0; i < 10; ++i) {   
    for (int j = 0; j < 10; ++j) {    
        
    System.out.print(numbers.get(i));   
} 
System.out.println(); 
} 

 }
}

