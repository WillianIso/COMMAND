public class AberturaConsultorioTarefa implements Tarefa{

    private Consultorio consultorio;

    public AberturaConsultorioTarefa(Consultorio consultorio)
    {
        this.consultorio = consultorio;
    }

    public void executar()
    {
        this.consultorio.abrirConsultorio();
    }

    public void cancelar()
    {
        this.consultorio.fecharConsultorio();
    }

}
