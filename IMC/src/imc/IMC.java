package imc;

import Apresentacao.Front;

public class IMC 
{

    public static void main(String[] args) 
    {
        //instanciamos nossa calsse "Front" atraves do objeto fr
        Apresentacao.Front fr = new Front(null, true);
        
        //usamos o metodo setVisible no nosso objeto para tornar a janela gafica visivel
        fr.setVisible(true);
    }
    
}
