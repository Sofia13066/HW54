package recursion.controller;

public class RecursionAppl {

	public static void main(String[] args) {
		int a = 100;
        int b = 25;
        System.out.println(cgd(a, b));
        double x = 16;
        double precision = 0.01;
        System.out.println(sqrt(x, precision));
        print100();

	}
	
	public static int cgd(int a, int b) {
            if(b == 0){
                return a;
            }
		return cgd(b, a%b);
	}


	
	public static double sqrt(double x, double precision) {
            return Math.round(sqrt(x, precision, x)/ precision)*precision;
	}
	
	private static double sqrt(double x, double precision, double x1) {
        double n = x;
        double x2 = 0.5*(x1+n/x1);
        double d = Math.abs(x1-x2);
		if( d<=2*precision || d*d<=2*precision){
            return x2;
        }
           
            return sqrt(x, precision, x2);
        
	}

    


    public static void print100() {
        try {
            print100(1);
        } catch (ArithmeticException e) {
            System.out.println("Printed all 100");
        }
		

	}

    private static void print100(int i) {
        System.out.println(i);
        int toStop = 1 / (100-i++);
        print100(i);
    }

}