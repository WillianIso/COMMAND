public class Consultorio {

    private int horario;
    private String situacao;

    public Consultorio(int horario, String situacao)
    {
        this.horario = horario;
        this.situacao = situacao;
    }

    public void abrirConsultorio()
    {
        this.situacao = "Consultorio Aberto";
    }

    public void fecharConsultorio()
    {
        this.situacao = "Consultorio Fechado";
    }

    public int getHorario() {
        return horario;
    }

    public Consultorio setHorario(int horario) {
        this.horario = horario;
        return this;
    }

    public String getSituacao() {
        return situacao;
    }

    public Consultorio setSituacao(String situacao) {
        this.situacao = situacao;
        return this;
    }
}
