public class Observer implements Observer_Interface{


    String observername;

    public Observer(String observername) {
        this.observername = observername;
    }

    public String getObservername() {
        return observername;
    }

    @Override
    public void getNachricht(String nachricht) {
        System.out.println(this.observername
                +" hat eine Nachricht erhalten! \nTemperatur hat sich verändert\n" +
                nachricht+"\n"+
                "--------------------------");
    }
}
