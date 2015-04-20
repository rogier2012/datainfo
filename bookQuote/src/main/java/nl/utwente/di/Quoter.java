package nl.utwente.di;

public class Quoter {
	public double getBookPrice(String name){
		double result;
		if (name.equals("1")){
			result = 10;
		} else if (name.equals("2")){
			result = 45;
		} else if (name.equals("3")){
			result = 20;
		} else if (name.equals("4")){
			result = 35;
		} else if (name.equals("5")){
			result = 50;
		} else {
			result = 0;
		}
		return result;
	}
}
