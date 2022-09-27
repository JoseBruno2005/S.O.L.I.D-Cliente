package Model;

import java.util.UUID;

public class IndicadorEscricaoEstadual {
    public IndicadorEscricaoEstadual(int id, String indicador) {
        this.id = id;
        this.indicador = indicador;
    }

    int id;
    String indicador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    @Override
    public String toString() {
        return "IndicadorEscricaoEstadual{" +
                "\nid=" + id +
                "\nindicador='" + indicador + '\'' +
                '}';
    }
}
