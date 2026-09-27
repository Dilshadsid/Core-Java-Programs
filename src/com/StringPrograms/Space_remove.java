package com.StringPrograms;

public class Space_remove {
	public static void main(String[] args) {
		String str = "Dilshad Sidd iqui .";
		StringBuilder noSpaceStrBuilder = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (!Character.isWhitespace(c)) {//remove all the spaces using --
				noSpaceStrBuilder.append(c);   // -- isWhitespace() method
			}
		}
		String noSpaceStr = noSpaceStrBuilder.toString();
		System.out.println(noSpaceStr);

	}
}
