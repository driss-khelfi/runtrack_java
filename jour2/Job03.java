interface Animal {
    public void Son(); // interface method (does not have a body)

}

class Chat implements Animal {


    @Override
    public void Son() {
        System.out.println("Le chat miaule. ");
    }
}

class Chien implements Animal {


    @Override
    public void Son() {
        System.out.println("Le chien aboie. ");
    }
}

class Oiseau implements Animal {


    @Override
    public void Son() {
        System.out.println("L'oiseau chante. ");
    }
}


class faireDuBruit {
    public static void main(String[] args) {
        Chat myChat = new Chat();
        myChat.Son();

        Chien myChien = new Chien();
        myChien.Son();

        Oiseau myOiseau = new Oiseau();
        myOiseau.Son();



    }
}
