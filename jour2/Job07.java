import java.util.ArrayList;

public class Job07 {
    public static void main(String[] args) {
        Job07 calc = new Job07();

        ArrayList<Float> myArray = new ArrayList<Float>();

        int num1 = 10;
        int num2 = 0;
        String myObj = null;
        myArray.add((float) num1);
        myArray.add((float) num2);

        try {
            calc.division(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Résultat de la division: Erreur: ArithmeticExpression");
        }

        try {
            calc.readArray(myArray, 23);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lecture du tableau: Erreur: ArrayIndexOutOfBoundsException.");
        }

        try {
            calc.readNullObject(myObj); //
        } catch (NullPointerException e) {
            System.out.println("Erreur: NullPointerException.");
        }
    }

    public void division(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division par zéro n'est pas autorisée");
        }

        int quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);
    }

    public void readArray(ArrayList<Float> myArray, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= myArray.size()) {
            throw new ArrayIndexOutOfBoundsException("L'index spécifié n'est pas valide");
        }

        float value = myArray.get(index);
        System.out.println("Valeur à l'index " + index + ": " + value);
    }

    public void readNullObject(Object obj) throws NullPointerException {
        if (obj == null) {
            throw new NullPointerException("L'objet spécifié est null");
        }


    }
}
