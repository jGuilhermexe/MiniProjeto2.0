public class Personagem {               // Criação da Classe representando os personagens da história interativa

    private String nome;                // No meu caso, os personagens possuem pontos de coragem ao invés de "Energia"
    private int coragem;
    public Personagem(String nome, int coragem) {
        this.nome = nome;
        this.setCoragem(coragem);
}

public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

public void perderCoragem (int quantidade) {
            setCoragem(getCoragem() - quantidade);
            if (getCoragem() < 0) {
                setCoragem(0); // Garante que a energia não seja negativa
            }
            System.out.println(nome + " perdeu " + quantidade + " pontos de coragem. Coragem atual: " + getCoragem()); // Contextualização da perca de pontos de coragem

     }


public void ganharCoragem (int quantidade) {
    setCoragem(getCoragem() + quantidade);
    if (getCoragem() < 0){
        setCoragem(0); 
        }
        System.out.println(nome + " ganhou " + quantidade + " pontos de coragem. Coragem atual: " + getCoragem());  // Contextualização do ganho de pontos de coragem
    }
}