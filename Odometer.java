import java.util.ArrayList;

public class Odometer {
	
	
	public static ArrayList<Integer> getNextReading(ArrayList<Integer> num){
	
		return null;
	}
	
	public static ArrayList<Integer> getPrevReading(ArrayList<Integer> num){
		
		return null;
	}
	
	public static Integer getDistance(ArrayList<Integer> num1, ArrayList<Integer> num2){
	
		return null;
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
	
	public static ArrayList<Integer> convertToArrayList(int num){
		
		ArrayList<Integer> outList= new ArrayList<>();
		String numString = new Integer(num).toString();
		for(int i=0;i<numString.length();i++) {
			outList.add(Integer.parseInt(""+numString.charAt(i)));
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
