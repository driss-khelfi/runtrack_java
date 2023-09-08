interface Instrument {
    public void jouer(); // interface method (does not have a body)

}

class Guitare implements Instrument {
    public void jouer() {
        System.out.println("La guitare joue un air rock ");
    }

}

class Piano implements Instrument {
    public void jouer() {
        System.out.println("Le piano joue une mélodie douce ");
    }

}

class Musique {
    public static void main(String[] args) {
        Guitare myGuitare = new Guitare();
        myGuitare.jouer();

        Piano myPiano = new Piano();
        myPiano.jouer();

    }
}