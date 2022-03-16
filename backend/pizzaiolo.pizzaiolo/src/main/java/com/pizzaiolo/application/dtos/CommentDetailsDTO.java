package com.pizzaiolo.application.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pizzaiolo.domains.entities.Comment;

import lombok.Value;

@Value
public class CommentDetailsDTO {
	
	@JsonProperty("idComentario")
	private int idComment;
	@JsonProperty("fecha")
	private Date date;
	@JsonProperty("idUsuario")
	private String idUser;
	@JsonProperty("rating")
	private int rating;
	@JsonProperty("comentario")
	private String text;
	@JsonProperty("idPizza")
	private int idPizza;

	public static CommentDetailsDTO from(Comment source) {
		return new CommentDetailsDTO(
				source.getIdComment(), 
				source.getDate(), 
				source.getIdUser(), 
				source.getRating(), 
				source.getText(), 
				source.getPizza().getIdPizza());
	}
	

	
}
