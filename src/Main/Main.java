package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        ClienteFisico c1 = new ClienteFisico(2324343, new Contato(11231213, 122131, "afsdfls@gmail.com"),
                new Endereco(2324343, "12142342", "PB", "São José", "Maluco", "Do Maluco", "Perto Do Bar"), true,
                "1/5/2003", 11231213, "Geraldo Fereira Lopes", "13548345222", "23143241","iqiqyufq",
                new Sexo(2324343, "Masculico"), "1/3/1974");

        System.out.println(c1);


        ClienteJuridico c2 = new ClienteJuridico(232342222, new Contato(232342222, 123455, "jnkjanfdnqn@gmail.com"),
                new Endereco(232342222, "2243434","PB", "Santa Esmeralda", "Do Maluco", "Maluco", "Perto Do Outro Bar"),
                true, "02/03/2014", 232342222, "131424242", "Verder Muito",
                "Bar do Maluco", "90084859", "Msinnandf", "jqnndq");

        System.out.println(c2);
    }

}
