//Herencia utilizando Poo
//Dos clases en la que una hereda 10 metodos de la clase padre

public class Main {
    public static void main(String[] args) {

//Seleccion de personajes juegables

Personaje datos = new Personaje();

    System.out.println("Al escojer un personaje se le asignaran aleatoriamente los atributos.\n");

    //Muesta los personajes que se pueden elegir
    datos.Estadisticas();

    System.out.println("\nAtributos:");
    //Atributos del personaje 10 en total
        datos.Vida();
        datos.Ataque();
        datos.Defensa();
        datos.Energia();
        datos.Resistencia();
        datos.Velocidad();
        datos.Inteligencia();
        datos.Suerte();
        datos.Agilidad();
        datos.Experiencia();
        System.out.println("Los atributos se clasifican por puntos entre alto este, mejor sera el atributo.");
    }
}

