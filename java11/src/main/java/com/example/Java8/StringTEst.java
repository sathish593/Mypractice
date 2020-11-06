package com.example.Java8;

/* IMPORTANT: Multiple classes and nested static classes are supported */


 //* uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class StringTEst {

    public static void find(int[] array1,int[] array2){
        int count =0;
        String str1 = Arrays.stream(array1)
        .mapToObj(String::valueOf).collect(Collectors.joining(""));
        String str2 =Arrays.stream(array2)
        .mapToObj(String::valueOf).collect(Collectors.joining(""));
        for(int i=0;i<array1.length-2;i++){
            if(str2.contains(str1.substring(i,i+3))){
                count+=1;
            }
        }
        System.out.println(count);

    }
    

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input */

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()   ); 
        if(1> t || t>100){
            return;
        }  
         int n = Integer.parseInt(br.readLine()   );   
        if(1> n || n>100000){
            return;
        }
         Scanner s = new Scanner(System.in);
         int[] array1 = new int[n];
         int[] array2 = new int[n];
        
       
        for(int i=0;i<n;i++){
           array1[i] = s.nextInt();
        }
       
       for(int i=0;i<n;i++){
           array2[i] = s.nextInt();
        }

        
        find(array1,array2);
        


    }
}
