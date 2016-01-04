/**
 * Created by Amanda on 04/01/2016.
 */
import java.util.Random;
import java.util.Scanner;
public class Interface {
    Jogador1 jogador1 = new Jogador1();
    Jogador2 jogador2 = new Jogador2();
    Jogada jogada1 = new Jogada();
    Jogada jogada2 = new Jogada();
    Scanner recebe = new Scanner(System.in);
        public void iniciaJogadores(){
            System.out.println("Olá! gostaria de iniciar seu jogo? por favor digite o nome do primeiro jogador");
            jogador1.setName(recebe.next());
            System.out.println("bem vindo " + jogador1.getName() +"!" );

        }

        public void pedeJogada(){
            System.out.println("Pode fazer sua jogada! Escolha entre pedra,  papel e tesoura.");
            jogada1.tipoJogada=recebe.next();
            jogada1.transformaJogada();
            if (jogada1.transformaJogada()>3 || jogada1.transformaJogada()<1){
                System.out.println("jogada invalida. Faça outra jogada.");
                jogada1.tipoJogada=recebe.next();
                jogada1.transformaJogada();
            }
            Random random = new Random();
            jogada2.tipoDeJogada = random.nextInt(3)+1;
            System.out.println("Jogador 2 jogou: " + jogada2.retornaTexto());
        }

        public void retornaResultado(){
            if (jogada1.tipoDeJogada == jogada2.tipoDeJogada){
                System.out.println("Empate!");
            } else if (jogada1.tipoDeJogada==1 && jogada2.tipoDeJogada==3){
                System.out.println("vitória do jogador "+ jogador1.getName());
            } else if (jogada1.tipoDeJogada==3 && jogada2.tipoDeJogada==2){
                System.out.println("vitória do jogador "+ jogador1.getName());
            }  else if (jogada1.tipoDeJogada==2 && jogada2.tipoDeJogada==1){
                System.out.println("vitória do jogador "+ jogador1.getName());}
            else {System.out.println("Vitoria do jogador " + jogador2.getName());}


        }


    }



