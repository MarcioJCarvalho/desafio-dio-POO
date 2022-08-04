package br.com.dio.desafio.dominio;
public class Curso  extends Conteudo{
    
    private int cargaHoraria;
    
    
    public Curso() {
    }
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria ;
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
        sb.append("titulo=").append(getTitulo());
        sb.append(", descricao=").append(getDescricao());
        sb.append(", cargaHoraria=").append(cargaHoraria);
        sb.append('}');
        return sb.toString();
    }




}
