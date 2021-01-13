package Java_study;

import java.util.Random;//初期設定が必要

public class Randamu_class {

	public static void main(String[] args) {
	    String[] hands = { "グー", "チョキ", "パー" };
	    Random r = new Random();
	    for(int i=0 ; i<5 ; i++) {
	      String hand = hands[r.nextInt(3)];
	      System.out.println(hand);
	    }
	  }

	}