public class Triangle {
    private double gipotenuza;
    private int katet1;
    private int katet2;

    public double getGipotenuza() {
        return gipotenuza;
    }

    public void setGipotenuza(double gipotenuza) {
        this.gipotenuza = gipotenuza;
    }

    public int getKatet1() {
        return katet1;
    }

    public void setKatet1(int katet1) {
        this.katet1 = katet1;
    }

    public int getKatet2() {
        return katet2;
    }

    public void setKatet2(int katet2) {
        this.katet2 = katet2;
    }

    void yuz(int a, int b){
        double yuz = (double) (a * b) / 2;
        System.out.println("Togri burchakli uchburchakni yuzi " + yuz);
    }

    void perimetr(int a, int b, int c){
        double perimetr = a + b + c;
        System.out.println("Togri burchakli uchburchakni yuzi " + perimetr);
    }
}
