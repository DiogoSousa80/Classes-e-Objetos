package Um;


public class Primeiro {


    private static Integer variavel = 1;
    public final static Integer CONSTANTE = 10;
    private Integer escopoClasse = 1;




    public static Integer metadoEstatico(){
        return 1;

    }


    public void metadoPublico(){

        System.out.println(escopoClasse);
        escopoClasse = 2;
        System.out.println(escopoClasse);
    }

    public void alteraVariavel(){
        System.out.println(escopoClasse);
        escopoClasse = escopoClasse + 2;
        System.out.println(escopoClasse);

    }

}



