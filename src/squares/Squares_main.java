package squares;

public class Squares_main {
	
 public static void main (String[] args){
 
  double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
  double y[] = { 1.3, 1.9, 2.8, 4.3, 4.5, 6.2, 8.2 };
  //���_�l y=5.5357x+0.85
  double theta[] = new double[2];
  
  Squares_lib slib = new Squares_lib(x, y);
 
  for(int i = 0; i < 100; i++){
		theta = slib.getDx();
		System.out.println(i+" : theta[0] = "+theta[0]);
		System.out.println(i+" : theta[1] = "+theta[1]);
		System.out.println(i+" : Objective function = "+slib.getRx());
  }

 }
 
}

