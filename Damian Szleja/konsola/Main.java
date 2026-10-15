import java.util.Scanner;

public class Main {
    private int[] liczby = new int[10];

    private int szukajMaksimum(int poczatek) {
        int indeks = poczatek;
        for (int i = poczatek + 1; i < liczby.length; i++) {
            if (liczby[i] > liczby[indeks]) {
                indeks = i;
            }
        }
        return indeks;
    }

    public void sortuj() {
        for (int i = 0; i < liczby.length - 1; i++) {
            int indeks = szukajMaksimum(i);
            int pomoc = liczby[i];
            liczby[i] = liczby[indeks];
            liczby[indeks] = pomoc;
        }
    }

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        Main program = new Main();
        System.out.println("Podaj 10 liczb całkowitych:");
        for (int i = 0; i < program.liczby.length; i++) {
            program.liczby[i] = wejscie.nextInt();
        }
        program.sortuj();
        System.out.println("Liczby posortowane malejąco:");
        for (int liczba : program.liczby) {
            System.out.print(liczba + " ");
        }
        System.out.println();
    }
}
