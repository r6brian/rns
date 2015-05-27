package com.rns.examples;

import java.util.ArrayList;

public class ModThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> modThrees = fetchModThree();
		if ( modThrees != null && modThrees.size() > 0 ){
			
			for ( Integer modThree : modThrees){
				System.out.print(modThree + ",");
			}
			
		}
	}
	
	public static ArrayList<Integer> fetchModThree(){
		
		ArrayList<Integer> modThree = null;
		
		for ( int i = 1; i < 100; i++) {
			if ( i % 3 == 0){
				
				if ( modThree == null)
					modThree = new ArrayList<Integer>();
				
				if ( modThree.size() < 5)
					modThree.add(i);
			}
		}
		
		return modThree;
		
	}

}
