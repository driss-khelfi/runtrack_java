interface Nageur {
    public void nager(); // interface method (does not have a body)

}

class Homme implements Nageur {
    public void nager() {
        System.out.println("L'homme nage ");
    }

}

class Poisson implements Nageur {
    public void nager() {
        System.out.println("Le poisson nage rapidement ");
    }

}

class Main {
    public static void main(String[] args) {
        Homme myHomme = new Homme();
        myHomme.nager();

        Poisson myPoisson = new Poisson();
        myPoisson.nager();

    }
}