public class TesteBicicleta {
    public static void main(String[]args){

        bicicleta caloi = new bicicleta();
        caloi.nome = "Calloi";
        caloi.marcha = 5;
        caloi.modelo = "ABC-23";

        bicicleta k = new bicicleta();
        k.nome = "fast calloi";
        k.modelo = "fast";

        caloi.imprimir();
        k.imprimir();
    }
}
