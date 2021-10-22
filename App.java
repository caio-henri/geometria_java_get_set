public class App {
    public static void main(String[] args) throws Exception {

        Quadrado q1 = new Quadrado(2.5);
        Quadrado.setDiag(1.41);

        System.out.println("----> QUADRADO COM DIAGONAL = 1.41");
        System.out.println("Area do Q1: " + q1.getArea() + " cm²");
        System.out.println("Perimetro de Q1: " + q1.getPerimetro() + " cm²");
        System.out.println("Diagonal de Q1: " + q1.getDiagonal() + " cm²");
        System.out.println("\n----> QUADRADO COM DIAGONAL DA CLASSE MATH");

        Quadrado.setDiag(Math.sqrt(2));
        System.out.println("Diagonal de Q1: " + q1.getDiagonal() + " cm²\n");

        Circulo c1 = new Circulo(2.5);
        Circulo.setPi(3.14);

        System.out.println("----> CIRCULO COM PI = 3.14");
        System.out.println("Area de C1 = " + c1.getArea() + " cm²");
        System.out.println("Circun. de C1: " + c1.getCircunferencia() + " cm²\n");

        Circulo.setPi(Math.PI);

        System.out.println("----> CIRCULO COM PI DA CLASSE MATH");
        System.out.println("Area de C1 com Math = " + c1.getArea() + " cm²");
        System.out.println("Circun. de C1 com Math: " + c1.getCircunferencia() + " cm²");

    }
}
