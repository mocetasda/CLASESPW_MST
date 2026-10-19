package model;
//importaciones, es el molde de un jugador
public class Jugador {
    // atributos - variables que cualifican
    public String nombre, correo;
    public int numeroVidas, habilidad;
    public boolean estrella;

    /* constructores = hace realidad el objeto. 1 a n. Si no escribo nada por defecto tengo un constructor 1.
     Si no tengo ningun constructor tengo 1. Si consstruyo uno, seguiré teniendo uno porque el vacío queda enmascarado)
     Se pueden crear tantos constructores siempre que no coincidas la firmas (el número de parámetros, orden y tipos de
     parámetros no coincidan
     */
    public Jugador (){ // Constructor vacio, se escribe si o sí.aunque se parezca que no se va utilizar.
        //para crear tipo boot, cada vez que le de vacio
        this.nombre ="Bot";
        this.estrella=true;
        this.habilidad = (int) (Math.random()*101); // Crear aleatorio (por 101 porque el aleatorio bota un valor de 0 - 0.999)
        this.correo="sistemas@gmail.com";
    }
    public Jugador (String nombre, int numeroVidas, int habilidad, boolean estrella){
        this.nombre= nombre;
        this.numeroVidas= numeroVidas;
        this.habilidad= habilidad;
        this.estrella= estrella;
        }

    public Jugador (String nombre, int numeroVidas){
        this.nombre=nombre;
        this.numeroVidas=numeroVidas;
    }

    public Jugador (String nombre, String correo){
        this.nombre=nombre;
        this.correo=correo;
    }

    public Jugador (int habilidad, String correo) {
        this.habilidad = habilidad;
        this.correo = correo;
    }


    // metodos = funcionalidades, que puede hacer el jugador
    public void saludar (){
        System.out.println("Hola me llamo " + nombre);
        System.out.printf("Actualmente tengo %d vidas\n",numeroVidas);
        System.out.println(" ");
    }

    public void recibirimpacto (){
        if (numeroVidas == 0){
            System.out.println("Estoy muerto");
        } else if (numeroVidas < 0) {
            System.out.println("Para, ya estoy muerto");
            
        }else {
            numeroVidas--;
        }

    }
}
