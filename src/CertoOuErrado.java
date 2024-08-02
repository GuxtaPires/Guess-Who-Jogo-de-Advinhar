import java.util.Scanner;

public class CertoOuErrado {
	public static void acertei (int advinheMe, int escolha) {
        //váriavel definida para limitar as tentativas por nível
	    int limiteTentativa = 0;

        //Selecionando o nível escolhido pelo usuário
        switch (escolha) {
            case 1:
                limiteTentativa = 10;
                break;
            case 2:
                limiteTentativa = 5;
                break;
            case 3:
                limiteTentativa = 3;
                break;
            case 4:
                limiteTentativa = 1;
                break;
            default:
                System.out.println("Erro! Encerrando jogo");
                return;
        }

        System.out.println("---------------------------Guess who!---------------------------");

        Scanner scan = new Scanner(System.in);

        //Loop com base no nível do usuário
		for (int i = 0; i < limiteTentativa; i++) {
            System.out.println("----------------------------------------------------------------");
			System.out.print((i+1) + "º: Tentativa: ");
			int tentativa = scan.nextInt();
			System.out.println("\n");

            //Condicional: Certo ou errado?
			if (tentativa == advinheMe) {
				System.out.println("Parabens! voce acertou o numero: " + advinheMe);
				return;
			} else {
                //Condicional para saber se é a ultima tentativa
                if (i != (limiteTentativa-1))
                {
                    //Condicional para dar dica ao usuário
                    if (tentativa < advinheMe){
                        System.out.println("O número é Maior, tente novamente!");
                    }else if (tentativa > advinheMe){
                        System.out.println("O número é Menor, tente novamente!");
                    }
                }
			}
		}
        System.out.println("----------------------------------------------------------------");
		System.out.println("Você perdeu! O número era: " + advinheMe);
        scan.close();
		return;
	}
}
