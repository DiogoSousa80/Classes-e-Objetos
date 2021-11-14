public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETA = "preta";
    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusos;

    public Carro(Integer quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }


    public Integer getQuantidadePneus(){
        return quantidadePneus + 2;
    }

    public void setQuantidadePneus(Integer quantidadeCalotas){
       quantidadeCalotas = quantidadePneus;
      quantidadeParafusos = quantidadePneus * 4;
        this.quantidadePneus = quantidadeCalotas;
    }


    public void setCor(String cor){
        System.out.println(cor);
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusos() {
        return quantidadeParafusos;
    }

    public void setQuantidadeParafusos(Integer quantidadeParafusos) {
        this.quantidadeParafusos = quantidadeParafusos;
    }

    public void imprimeValores(){

        System.out.println("Quantidade Pneus " + quantidadePneus);
        System.out.println("Quantidade de Calotas" + getQuantidadeCalotas());
    }




}
