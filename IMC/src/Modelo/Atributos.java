package Modelo;

//nome da nossa classe abstrata 
public abstract class Atributos 
{
    //criando os atributos 
    private Double altura;
    private Double peso;
    private Double resultado;
    private String pesoStr;
    private String alturaStr;
    private String mensagem;
    private String alerta;

    //criando nossos construtores
    public Atributos(Double altura, Double peso) 
    {
        this.altura = altura;
        this.peso = peso;
    }

    public Atributos(String pesoStr, String alturaStr) 
    {
        this.pesoStr = pesoStr;
        this.alturaStr = alturaStr;
    }

    //criando nossos metodos get e set 
    public Double getPeso() 
    {
        return peso;
    }

    public void setPeso(Double peso) 
    {
        this.peso = peso;
    }

    public String getPesoStr() 
    {
        return pesoStr;
    }

    public void setPesoStr(String pesoStr) 
    {
        this.pesoStr = pesoStr;
    }

    public String getAlerta() 
    {
        return alerta;
    }

    public void setAlerta(String alerta) 
    {
        this.alerta = alerta;
    }
    
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) 
    {
        this.altura = altura;
    }

    public String getAlturaStr() 
    {
        return alturaStr;
    }

    public void setAlturaStr(String alturaStr) 
    {
        this.alturaStr = alturaStr;
    }

    public Double getResultado() 
    {
        return resultado;
    }

    public void setResultado(Double resultado) 
    {
        this.resultado = resultado;
    }

    public String getMensagem() 
    {
        return mensagem;
    }

    public void setMensagem(String mensagem) 
    {
        this.mensagem = mensagem;
    }
    
}
