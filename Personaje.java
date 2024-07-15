import java.util.Scanner;

public class Personaje extends Atributos {
    public String n1 = "Guerrero";
    public String n2 = "Mago";
    public String n3 = "Lancero";
    public String n4 = "Arquero";


    public Personaje(int vitalidad, int ataque, int defensa, int energia, int resistencia, int velocidad, int inteligencia, int suerte, int agilidad, int experiencia, String n1, String n2, String n3, String n4) {
        super(vitalidad, ataque, defensa, energia, resistencia, velocidad, inteligencia, suerte, agilidad, experiencia);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public Personaje() {
        super();
    }


    //Metodo de eleccion de personaje
    public void Estadisticas (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona tu personaje.");
        System.out.println("Personajes: [1]" + n1 + ", [2]" + n2 + ", [3]" + n3 + ", [4]" + n4 + ".");
        int personajes = scanner.nextInt();

        if(personajes == 1){
            System.out.println("Tu personaje: " + n1);
        }
        else if(personajes == 2){
            System.out.println("Tu personaje: " + n2);
        }
        else if(personajes == 3){
            System.out.println("Tu personaje: " + n3);
    }
        else if(personajes == 4) {
            System.out.println("Tu personaje: " + n4);
        }
        else{
            System.out.println("Proximamente, seleccione otro personaje.");
            Estadisticas();
        }
    }
}