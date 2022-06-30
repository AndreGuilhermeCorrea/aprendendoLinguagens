package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment_composicao;
import entities.Post_Composicao;

public class Composicao {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment_composicao c1 = new Comment_composicao("Have a nice trip!");
		Comment_composicao c2 = new Comment_composicao("Wow that's awesome!");
		Post_Composicao p1 = new Post_Composicao(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment_composicao c3 = new Comment_composicao("Good night");
		Comment_composicao c4 = new Comment_composicao("May the Force be with you");
		Post_Composicao p2 = new Post_Composicao(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}