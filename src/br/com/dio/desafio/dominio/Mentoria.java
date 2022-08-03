package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria {
    private  String titulo;
    private String descricao;
    private  LocalDate data;


    public Mentoria() {
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mentoria{");
        sb.append("titulo=").append(titulo);
        sb.append(", descricao=").append(descricao);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }


}
