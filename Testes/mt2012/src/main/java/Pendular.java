public class Pendular extends Comboio {
    public Pendular(String nome) {
        super(nome);
        setServicoABordo(new ServicoSemEnjoos());
    }
}
