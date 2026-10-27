public class cajero {
    // atributos - características (cualifican
    private int saldo;
    // constructores - inicializar el método
    // metodos - funcionalidades
    public cajero (){
        saldo = 1000;
    }
    public void ingresarDInero(int dinero){
        saldo+=dinero;
    }

    public void retirarDInero(int dinero){
        saldo-=dinero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
