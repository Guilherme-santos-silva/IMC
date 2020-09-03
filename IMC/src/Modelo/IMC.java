package Modelo;

//fazendo nossa classe "IMC" herdar da classe "Atributos" e implementar os metodos da nossa interface "Metodos"
public class IMC extends Atributos implements Metodos
{

    //nosso metodo principal, que foi herdado da classe "Atributos"
    //sempre que instanciarmos essa classe ela ira precisar de parametros definidos na linha abixo
    public IMC(Double altura, Double peso) 
    {
        super(altura, peso);
        
        //chamando nosso metodo "Executar()" que foi implementado da nossa classe "Metodos"
        Executar();
    }

    //nosso metodo "Executar()" implementado da nossa classe "Metodos"
    @Override
    public void Executar() 
    {
        //inicialmente setamos nosse atributo Mensagem como vazio
        this.setMensagem("");
        
        //apos isso setamos nosso atributo e dentro dele inserimos nossa logica matematica para calcular o IMC
        //Math.ceil é usada para arredondar um numero Double
        this.setResultado(Math.ceil(this.getPeso() /(this.getAltura() * this.getAltura())));
        
        //apos isso setamos o atributo "Resultado" com o valor dele mesmo usado na linha 26 usando "getResultado()"
        this.setResultado(this.getResultado());
        
        //aqui começamos nossa validacao a respeito do resultado do calculo
        
        //se o valor do nosso resultado for menor ou igual a 16
        if(this.getResultado() <= 16)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Magreza grave");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
        
        //se o valor do nosso resultado for menor ou igual a 17
        else if(this.getResultado() <= 17)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Magreza moderada");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
        
        //se o valor do nosso resultado for menor ou igual a 18.5
        else if(this.getResultado() <= 18.5)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Magreza leve");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
        
        //se o valor do nosso resultado for menor ou igual a 25
        else if(this.getResultado() <= 25)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Saudável");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
        
        //se o valor do nosso resultado for menor ou igual a 30
        else if(this.getResultado() <= 30)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Sobrepeso");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
        
        //se o valor do nosso resultado for menor ou igual a 35
        else if(this.getResultado() <= 35)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Obesidade Grau I");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
        
        //se o valor do nosso resultado for menor ou igual a 40
        else if(this.getResultado() <= 40)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Obesidade Grau II (considerada severa)");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
        
        //se o valor do nosso resultado for maior que 40
        else if(this.getResultado() > 40)
        {
            //entao setamos nosso atributo "Alerta" com um valor correspondente
            this.setAlerta("Obesidade Grau III (considerada mórbida)");
            //apos isso setamos o atributo "Alerta" com o valor dele mesmo usado na linha acima "getAlerta()"
            this.setAlerta(this.getAlerta());
        }
    }
    
}
