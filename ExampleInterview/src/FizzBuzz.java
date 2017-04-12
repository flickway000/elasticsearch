
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<50; i++){
			StringBuilder str = new StringBuilder();
			str.append((i%(4*3) == 0)?"FizzBuzz":((i%4==0)?"Buzz":((i%3==0)?"Fizz":i)));
			System.out.println("["+i+"] : "+str);
		}

	}

}
