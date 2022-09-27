package Model;

import java.util.Date;

public class Cliente {

    public Cliente(int id, Contato contato, Endereco endereco, boolean cliente_ativo, String cadastrado_em) {
        this.id = id;
        this.contato = contato;
        this.endereco = endereco;
        this.cliente_ativo = cliente_ativo;
        this.cadastrado_em = cadastrado_em;
    }

    int id;
    Contato contato;
    Endereco endereco;
    boolean cliente_ativo;
    String cadastrado_em;

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean isCliente_ativo() {
        return cliente_ativo;
    }

    public void setCliente_ativo(boolean cliente_ativo) {
        this.cliente_ativo = cliente_ativo;
    }

    public String getCadastrado_em() {
        return cadastrado_em;
    }

    public void setCadastrado_em(String cadastrado_em) {
        this.cadastrado_em = cadastrado_em;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\nid=" + id +
                "\ncontato=" + contato +
                "\nendereco=" + endereco +
                "\ncliente_ativo=" + cliente_ativo +
                "\ncadastrado_em='" + cadastrado_em + '\'' +
                '}';
    }
}
