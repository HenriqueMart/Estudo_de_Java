public class App  <T, S>{
    private T ob;
    private S ob2;

    public App(T ob, S ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    public void mostrarTipo(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    @Override
    public String toString() {
        return this.ob + ", " + this.ob2;
    }

    
    public static void main(String[] args) {
        App<Integer, String> obj1 = new App<>(4, "Quatro");
        App<Integer, String> obj2 = new App<>(7, "Sete");
        obj1.mostrarTipo();
        obj2.mostrarTipo();


        System.out.println(obj1);
        System.out.println(obj2);
    }
}
