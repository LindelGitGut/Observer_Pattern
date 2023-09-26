public class Main {
    public static void main(String[] args) {


        //Die Temperaturüberwachung initialisieren (Publisher)

        Temperatur_Publisher messpunkt1 = new Temperatur_Publisher();

        //Observer Klassen initialisieren (Observer)

        Observer client1 = new Observer("Client1");
        Observer client2 = new Observer("Client2");

        // Abonnenten des Observers müssen in die Observerliste des Publishers
        messpunkt1.addObserver(client1);
        messpunkt1.addObserver(client2);

        // Nun möchten wir die Temperatur des messpunkt1 verändern
        //und somit unsere Observer auch unsere Benachrichtigung an unsere Observer triggern



        messpunkt1.setTemperatur(22);





    }
}