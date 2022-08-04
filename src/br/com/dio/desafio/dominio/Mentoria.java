package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private  LocalDate data;
    
    
    public Mentoria() {
    }
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
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
        sb.append("titulo=").append(getTitulo());
        sb.append(", descricao=").append(getDescricao());
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }



}
