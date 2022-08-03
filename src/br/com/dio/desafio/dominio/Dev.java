package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    // salva na ordem em que foram concluidos
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        //pega todo o conteudo do bootcamp e coloca dentro de conteudosInscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //para adicionar o Dev inscrito no bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //para pegar na ordem
        //Optional resolve a questão de retornos nulos
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        // Regra de negócio é: retirar de conteudosInscritos e adicionar em conteudosConcluidos
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.out.println("Você não esta matriculado em nunhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        //pega cada conteúdo de dentro do Set e pega o Xp e soma
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return this.conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return this.conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

}
