package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String response = JOptionPane.showInputDialog("How old are you");
		System.out.println(response);
		if (response.equals("14")) {
			System.out.println(("correct"));
			score = score + 1;
			System.out.println(score);
		} else {
			System.out.println("wrong");
			System.out.println("The correct answer is 14");
		}
		
		response=JOptionPane.showInputDialog("Who is the presedent of the United States");
}
}
