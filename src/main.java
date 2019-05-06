public class main {
    public static  void main(String args[]){
        Quadrado q = new Quadrado(10);
        System.out.println(q.calcArea());
        System.out.println(q.calcPerimetro());
        ICalcGeometria c = new Circulo(10);


    }
}
