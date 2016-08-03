import java.util.ArrayList;

public class Odometer {
	
	
	public static ArrayList<Integer> getNextReading(ArrayList<Integer> num){
	
			if(! isValidOdoNumber(num)){
				return null;
			}
			
			int maxDigit = 9;
			
			for(int i = num.size()-1; i >= 0 ; --i) {
			
				if(num.get(i) == maxDigit && maxDigit != 0) {
					maxDigit--;
				}
				else {
					num.set(i, num.get(i)+1);
					int newDigit = num.get(i)+1;
					for(int j = i+1; j < num.size(); j++) {
						num.set(j, newDigit++);
					}
					i=-1;
				}
			}
			return num;
	}
	
	public static ArrayList<Integer> getPrevReading(ArrayList<Integer> num){
		
		return null;
	}
	
	public static int getDistance(ArrayList<Integer> num1, ArrayList<Integer> num2){
	
	
		int number1 = convertToNum(num1);
		int number2 = convertToNum(num2);
		
		int diff = 0;
		
		if(number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = number1;
		}
		
		
		while(number2 - number1 > 0) {		
			number1 = convertToNum(getNextReading(num1));
			++diff;		
		}
	
		return diff;
		
	}
	
	public static ArrayList<Integer> getNextNthReading(ArrayList<Integer> num){
		
		return null;
	}
	
	public static ArrayList<Integer> getPrevNthReading(ArrayList<Integer> num){
		
		return null;
	}
	
	public static ArrayList<Integer> getLargestNum(Integer numDigit){
		
		return null;
	}
	
	public static ArrayList<Integer> getSmallestNum(Integer numDigit){
		
		return null;
	}
	
	public static boolean isValidOdoNumber(ArrayList<Integer> numList) {
        
        int prev = -1;
        
        for(int num: numList) {            
            if(prev > num) {
                return false;
            }            
            prev = num;            
        }
        
        return true;
    }
	
	public static ArrayList<Integer> initOdometer(int maxLength){
		ArrayList<Integer> odometer = new ArrayList<>();
		for(int i=0;i<maxLength;i++) {
			odometer.add(0);
		}
		return odometer;
	}
	public static ArrayList<Integer> convertToArrayList(int num, int maxdigitslimit){
		
		ArrayList<Integer> outList= new ArrayList<>();
		String numString = new Integer(num).toString();
		for(int i=0;i<numString.length();i++) {
			outList.add(Integer.parseInt(""+numString.charAt(i)));
		}
		return convertToMaxDigitList(outList,maxdigitslimit);
	}
	public static ArrayList<Integer> convertToMaxDigitList(ArrayList<Integer> list, int limit) {
		ArrayList<Integer> outList = new ArrayList<>();
		for(int i=list.size();i<limit;i++) {
			outList.add(0);
		}
		for(int i=0;i<list.size();i++) {
			outList.add(list.get(i));
		}
		return outList; 
	}
	public static Integer convertToNum(ArrayList<Integer> num){
		
		int outNum=0;
		for(int i=0;i<num.size();i++) {
			outNum=outNum*10+num.get(i);
		}
		return outNum;
	}

}
