public class FecharConsultorioTarefa implements Tarefa{

    private Consultorio consultorio;

    public FecharConsultorioTarefa(Consultorio consultorio)
    {
        this.consultorio = consultorio;
    }

    public void executar()
    {
        this.consultorio.fecharConsultorio();
    }

    public void cancelar()
    {
        this.consultorio.abrirConsultorio();
    }
}
