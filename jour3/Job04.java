public class Job04 {
    public static void main(String args[]) {
        myGeneric<String> instance = new myGeneric<String>("");
        String valeur = instance.getValue();

        instance.addValue("Hello");
        String chaine = instance.getValue();
        System.out.println("Contenu de la boîte : " + chaine);
    }

    static class myGeneric<T> {
        private T value;
        public myGeneric(T value) {
            this.value = value;
        }
        public T getValue() {
            return value;
        }
        public void addValue(String newString) {
            if (value instanceof String) {
                value = (T) (value + newString);
            }
        }
    }
}
