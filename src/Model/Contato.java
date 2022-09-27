package Model;

import java.util.UUID;

public class Contato {

    public Contato(int id, int numerocontato, String email) {
        this.id = id;
        this.numerocontato = String.valueOf(numerocontato);
        this.email = email;
    }

    int id;
    String numerocontato;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumerocontato() {
        return numerocontato;
    }

    public void setNumerocontato(String numerocontato) {
        this.numerocontato = numerocontato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "\nid=" + id +
                "\nnumerocontato='" + numerocontato + '\'' +
                "\nemail='" + email + '\'' +
                '}';
    }
}

