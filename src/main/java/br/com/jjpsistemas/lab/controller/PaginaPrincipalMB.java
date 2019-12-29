package br.com.jjpsistemas.lab.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PaginaPrincipalMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String menagem = "Olá sejam bem vindos!";
	
	public String getMenagem() {
		return menagem;
	}
	public void setMenagem(String menagem) {
		this.menagem = menagem;
	}

}
