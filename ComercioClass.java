package logincadastro;

import java.util.*;
import javax.swing.*;

public class ComercioClass {
    
    /* Atributos Static para não precisar criar um Objeto, e não 
	acabar perdendo o valor ao voltar em algum método*/
    private static String nome;
    private static String email;
    private static String senha;
    private static String telefone;
    private static String endereco;
    private static Boolean status;

    Scanner ler = new Scanner(System.in);

    // Construtor
    public ComercioClass() {
        status = false;
    }

    // Métodos
    static void cadastro() {	// Implementa dados aos Atributos da PessoaCadastro
		String a, b, c, d, e;

		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " CADASTRO COMÉRCIO\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome: "); setNome(a);
		b = JOptionPane.showInputDialog(" Email: "); setEmail(b);
		c = JOptionPane.showInputDialog(" Senha: "); setSenha(c);
		d = JOptionPane.showInputDialog(" Telefone: "); setTelefone(d);
        e = JOptionPane.showInputDialog(" Endereço: "); setEndereco(e);
		status = true;
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!"
										 + "\n\n SEJA BEM VINDO "+getNome()+"!!\n");

		Main.Menu(); // TROCAR POR MENU COMERCIO
	}
	
	static void login() {	// Compara Strings Atributos com as String do método para validar login
		String a, b;
		int op;
		
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " LOGIN COMÉRCIO\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Email: ");
		b = JOptionPane.showInputDialog(" Senha: ");
		
		if (a.equals(getEmail()) && b.equals(getSenha()) ) {	// Compara Strings
		JOptionPane.showMessageDialog(null,"\n SEJA BEM VINDO "+getNome()+"!!");

            Main.Menu(); // TROCAR POR MENU COMERCIO

		} else { 
				try {
					op = Integer.parseInt(JOptionPane.showInputDialog("\n EMAIL E SENHA INCORRETOS!!\n"
				+ "\n 1) Tentar novamente"
				+ "\n 2) Voltar"
				+ "\n\n Opção:"));
					if (op == 1) { ComercioClass.login(); } else { LoginECadastro.Login(); }

				} catch (NumberFormatException e) { // Verifica se o dado de entrada é um numero inteiro 
					JOptionPane.showMessageDialog(null, "\n Exception: "+e+"\n"
							+ "\n Você deve entrar com um número INTEIRO!"
							+ "\n Por favor tente novamente!");
					ComercioClass.login(); }
		}
	}
		
	static void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " INFORMAÇÕES COMÉRCIO\n ---------------------------------------- "
				+ "\n Nome: "+getNome()+""
				+ "\n Email: "+getEmail()+""
				+ "\n Senha: "+getSenha()+""	
				+ "\n Endereço: "+getEndereco()+""	
				+ "\n Telefone: "+getTelefone()+"\n\n");

				// Main.Menu(); RETORNAR MENU COMERCIO
	}

    // Getters and Setters
    public static String getNome() { return nome; }

    public static void setNome(String nome) { ComercioClass.nome = nome; }

    public static String getEmail() { return email; }

    public static void setEmail(String email) { ComercioClass.email = email; }

    public static String getSenha() { return senha; }

    public static void setSenha(String senha) { ComercioClass.senha = senha; }

    public static String getEndereco() { return endereco; }

    public static void setEndereco(String endereco) { ComercioClass.endereco = endereco; }

    public static String getTelefone() { return telefone; }

    public static void setTelefone(String telefone) { ComercioClass.telefone = telefone; }

    public static Boolean getStatus() { return status; }

    public static void setStatus(Boolean status) { ComercioClass.status = status; }

}
