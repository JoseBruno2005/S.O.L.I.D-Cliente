package Model;

import java.util.Date;

public class ClienteFisico extends Cliente{

    public ClienteFisico(int id, Contato contato, Endereco endereco, boolean cliente_ativo, String cadastrado_em, int id1, String nome_completo, String cpf, String rg, String orgao_emisor, Sexo sexo, String nascimento) {
        super(id, contato, endereco, cliente_ativo, cadastrado_em);
        this.id = id1;
        this.nome_completo = nome_completo;
        this.cpf = cpf;
        this.rg = rg;
        this.orgao_emisor = orgao_emisor;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    int id;
    String nome_completo;
    String cpf;
    String rg;
    String orgao_emisor;
    Sexo sexo;
    String nascimento;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgao_emisor() {
        return orgao_emisor;
    }

    public void setOrgao_emisor(String orgao_emisor) {
        this.orgao_emisor = orgao_emisor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "\nClienteFisico{" +
                "\nid=" + id +
                "\nnome_completo='" + nome_completo + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\nrg='" + rg + '\'' +
                "\norgao_emisor='" + orgao_emisor + '\'' +
                "\nsexo=" + sexo +
                "\nnascimento='" + nascimento + '\'' +
                "\nid=" + id +
                "\ncontato=" + contato +
                "\nendereco=" + endereco +
                "\ncliente_ativo=" + cliente_ativo +
                "\ncadastrado_em='" + cadastrado_em + '\'' +
                '}';
    }
}
