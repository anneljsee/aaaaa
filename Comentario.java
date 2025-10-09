package classes;

public class Comentario {
private String usuario, comentario, dataComentario, horarioComentario;
private Object like;
private Object dislike; 


public Comentario (String usuario, String comentario, String dataComentario, String horarioComentario, Object dislike, Object like) {
	this.usuario = usuario;
	this.comentario = comentario;
	this.dataComentario = dataComentario;
	this.horarioComentario = horarioComentario;
	this.like = like;
	this.dislike = dislike; }
	
	public String getUsuario() {
        return usuario;
    }
	
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getcomentario() {
    	return comentario;
    }
    
    public void setcomentario(String comentario) {
    	this.comentario = comentario;
    }
    public String getdataComentario() {
    	return dataComentario;
    }
    
    public void setdataComentario(String dataComentario) {
    	this.dataComentario = dataComentario;
    }
    public String gethorarioComentario() {
    	return horarioComentario;
    }
    
    public void sethorarioComentario(String horarioComentario) {
    	this.horarioComentario = horarioComentario;
    }	
    public Object getlike() {
    	return like;
    }
    
    public void setlike (Object like) {
    	this.like = like;
    }
    public Object getdislike() {
    	return dislike;
    }
    
    public void setdislike(Object dislike) {
    	this.dislike = dislike;
    }	
    	public void exibirComentario() {
    		System.out.println("Usuário"+usuario);
            System.out.println("Comentário: "+comentario);
            System.out.println("Data: "+dataComentario);
            System.out.println("Horário: "+horarioComentario);
            System.out.println("Likes: "+like+" Dislikes: " + dislike);
    	
    }
    }
