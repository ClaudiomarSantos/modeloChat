package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
	LocalDateTime data_hora;
	private String title;
	private String content;
	private Integer likes;

	Coment comentario = new Coment();
	List<Coment> listaComent = new ArrayList<>();

	public Post() {
	}

	public Post(LocalDateTime data_hora, String title, String content, Integer likes) {
		this.data_hora = data_hora;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return data_hora;
	}

	public void setMoment(LocalDateTime data_hora) {
		this.data_hora = data_hora;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public void insertComentario(Coment c1) {
		listaComent.add(c1);

	}

	@Override
	public String toString() {
		return title + "\n" + likes + " Likes - " + data_hora + "\n" + content;

	}

	public void imprimirComentario() {

		System.out.println(listaComent);
	}
}
