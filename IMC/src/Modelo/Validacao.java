package Modelo;

//fazendo nossa classe "Validacao" herdar da classe "Atributos" e implementar os metodos da nossa interface "Metodos"
public class Validacao extends Atributos implements Metodos
{

    //nosso metodo principal, que foi herdado da classe "Atributos"
    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Validacao(String pesoStr, String alturaStr) 
    {
        super(pesoStr, alturaStr);
        
        //chamando nosso metodo "Executar()" que foi implementado da nossa classe "Metodos"
        Executar();
    }

    
    //nosso metodo "Executar()" implementado da nossa classe "Metodos"
    @Override
    public void Executar() 
    {
        //inicialmente setamos nosse atributo Mensagem como vazio
        this.setMensagem("");
        
        //usamos o bloco de captura de erro try catch para converter nossos atributos
        try 
        {
           //pegamos o valor do atributo PesoStr e setamos ele dentro do nosso atributo Peso
           this.setPeso(Double.parseDouble(this.getPesoStr()));
           
           //pegamos o valor do atributo AlturaStr e setamos ele dentro do nosso atributo Altura
           this.setAltura(Double.parseDouble(this.getAlturaStr()));
        }
        catch (Exception e) 
        {
            //caso no for possivel a conversao entao setamos uma mensagem de erro no atributo Mensagem
            this.setMensagem("erro, digite um numero valido");
        }
    }
    
}
