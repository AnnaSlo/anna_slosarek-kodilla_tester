public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }


    public double averageValue() {
        int suma = 0;
        double average;
            //System.out.println("Ilość elementów w tablicy: " + this.size);
        for (int i = 0; i < this.size; i++) {
            suma = suma + grades[i];
            //System.out.println("Suma po iterracji numer " + i + " wynosi: " + suma);

        }
        average = (double) suma / this.size;
        System.out.println("Liczba ocen: " + this.size);
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + average);
        return average;
    }

    public void lastValue() {
        int lastValue = this.grades[this.size-1];
        System.out.println("Ostatnia dodana ocena: " + lastValue);
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.averageValue();
        grades.add(2);
        grades.averageValue();
        grades.add(5);
        grades.averageValue();
        grades.add(3);
        grades.averageValue();
        grades.lastValue();
    }
}