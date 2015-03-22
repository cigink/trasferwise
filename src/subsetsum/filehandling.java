package subsetsum;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class filehandling {
	
	ArrayList<String> list = new ArrayList<String>();

String [] codes = new String[12272];
	String [] codes2 = new String[5000];
	int i = 0;

	private Scanner readCodes;
	
	public int[] readCodesFile() {
		try {
			readCodes = new Scanner(new File("C:/Users/Cigin/Desktop/uk.txt"));
//			codes[i] = readCodes.nextLine();
			//System.out.println(codes[i]);
			i++;
			while(readCodes.hasNext()) {
				String line = readCodes.nextLine();

				list.add(readCodes.nextLine());
				//System.out.println(codes[i]);
				i++;
			}
			
		} 
		
		catch (Exception e) {
			System.out.println("Could not locate the data file!");
		}
		
		int intCode1 [] = convertStringArray(codes);
		return intCode1;

		
			
		}
	
	public int[] readCodesFile1() {
		try {
			readCodes = new Scanner(new File("C:/Users/Cigin/Desktop/estonia.txt"));
			codes2[i] = readCodes.nextLine();
			//System.out.println(codes[i]);
			i++;
			while(readCodes.hasNext()) {
				codes2[i] = readCodes.nextLine();
				//System.out.println(codes[i]);
				i++;}
			
		} 
		
		catch (Exception e) {
			System.out.println("Could not locate the data file!");
		}
		
		int intCode2 [] = convertStringArray(codes);
		return intCode2;

		
			
		}
		
		
	
	public int[] convertStringArray(String[] codes) {
		int[] intCodes = new int[codes.length];
		int count = 0;
		for (String string : codes) {
			intCodes[count] = Integer.parseInt(string);
			//System.out.println(intCodes[count]);
			count++;
		}
		//System.out.println(intCodes[i]);
		return intCodes;
	}
	




}


