package Classes;

import java.util.ArrayList;

public class GeraQuestao {

    public static ArrayList<Questao> geraQuestaoCarros() {
        ArrayList<Questao> ret = new ArrayList();

        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Celta?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Corsa?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Onix?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Prisma?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Captiva?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Classic?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Vectra?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Cobalt?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Agile?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Chevrolet"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Punto?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Siena?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Strada?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Uno?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Palio?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Mobi?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Toro?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Idea?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Palio Weekend?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Fiat"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Gol?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Volkswagen"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Fox?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Volkswagen"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Up?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Volkswagen"));
        ret.add(new QuestoesCarro("Carro", "Qual marca possui o carro Fusca?", "Chevrolet", "Fiat", "Volkswagen", "Ford", "Volkswagen"));

        return ret;
    }

    public static ArrayList<Questao> geraQuestaoEsportes() {
        ArrayList<Questao> ret = new ArrayList();
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Neymar joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "PSG"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Mbappé joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "PSG"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Verratti joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "PSG"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Daniel Alves joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "PSG"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Messi joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Barcelona"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Soarez joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Barcelona"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Coutinho joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Barcelona"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Piqué joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Barcelona"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Cristiano Ronaldo joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Real Madrid"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Marcelo joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Real Madrid"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Benzema joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Real Madrid"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time que Alisson Becker joga atualmente?", "PSG", "Barcelona", "Real Madrid", "Roma", "Roma"));
        ret.add(new QuestoesEsportes("Esporte", "Quantas traves tem um campo de futebol?", "1", "2", "3", "0", "2"));
        ret.add(new QuestoesEsportes("Esporte", "Bayern de munique é um time de que país?", "Inglaterra", "Africa do Sul", "Alemanha", "Estados Unidos", "Alemaha"));
        ret.add(new QuestoesEsportes("Esporte", "Em que ano foi criado o basquete?", "1995", "1703", "2002", "1891", "1891"));
        ret.add(new QuestoesEsportes("Esporte", "Quanto tempo durou a maior corrida ja rtegistrada?", "3 horas", "7 horas", "23 Dias", "79 Dias", "79 Dias"));
        ret.add(new QuestoesEsportes("Esporte", "Em que ano foi realizado o primeiro jogo de futebol no Brasil?", "1895", "1932", "2013", "1766", "1895"));
        ret.add(new QuestoesEsportes("Esporte", "Qual mais rapida cortada em um jogo de volei?", "198 Km/h", "105 Km/h", "158 Km/h", "225 Km/h", "198 Km/h"));
        ret.add(new QuestoesEsportes("Esporte", "Em que dia é cmemorado o dia da natação?", " 8 de abril", " 18 de abri", " 28 de abri", " 12 de abri", " 8 de abri"));
        ret.add(new QuestoesEsportes("Esporte", "Qual a forma de um campo de beisebol?", "Diamante", "Quadrado", "Retangulo", "Triangulo", "Diamante"));
        ret.add(new QuestoesEsportes("Esporte", "Qual o time atual de Lebron James?", "Cavaliers", "Warrions", "Celtics", "Jazz", "Cavaliers"));

        return ret;
    }

    public static ArrayList<Questao> geraQuestaoGeografia() {
        ArrayList<Questao> ret = new ArrayList();

        ret.add(new QuestoesGeografia("Geografia", "Qual a capital do Brasil?", "Rio Branco", "Rio de Janeiro", "Paraguai", "Brasília", "Brasília"));
        ret.add(new QuestoesGeografia("Geografia", "Qual a região do estado de Santa Catarina?", "Norte", "Nordeste", "Sul", "Sudeste", "Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual a região do estado de Paraná?", "Norte", "Nordeste", "Sul", "Sudeste", "Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual a região do estado de Rio Grande Do Sul?", "Norte", "Nordeste", "Sul", "Sudeste", "Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual a região do estado de Rio De Janeiro?", "Norte", "Nordeste", "Sul", "Sudeste", "Sudeste"));
        ret.add(new QuestoesGeografia("Geografia", "Qual a região do estado de Espírito Santo?", "Norte", "Nordeste", "Sul", "Sudeste", "Sudeste"));
        ret.add(new QuestoesGeografia("Geografia", "Qual a região do estado de São Paulo?", "Norte", "Nordeste", "Sul", "Sudeste", "Sudeste"));
        ret.add(new QuestoesGeografia("Geografia", "Qual a região do estado de Minas Gerais?", "Norte", "Nordeste", "Sul", "Sudeste", "Sudeste"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Blumenau?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Santa Catarina"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Florianópolis?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Santa Catarina"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Joinville?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Santa Catarina"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Gaspar?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Santa Catarina"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Rio Grande?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Rio Grande do Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Porto Alegre?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Rio Grande do Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Caxias do Sul?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Rio Grande do Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Pelotas?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Rio Grande do Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Gramado?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Rio Grande do Sul"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Curitiba?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Paraná"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Maringá?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Paraná"));
        ret.add(new QuestoesGeografia("Geografia", "Qual estado possui a cidade de Londrina?", "Santa Catarina", "Rio Grande do Sul", "Paraná", "São Paulo", "Paraná"));

        return ret;
    }

}
