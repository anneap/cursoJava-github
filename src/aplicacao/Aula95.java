package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Aula95 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario ("UAU que incrível!");
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario ("Que a força esteja com você!");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajando pra Nova Zelândia", 
				"Vou visitar esse país maravilhoso",
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
		
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa Noite Pessoal", 
				"Vejo vocês amanhã!",
				5);
		p2.addComentario(c1);
		p2.addComentario(c2);
		
		System.out.println(p2);
		

	}

}
