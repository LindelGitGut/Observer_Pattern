import java.util.ArrayList;
import java.util.List;

public class Temperatur_Publisher {

    float temperatur;
    List<Observer> obseverlist = new ArrayList<>();

    public float getTemperatur() {
        return temperatur;
    }

    // setzt das temperatur attribut und benachrichtigt alle Objekte in der Observer Liste
    public void setTemperatur(float temperatur) {
        this.temperatur = temperatur;
        this.sendNachricht();
    }

    public List<Observer> getObseverlist() {
        return obseverlist;
    }

    // jeder zu benachrichtigenden Observer ist der Liste hinzuzufügen
    public void setObseverlist(List<Observer> obseverlist) {
        this.obseverlist = obseverlist;
    }

    //Fügt einen Observer der Observerliste hinzu
    public void addObserver(Observer observer){

        this.obseverlist.add(observer);

    }

    //entfernt einen bestimmten Observer aus der ObserverListe
    public void removeObserver(Observer_Interface observer){
        this.obseverlist.remove(observer);
    }

    //Iteriert durch die Observerliste und löst die Funktion vom entsprechenden Interface aus
    //als Parameter wird die überschriebene toString methode Übergeben
    void sendNachricht(){
        for (Observer obs: this.obseverlist
             ) {obs.getNachricht(this.toString());
        }
    }

    // wird für sendeNachricht benötigt
    @Override
    public String toString() {
        return "Aktuelle Temperatur: "+this.temperatur + " Grad Celsius";}


}
