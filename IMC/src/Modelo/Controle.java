package Modelo;

//fazendo nossa classe "Controle" herdar da classe "Atributos" e implementar os metodos da nossa interface "Metodos"
public class Controle extends Atributos implements Metodos
{

    //nosso metodo principal, que foi herdado da classe "Atributos"
    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public Controle(String pesoStr, String alturaStr) 
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
        
        //instanciamos nossa calsse "Validacao" atraves do objeto val e passamos os atributos que ela ira usar
        Validacao val = new Validacao(this.getPesoStr(), this.getAlturaStr());
        
        //se o valor do atributo Mensagem vindo do nosso objeto val for igual a vazio entao ele inicia o if caso contrario cai no else
        if(val.getMensagem().equals(""))
        {
            //instanciamos nossa calsse "IMC" atraves do objeto imc e passamos os atributos que ela ira usar
            IMC imc = new IMC(val.getAltura(), val.getPeso());
            
            //setamos o atributo Resultado vindo do objeto imc no nosso atributo Resultado 
            this.setResultado(imc.getResultado());
            
            //setamos o atributo Alerta vindo do objeto imc no nosso atributo Alerta 
            this.setAlerta(imc.getAlerta());
        }
        
        //caso o atributo Mensagem nao estiver vazio entao:
        else
        {
            //setamos o atributo Mensagem vindo do objeto val no nosso atributo Mensagem 
            this.setMensagem(val.getMensagem());
        }
    }   
}
