package com.searchengine;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.*;


public class SearchEngine3000 {
	
	public static void main(String[] args) throws IOException 
	{
			int count = 0;
	        String word;
	        String title;
	        String[] b1; 
	        
	        
	        File file=new File("C:\\Users\\User\\eclipse-workspace\\SearchEngine\\files\\2.txt");
	        File file2=new File("C:\\Users\\User\\eclipse-workspace\\SearchEngine\\files\\1.txt");
	        FileReader filer= new FileReader(file);
	        BufferedReader buffer = new BufferedReader(filer);
	        
	        FileReader filer2= new FileReader(file2);
	        BufferedReader buffer2 = new BufferedReader(filer2);
	        
	        
	        Scanner scan = new Scanner(title = JOptionPane.showInputDialog(null, "Enter the word you'd like to search:"));
	        String word2=scan.nextLine();
	         
	             
	        while((word=buffer.readLine())!= null || (word=buffer2.readLine())!= null)
	        {
	           b1=word.split(" ");  
	            for (String wordSearch : b1) 
	            {
	                   if (wordSearch.equals(word2))   
	                   {
	                     count++;    
	                   }
	            }
	        }
	        if(count>=1)  
	        {
	        	System.out.println(word2 + " " + "Was found" + " " + count+ " " + "times");
	        }
	        else
	        {
	           System.out.println("Word was not found..");
	        }
	        
	          filer.close();
	     }
		
		
		
		
	}
