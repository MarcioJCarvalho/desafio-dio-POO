package br.com.dio.desafio.dominio;
public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;


    public Curso() {
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("titulo=").append(titulo);
        sb.append(", descricao=").append(descricao);
        sb.append(", cargaHoraria=").append(cargaHoraria);
        sb.append('}');
        return sb.toString();
    }

}
