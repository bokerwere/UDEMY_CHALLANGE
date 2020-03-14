package com.company;

import java.util.Scanner;

public class Main {

private static Scanner scanner=new Scanner(System.in);
    public static int[] getInteger( int number){
      System.out.println ( "enter "+ number+" integer value.\r");
    int[] value= new int [number];
System.out.println (  );

    for(int i=0;i<value.length;i++){
      value [i]= scanner.nextInt();
    }
return value;
    }

 public static double arrayAvarage(int [] array){
        int sum=0;
 for (int i=0;i<array.length;i++){
    sum+=array[i];


 }
 return (double) sum/(double) array.length;
 }

    public static void main(String[] args) {
int[] numb=getInteger ( 5 );
for(int i=0;i<numb.length;i++){
    System.out.println ("element: " +i + " type value was " +numb[i] );





}
        System.out.println ("avarage is:" + arrayAvarage ( numb ));
    }
}
