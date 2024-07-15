public class Atributos {
    private int min = 1;
    private int max = 100;
    protected int vitalidad;
    protected int ataque;
    protected int defensa;
    protected int energia;
    protected int resistencia;
    protected int velocidad;
    protected int inteligencia;
    protected int suerte;
    protected int agilidad;
    protected int experiencia;

    //constructor con los atributos
    public Atributos(int vitalidad, int ataque, int defensa, int energia, int resistencia, int velocidad, int inteligencia, int suerte, int agilidad, int experiencia) {
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.energia = energia;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
        this.suerte = suerte;
        this.agilidad = agilidad;
        this.experiencia = experiencia;
    }

    //constructor vacio
    public Atributos() {

    }

    //metodo para generar los puntos aleatoriamente en un rango de 1 y 100
    private int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    //Metodos de los atributos de los personajes estos se seleccionan aleatoriamente
    public void Vida() {
        vitalidad = generarAleatorio(min, max);
        System.out.println("Vida: " + vitalidad + " pts.");
    }

    public void Ataque() {
        ataque = generarAleatorio(min, max);
        System.out.println("Ataque: " + ataque + " pts.");
    }

    public void Defensa() {
        defensa = generarAleatorio(min, max);
        System.out.println("Defensa: " + defensa + " pts.");
    }

    public void Energia() {
        energia = generarAleatorio(min, max);
        System.out.println("Energía: " + energia + " pts.");
    }

    public void Resistencia() {
        resistencia = generarAleatorio(min, max);
        System.out.println("Resistencia: " + resistencia + " pts.");
    }

    public void Velocidad() {
        velocidad = generarAleatorio(min, max);
        System.out.println("Velocidad: " + velocidad + " pts.");
    }

    public void Inteligencia() {
        inteligencia = generarAleatorio(min, max);
        System.out.println("Inteligencia: " + inteligencia + " pts.");
    }

    public void Suerte() {
        suerte = generarAleatorio(min, max);
        System.out.println("Suerte: " + suerte + " pts.");
    }

    public void Agilidad() {
        agilidad = generarAleatorio(min, max);
        System.out.println("Agilidad: " + agilidad + " pts.");
    }

    public void Experiencia() {
        experiencia = generarAleatorio(min, max);
        System.out.println("Experiencia: " + experiencia + " pts.");
    }
}
