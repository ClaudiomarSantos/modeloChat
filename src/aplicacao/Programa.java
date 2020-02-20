package aplicacao;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Coment;
import entities.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		LocalDateTime data_hora = LocalDateTime.of(2018, 06, 21, 13, 05, 04);
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country!";
		int likes = 12;
		Post chat1 = new Post(data_hora, title, content, likes);

		String text = "Have a nice trip";
		String text2 = "Wow that's awesome!";
		Coment c1 = new Coment(text);
		Coment c2 = new Coment(text2);
		chat1.insertComentario(c1);
		chat1.insertComentario(c2);

		System.out.println(chat1);
		chat1.imprimirComentario();

		System.out.println();

		data_hora = LocalDateTime.of(2018, 07, 28, 23, 14, 19); 
		content = "See you tomorrow";
		likes = 5;
		Post chat2 = new Post(data_hora, title, content, likes);

		text = "Good night";
		text2 = "May the Force be with you";
		c1 = new Coment(text);
		c2 = new Coment(text2);
		chat2.insertComentario(c1);
		chat2.insertComentario(c2);
		System.out.println(chat2);
		chat2.imprimirComentario();

	}

}
