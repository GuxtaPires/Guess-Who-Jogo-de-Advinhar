import java.util.Scanner;
import java.util.Random;

public class App
{
	public static void main(String[] args) {

        //Instancias
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

        //Interface para introdução do jogo
		System.out.println("---------------------------Guess who!---------------------------");
		System.out.println("Olá!, seja bem vindo ao Guess Who!, o jogo de advinhação!");
		System.out.println("Informe com quantas tentativas você acha que consegue advinhar o número de 0 a 100:");
		System.out.println("1 - Nível fácil: 10 tentativas;");
		System.out.println("2 - Nível médio: 5 tentativas;");
		System.out.println("3 - Nível difícil: 3 tentativas");
		System.out.println("4 - Nível impossível: 1 tentativa");
        System.out.print("Minha escolha é: ");
		int escolha = sc.nextInt();

        //Atribuindo o valor a variável aleatória
        int advinheMe = r.nextInt(100);

        //Método para o usuário Jogar
        CertoOuErrado.acertei(advinheMe, escolha);

        sc.close();
	}
}

