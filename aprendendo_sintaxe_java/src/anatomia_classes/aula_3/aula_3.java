package anatomia_classes.aula_3;

public class aula_3 {
    public static void main(String[] args) {

        String Nome = "Mizael";
        int idade = 28;
        boolean Verdadeira = true;
        boolean Falsa = false;

        idade = 30;
        String primeiroNome = "Mizael";
        String segundoNome ="Douglas";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto( String primeiroNome , String segundoNome){

        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
