package Java_study;

import java.util.Random;//�����ݒ肪�K�v

public class Randamu_class {

	public static void main(String[] args) {
	    String[] hands = { "�O�[", "�`���L", "�p�[" };
	    Random r = new Random();
	    for(int i=0 ; i<5 ; i++) {
	      String hand = hands[r.nextInt(3)];
	      System.out.println(hand);
	    }
	  }

	}