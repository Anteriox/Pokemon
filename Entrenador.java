import java.util.Vector;

public class Entrenador
{
    
    Vector<Pokemon> p= new Vector<Pokemon>();
    
    
    
    private String nombre;
    private Integer edad;
    
    
    public Entrenador(String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public Entrenador()
    {
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Integer getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    
    public Integer getNumeroPokemones(){
        return p.size(); 
    }
    
    public void capturarPokemon(Pokemon pokemon){
        p.addElement(pokemon); 
    }
    
    public void liberarPokemon(Integer numeroPokemon){
        int aux= numeroPokemon-1; 
        p.removeElementAt(aux); 
    }
        
    public Pokemon getPokemon(Integer numeroPokemon){
        return p.get(numeroPokemon-1);
    }
    
    public void setPokemon(Integer numeroPokemon, Pokemon pokemon){
        p.set(numeroPokemon-1, pokemon);
    }
}
