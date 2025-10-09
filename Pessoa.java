package classes;

public class pessoa {
private String nomeCompleto, dataNascimento, gênero, nacionalidade, paisOrigem, email, telefone, senha;

private Idioma idioma;
private Genero genero;
public Pessoa(String nomeCompleto, String dataNascimento, Genero genero, String nacionalidade, String paisOrigem,
String email, String telefone, Idioma idioma, String senha) {
this.nomeCompleto = nomeCompleto;
this.dataNascimento = dataNascimento;
this.genero = genero;
this.nacionalidade = nacionalidade;
this.paisOrigem = paisOrigem;
this.email = email;
this.telefone = telefone;
this.idioma = idioma;
this.senha = senha;
}

public String getNomeCompleto() {
return nomeCompleto;
}

public void setNomeCompleto(String nomeCompleto) {
this.nomeCompleto = nomeCompleto;
}

public String getDataNascimento() {
return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
this.dataNascimento = dataNascimento;
}

public Genero getGenero() {
return genero;
}

public void setGenero(Genero genero) {
this.genero = genero;
}

public String getNacionalidade() {
return nacionalidade;
}

public void setNacionalidade(String nacionalidade) {
this.nacionalidade = nacionalidade;
}

public String getPaisOrigem() {
return paisOrigem;
}

public void setPaisOrigem(String paisOrigem) {
this.paisOrigem = paisOrigem;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getTelefone() {
return telefone;
}

public void setTelefone(String telefone) {
this.telefone = telefone;
}

public Idioma getIdioma() {
return idioma;
}

public void setIdioma(Idioma idioma) {
this.idioma = idioma;
}

public String getSenha() {
return senha;
}

public void setSenha(String senha) {
this.senha = senha;
}
}
