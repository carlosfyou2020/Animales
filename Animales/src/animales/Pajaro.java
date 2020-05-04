
package animales;


public class Pajaro extends Animal {
    
      private double longitudPico;
      
      public Pajaro(){
          
      }
      
      public Pajaro(String nombre, int edad){
          super(nombre,edad);
      }
    

    /**
     * @return the longitudPico
     */
    public double getLongitudPico() {
        return longitudPico;
    }

    /**
     * @param longitudPico the longitudPico to set
     */
    public void setLongitudPico(double longitudPico) {
        this.longitudPico = longitudPico;
    }

    
}
