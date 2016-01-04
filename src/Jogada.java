/**
 * Created by Amanda on 04/01/2016.
 */
public class Jogada {
    String tipoJogada;
    int tipoDeJogada;

    Jogada(){

    }

    public int transformaJogada(){
        switch (tipoJogada){
            case "pedra":
                tipoDeJogada = 1;
            break;
            case "papel":
                tipoDeJogada = 2;
            break;
            case "tesoura":
                tipoDeJogada = 3;
            break;
            default:System.out.printf("Você digitou uma opção inválida.");
        }
    return tipoDeJogada;
    }

    public String retornaTexto(){
        switch (tipoDeJogada){
            case 1:
                tipoJogada = "pedra";
                break;
            case 2:
                tipoJogada = "papel";
                break;
            case 3:
                tipoJogada = "tesoura";
                break;
        }
        return tipoJogada;
    }


}
