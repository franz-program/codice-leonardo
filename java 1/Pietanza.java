import java.util.*;

/* La classe Pietanza definisce una pietanza da mangiare al ristorante */

public class Pietanza {
	
	/*avrà un nome, un prezzo e una tipologia di tipo String ma verrà inserito nel contruttore con un tipo char
	 * P: primo
	 * S: secondo
	 * B: bibite
	 * D: dessert
	 * C: contorno
	 */ 
    
    //variabili d'esemplare
    private String n;
    private double p;
    private String t;
    
    
    public Pietanza (char tipo, String nome, double prezzo)
    {
		n=nome;
		p=prezzo;
		
		switch (tipo)
		{
			case 'P':
			{
				t="primo";
				break;
			}
			case 'S':
			{
				t="secondo";
				break;
			}
			case 'B':
			{
				t="bibite";
				break;
			}
			case 'D':
			{
				t="dessert";
				break;
			}
			case 'C':
			{
				t="contorno";
				break;
			}	
		}
    }
    
    //get
    public String getNome()
    {
		return n;
	}
    
    public double getPrezzo()
    {
		return p;
	}
	
	public String getTipo()
    {
		return t;
	}
    
    //toString
    public String toString()
    {
		return getNome() + " (" + getTipo() + ") " + getPrezzo() + " euro";
	}
	
	//set
	public void setNome(String nome)
    {
		n = nome;
	}
    
    public void setPrezzo(double prezzo)
    {
		p=prezzo;
	}
	public void setTipo(String tipo)
	{
		t=tipo;
	}
	    
} /* Fine classe Pietanza */
