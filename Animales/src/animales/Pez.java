
package animales;


public class Pez extends Animal{
    
    private double longitudAletas;
    
    public Pez(){
        
    }
    
    
    public Pez(String nombre, int edad){
        super(nombre,edad);
    }

    /**
     * @return the longitudAletas
     */
    public double getLongitudAletas() {
        return longitudAletas;
    }

    /**
     * @param longitudAletas the longitudAletas to set
     */
    public void setLongitudAletas(double longitudAletas) {
        this.longitudAletas = longitudAletas;
    }
    
}
