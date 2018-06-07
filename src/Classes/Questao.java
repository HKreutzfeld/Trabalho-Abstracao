//@author 104935

package Classes;

public abstract class Questao {
    private String temaQuestao, pergunta, alternativaum, alternativadois, alternativatres, alternativaquatro, alternativacerta;

    public String getTemaQuestao() {
        return temaQuestao;
    }

    public void setTemaQuestao(String temaQuestao) {
        this.temaQuestao = temaQuestao;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getAlternativaum() {
        return alternativaum;
    }

    public void setAlternativaum(String alternativaum) {
        this.alternativaum = alternativaum;
    }

    public String getAlternativadois() {
        return alternativadois;
    }

    public void setAlternativadois(String alternativadois) {
        this.alternativadois = alternativadois;
    }

    public String getAlternativatres() {
        return alternativatres;
    }

    public void setAlternativatres(String alternativatres) {
        this.alternativatres = alternativatres;
    }

    public String getAlternativaquatro() {
        return alternativaquatro;
    }

    public void setAlternativaquatro(String alternativaquatro) {
        this.alternativaquatro = alternativaquatro;
    }

    public String getAlternativacerta() {
        return alternativacerta;
    }

    public void setAlternativacerta(String alternativacerta) {
        this.alternativacerta = alternativacerta;
    }

    public Questao(String temaQuestao, String pergunta, String alternativaum, String alternativadois, String alternativatres, String alternativaquatro, String alternativacerta) {
        this.temaQuestao = temaQuestao;
        this.pergunta = pergunta;
        this.alternativaum = alternativaum;
        this.alternativadois = alternativadois;
        this.alternativatres = alternativatres;
        this.alternativaquatro = alternativaquatro;
        this.alternativacerta = alternativacerta;
    }
}
