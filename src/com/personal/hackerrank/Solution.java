package com.personal.hackerrank;

import java.io.File;
import java.io.IOException;

import net.percederberg.mibble.Mib;
import net.percederberg.mibble.MibLoader;
import net.percederberg.mibble.MibLoaderException;

/*
 * link :: https://www.hackerrank.com/challenges/the-power-sum/problem
 */
public class Solution{
	

	public Mib loadMib(File file)
		    throws MibLoaderException, IOException {

		    // In real code, a single MibLoader instance should be reused
		    MibLoader loader = new MibLoader();

		    // The MIB file may import other MIBs (often in same dir)
		    loader.addDir(file.getParentFile());

		    // Once initialized, MIB loading is straight-forward
		    return loader.load(file);
		}
	
	public static void main(String[] args) {
		Solution p = new Solution();
		File file = new File("C:\\Users\\e00921\\Desktop\\OSI\\SNMP\\LUCENT\\amm.mib");
		try {
			Mib mib = p.loadMib(file);
			System.out.println("File loaded successfully");
		} catch (MibLoaderException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
}

