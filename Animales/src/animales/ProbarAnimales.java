package animales;

public class ProbarAnimales {

    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Pajaro miPajaro = new Pajaro();
        Pez miPez = new Pez();

        miAnimal.setNombre("Pepe");
        miPajaro.setNombre("Piolín");
        miPez.setNombre("Nemo");

        System.out.println("Mi animal se llama " + miAnimal.getNombre());
        System.out.println("Mi pájaro se llama " + miPajaro.getNombre());
        System.out.println("Mi pez se llama " + miPez.getNombre());
        
        miPez.setLongitudAletas(10.5);
        miPajaro.setLongitudPico(2.3);
        
        System.out.println("Mi pájaro tiene un pico de " + miPajaro.getLongitudPico());
        System.out.println("Mi pez tiene unas aletas de " + miPez.getLongitudAletas());
        
        /*
        miPajaro.setLongitudAletas(10.5);
        miPez.setLongitudPico(2.3);
        miAnimal.setLongitudAletas(10.5);
        miAnimal.setLongitudPico(2.3);
        */
        
        Animal miAnimal2 = new Animal("Luis",10);
        Pajaro miPajaro2 = new Pajaro("Pio",5);
        Pez miPez2 = new Pez("Dory",3);
        
        System.out.println("Mi animal se llama " + miAnimal2.getNombre());
        System.out.println("Mi pájaro se llama " + miPajaro2.getNombre());
        System.out.println("Mi pez se llama " + miPez2.getNombre());


    }

}
