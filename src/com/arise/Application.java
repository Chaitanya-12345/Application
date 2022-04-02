package com.arise;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to application");
		fileDetails();
     }
	
		private static void fileDetails() throws IOException{
			System.out.println("We have below operation....");
			System.out.println("1.Return All Files");
			System.out.println("2.Return User Details ");
			System.out.println("3.close APP");
			System.out.println("");
			
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the operation to be performed");
			int operation=sc2.nextInt();
			String path="C:\\APP\\";
					
			
			switch(operation){
				case 1:
					File file=new File(path);
					String[]filelist=file.list();
					System.out.println(filelist);
					if(filelist==null){
						System.out.println("empty directory");
					}
						else{
							for(String str:filelist){
								System.out.println(str);
							};
							
						}
					break;
			case 2:
				System.out.println("we have below suboperation....");
	            System.out.println("a.add");
	            System.out.println("b.delete");
	            System.out.println("c.search");
	            System.out.println("d.Back to home");
	            
	            //Scanner sc3=new Scanner(System.in);
	            System.out.println("Enter the sub-Operation to be performed");
	            char subop=sc2.next().charAt(0);
	            switch(subop){
	            case 'a':
	            	
					//Scanner sc4=new Scanner(System.in);
					ArrayList<String> al1=new ArrayList<>();
					System.out.println("Enter the filename");
					String filename=sc2.next();
					String finalname=path+filename;
					File f=new File(finalname+".txt");
					boolean b=f.createNewFile();
					System.out.println("file created successfully");
					fileDetails();
					
	            	break;
	           case 'b':
	        	   //Scanner sc5=new Scanner(System.in);
	        	   System.out.println("enter the file name which to be deleted");
	        	   String filedel=sc2.next();
	        	   String finalfile1=path+filedel+".txt";
	        	   File f1=new File(finalfile1);
	        	   //f1.delete();
	        	   boolean db=f1.delete();
	        	   if(db){
	        	   System.out.println("file deleted successfully");
	        	   }
	        	  
	        	   else{
	        		   System.out.println("file deletion failed");
	        	   }
	        	   fileDetails();
	        		   break;
	        		   
	        case 'c':
	        	//Scanner sc6=new Scanner(System.in);
	        	System.out.println("enter the file to be search");
	        	String filedel1=sc2.next();
	         File directory=new File(path);
	         String[] flist=directory.list();
	         
	         if(flist==null){
	        	 System.out.println("empty directory");
	         }
	         else{
	        	 for(int i=0;i<flist.length;i++){
	        		 String filenm=flist[i];
	        		 if(filenm.equalsIgnoreCase(filedel1+".txt"))
	        		 {
	        			 System.out.println(filenm+"found ");
	        		 }
	        	 }
	         }
	         fileDetails();
	        	 
	         	break;
	         	case 'd':
	         		fileDetails();
	         	break;
	            	default:
	            		
	            		System.out.println("please enter the valid Sub-Operation");
	            }
	            break;
			case 3:
				System.out.println("time to say goodby!!");
				System.exit(0);
				default:
	            	System.out.println("please enter valid operation");
			}  	
			}
		
	}


