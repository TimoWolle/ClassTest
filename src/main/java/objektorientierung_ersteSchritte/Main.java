package objektorientierung_ersteSchritte;

public class Main {

    public static Flugzeug boing777 = new Flugzeug(120, "Lufthansa", "Spanien", "Deutschland");
    public static Flugzeug pe8 = new Flugzeug();

    public static void main (String[] args){
        boing777.berechneFlugzeit();
        System.out.println(boing777.getAusgangsLand() + " -> " + boing777.getReiseziel());
        boing777.fliegen();
        System.out.println(boing777.getAusgangsLand() + " -> " + boing777.getReiseziel());
        System.out.println("Flugzeit beträgt: " + boing777.getFlugzeit() + " Minuten");
    }

}