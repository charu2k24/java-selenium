package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Test {
	public static void main(String[] args) {
		String s="Hello Welcome to Java";
		String[]l=s.split("");
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
			}
}