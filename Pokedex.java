import java.util.Vector;

public class Pokedex
{
    Vector<Entrenador> e= new Vector<Entrenador>();
    
    
    
    public Pokedex()
    {
        
    }

    public void agregarEntrenador(Entrenador entrenador){
        e.addElement(entrenador);
    }
    
    public Integer mostrarNumeroEntrenadores(){
        return e.size();
    }
    
    public void intercambiarPokemon(Integer numeroEntrenador1, Integer numeroEntrenador2, Integer numeroPokemon1, Integer numeroPokemon2){
        
        int entre1= numeroEntrenador1 -1;
        int entre2= numeroEntrenador2 -1; 
        
        Entrenador entrenador1= e.get(entre1);
        Entrenador entrenador2= e.get(entre2);
        Pokemon pokemon1=entrenador1.getPokemon(numeroPokemon1);
        Pokemon pokemon2=entrenador2.getPokemon(numeroPokemon2); 
        
        entrenador1.setPokemon(numeroPokemon1, pokemon2);
        entrenador2.setPokemon(numeroPokemon2, pokemon1);
        
    }
    
    public void reiniciarPokedex(){
        e.clear(); 
    }
    
    public void mostrarPokedex(){
        
        for(int i=0; i<e.size(); i++){
            Entrenador entrenador= e.get(i); 
            System.out.println(entrenador.getNombre());
        } 
    }
    
    public Integer mediaPokemon(){
        Integer promedio;
        Integer suma=0;
        
        for(Integer i=0; i<e.size(); i++){
                Entrenador entrenador=e.get(i); 
                suma= suma + entrenador.getNumeroPokemones(); 
        }   
        promedio=suma/e.size(); 
        return promedio;
    }
}
