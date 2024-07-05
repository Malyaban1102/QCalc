package project;

public class maincalc {
    public static void main(String[] args) {
 
        System.out.println("Starting QCalc..");
        StandardCalculator calc = new StandardCalculator();
        calc.add(1, 2);
        calc.printResult();

        ScientificCalculator scalc=new ScientificCalculator();
        ScientificCalculator scalc2=new ScientificCalculator();
        scalc.log(10);
        scalc.printResult();
        scalc.add(1.0,2.0);
        scalc.printResult();

 
    }
}
