/* Figura 3.1: Account.java
 * Classe Account que contém uma variável de instância name 
 * e métodos para configurar e obter seu valor. */

package com.cap3.Account;

public class Account {
	private String name; // variável de instância
	
	// método para definir o nome no objeto
	public void setName(String name) {
		this.name = name; // armazena o nome
	}
	
	// método para recuperar o nome do ogjeto
	public String getName() {
		return name; // retorna valor do nome para o chamador
	}
	
} // fim da classe Account
