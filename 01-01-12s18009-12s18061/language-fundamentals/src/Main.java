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
// membuat objek array list
ArrayList Antrian = new ArrayList<>();

// Mengisi Antrian dengan 10 angka
Antrian.add(1);
Antrian.add(2);
Antrian.add(3);
Antrian.add(4);
Antrian.add(5);
Antrian.add(6);
Antrian.add(7);
Antrian.add(8);
Antrian.add(9);
Antrian.add(10);

// Menghapus 3 dari Antrian
Antrian.remove(3);

// Menampilkan daftar antrian
System.out.println(Antrian);

// Menampilkan banyak antrian
System.out.println("Yang mengantri adalah sebanyak " + Antrian.size());
  
 }
}

