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

    public int lastGrade() {
        int i = size - 1;
        return grades[i];
    }

    public double average(int[] grades) {
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum = sum + grades[i];
        }
        double result = sum / size;
        return result;
    }
}
