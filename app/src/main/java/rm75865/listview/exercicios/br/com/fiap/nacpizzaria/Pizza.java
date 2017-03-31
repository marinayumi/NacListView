package rm75865.listview.exercicios.br.com.fiap.nacpizzaria;

import java.io.Serializable;

/**
 * Created by logonrm on 31/03/2017.
 */

public class Pizza implements Serializable{
    private String sabor;
    private String valor;
    private int imagem;
    private String ingredientes;
    private double pontuacao;


    public Pizza(String sabor, String valor, int imagem, String ingredientes, double pontuacao) {
        this.sabor = sabor;
        this.valor = valor;
        this.imagem = imagem;
        this.ingredientes = ingredientes;
        this.pontuacao = pontuacao;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
}
