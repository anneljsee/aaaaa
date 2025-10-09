package classes;

public class Comentario {
private String Autor, Data, Texto;

public Comentario(String Autor, String Data, String Texto){
	this.Autor = Autor;
	this.Data = Data;
	this.Texto = Texto;
	
}
public String getAutor() {
	return Autor;
	}
public void setAutor(String Autor){
	this.Autor = Autor;
}
public String getData() {
	return Data;
	}
public void setData(String Data){
	this.Data = Data;
}
public String getTexto() {
	return Texto;
	}
public void setTexto(String Texto){
	this.Texto = Texto;
}

public void ExibirComentario() {
	System.out.println("Autor:"+Autor);
	System.out.println("Data"+Data);
	System.out.println("Comentário"+Texto);
}
}