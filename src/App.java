import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner corajoso = new Scanner(System.in);
        String cara;

        Personagem cebolinha = new Personagem("Cebolinha", 50);         // Criação dos dois personagens utilizando os construtores da classe
        Personagem cascao = new Personagem("Cascao", 40);

        System.out.println("                                                  AVENTURAS DO CASCAO E CEBOLINHA - TURMA DA MONICA ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                  AVENTURAS DO CEBOLINHA");
        System.out.println("Cebolinha encontrou uma casa abandonada, o que ele deve fazer?");
        System.out.println("Digite (olhar para janela) para verificar antes de entrar, ou (abrir a porta) para adentrar na residência abandonada.");

        cara = corajoso.nextLine();
        if (cara.equals("olhar para janela")) {
            System.out.println("Cebolinha se assusta ao ver uma especie de ~~ fantasma ~~ .");
            cebolinha.perderCoragem(50);
            if (cebolinha.getCoragem() <= 0) {
                System.out.println("A coragem de Cebolinha esgotou. Ele saiu correndo pra casa.");
            } 
        } else if (cara.equals("abrir a porta")) {
            System.out.println("Cebolinha corajoso, enfrenta seu medo e entra sem pensar duas vezes.");
            cebolinha.ganharCoragem(10);
            
            System.out.println("Ao entrar, Cebolinha encontra uma escada. O que você deseja fazer?");
            System.out.println("Digite (subir as escadas) para subir e ver o que lhe aguarda ou (fugir) para sair correndo .");
            cara = corajoso.nextLine();

            if (cara.equals("fugir")) {
                System.out.println("Cebolinha fica com medo, pois a única iluminaçao dessa casa está em cima das escadas, entao ele decide nao arriscar.");
                cebolinha.perderCoragem(60);
                if (cebolinha.getCoragem() <= 0) {
                    System.out.println("A coragem de Cebolinha esgotou. Ele saiu correndo pra casa.");
                }
            } else if (cara.equals("subir as escadas")) {
                System.out.println("Ao subir as escadas, Cebolinha encontra um carrinho maneiro todo empoeirado, ele pega pra si como mérito da sua coragem!");
                cebolinha.ganharCoragem (100);
                System.out.println("Parabéns, você encontrou o final perfeito para a Aventura do Cebolinha! =D");

            } else {
                System.out.println("Você digitou algo incorretamente. A história do Cascao irá começar.");
            }

         } else {
            System.out.println("Você digitou algo incorretamente.A história do Cascao irá começar");
     
       }

                    // História do Segundo Personagem, o Cascao
        System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");
        Thread.sleep(3000);
        System.out.println(" Se você chegou até aqui, provavelmente você terminou a aventura do Cebolinha. ");
        System.out.println("                                                  AVENTURAS DO CASCAO");
        System.out.println("Umas nuvens carregadas aparecem no céu. Cascao precisa ir até a casa de sua avó O que Cascao deverá fazer?");
        System.out.println("Digite (guardachuva) para sair preparado de casa ou digite (arriscar) para tentar a sorte.");
        cara = corajoso.nextLine();
        if (cara.equals("arriscar")) {
            System.out.println("Cascao arrisca sair sem guardachuva, o pior realmente aconteceu. Uma tempestade chegou.");
            cascao.perderCoragem(40);
            if (cascao.getCoragem() <= 0) {
                System.out.println("A coragem de Cascao esgotou. Ele saiu correndo para a área coberta mais próxima.");
            } 
        } else if (cara.equals("guardachuva")) {
            System.out.println("Cascao realmente fez o certo. Pouco tempo depois, uma tempestade chegou mas ele estava protegido");
            cascao.ganharCoragem(10);
            
            System.out.println("Cascao encontra a casa da Monica no meio do caminho, durante a tempestade. O que ele deve fazer?");
            System.out.println("Digite (seguir andando) para nao parar e continuar seu trajeto até a casa de sua vó ou (entrar) para entrar na casa da Monica.");
            cara = corajoso.nextLine();

            if (cara.equals("seguir andando")) {
                System.out.println("Cascao continua andando em meio a uma grande tempestade. Seu guarda-chuva sai voando após uma ventania. Cascao se molha e sai correndo");
                cascao.perderCoragem(50);
                if (cascao.getCoragem() <= 0) {
                    System.out.println("A coragem de Cascao esgotou. Ele saiu correndo pra casa.");
                }
            } else if (cara.equals("entrar")) {
                System.out.println("Ao bater na porta, Cascao achou que Monica ainda estaria brava da ultima travessura. Porém, pelo contrario, ela abriu a porta e eles lancharam bolos deliciosos!");
                cascao.ganharCoragem (100);
                System.out.println("Parabéns, você encontrou o final perfeito para a Aventura do Cascao! =D");

            } else {
                System.out.println("Você digitou algo incorretamente. Fim das Aventuras.");
            }

         } else {
            System.out.println("Você digitou algo incorretamente. Fim das Aventuras.");
     
       }
       corajoso.close();
    }
}
