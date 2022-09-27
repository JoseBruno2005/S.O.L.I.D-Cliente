package Model;


public class ClienteJuridico extends Cliente{

    public ClienteJuridico(int id, Contato contato, Endereco endereco, boolean cliente_ativo, String cadastrado_em, int id1, String cnpj, String racao_social, String nome_fantasia, String indicadorEscricaoEstadual, String escricao_estadual, String escricao_municipal) {
        super(id, contato, endereco, cliente_ativo, cadastrado_em);
        this.id = id1;
        this.cnpj = cnpj;
        this.racao_social = racao_social;
        this.nome_fantasia = nome_fantasia;
        this.indicadorEscricaoEstadual = indicadorEscricaoEstadual;
        this.escricao_estadual = escricao_estadual;
        this.escricao_municipal = escricao_municipal;
    }

    int id;
    String cnpj;
    String racao_social;
    String nome_fantasia;
    String indicadorEscricaoEstadual;
    String escricao_estadual;
    String escricao_municipal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRacao_social() {
        return racao_social;
    }

    public void setRacao_social(String racao_social) {
        this.racao_social = racao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getIndicadorEscricaoEstadual() {
        return indicadorEscricaoEstadual;
    }

    public void setIndicadorEscricaoEstadual(String indicadorEscricaoEstadual) {
        this.indicadorEscricaoEstadual = indicadorEscricaoEstadual;
    }

    public String getEscricao_estadual() {
        return escricao_estadual;
    }

    public void setEscricao_estadual(String escricao_estadual) {
        this.escricao_estadual = escricao_estadual;
    }

    public String getEscricao_municipal() {
        return escricao_municipal;
    }

    public void setEscricao_municipal(String escricao_municipal) {
        this.escricao_municipal = escricao_municipal;
    }

    @Override
    public String toString() {
        return "\nClienteJuridico{" +
                "\nid=" + id +
                "\ncnpj='" + cnpj + '\'' +
                "\nracao_social='" + racao_social + '\'' +
                "\nnome_fantasia='" + nome_fantasia + '\'' +
                "\nindicadorEscricaoEstadual=" + indicadorEscricaoEstadual +
                "\nescricao_estadual='" + escricao_estadual + '\'' +
                "\nescricao_municipal='" + escricao_municipal + '\'' +
                "\nid=" + id +
                "\ncontato=" + contato +
                "\nendereco=" + endereco +
                "\ncliente_ativo=" + cliente_ativo +
                "\ncadastrado_em=" + cadastrado_em +
                '}';
    }
}
