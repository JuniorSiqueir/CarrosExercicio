public class App {
    public static void main(String[] args) {

        final int numCarros = 3;
        Carro[] carros = new Carro[numCarros];
        String[] nomesCarros = {"HRV", "Golf", "Fusca"};


        for (int i = 0; i < numCarros; i++) {
            carros[i] = new Carro(nomesCarros[i]);

        }

        for(Carro c : carros) {
            c.info();
        }
    }
}
