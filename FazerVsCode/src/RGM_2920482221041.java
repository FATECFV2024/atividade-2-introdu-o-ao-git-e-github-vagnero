public class RGM_2920482221041 {


    //Atributos com os dados requeridos no exercício
    private String nomeCompleto = "Vagner da Silva Matias";
    private String rgm = "2920482221041";
    private Integer idade = 24;
    private String gitHub = "@vagnero";
    private String likedin = "@vagner-da-silva-matias";
    private String curso_Turma = "Análise e Desenvolvimento de Sistemas, 4° Semestre (manhã)";



    //Construtor vázio para caso seja necessário instânciar a classe sem valores atribuídos.
    public RGM_2920482221041(){

    }


    //Construtor com parâmetros para facilitar na na instânciação da classe.
    public RGM_2920482221041(String nomeCompleto, String rgm, Integer idade, String gitHub, String likedin,
            String curso_Turma) {
        this.nomeCompleto = nomeCompleto;
        this.rgm = rgm;
        this.idade = idade;
        this.gitHub = gitHub;
        this.likedin = likedin;
        this.curso_Turma = curso_Turma;
    }

    //Getters and Setters abaixo

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getRgm() {
        return rgm;
    }
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getGitHub() {
        return gitHub;
    }
    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }
    public String getLikedin() {
        return likedin;
    }
    public void setLikedin(String likedin) {
        this.likedin = likedin;
    }
    public String getCurso_Turma() {
        return curso_Turma;
    }
    public void setCurso_Turma(String curso_Turma) {
        this.curso_Turma = curso_Turma;
    }
    
    
}
