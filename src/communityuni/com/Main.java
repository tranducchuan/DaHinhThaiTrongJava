package communityuni.com;

// Java chấp nhận nhiều class trong 1 mã nguồn
class Bank{
	
	private String name;
	
	public Bank(String name){
		this.name = name;
	}
	
	public int interestRate(){
		return 0;
	}
	
	public String getName(){
		return this.name;
	}
	
}

class VIB extends Bank{
	public VIB(String name){
		super(name);
	}
	
	public int interestRate(){
		return 6;
	}
}

class ABC extends Bank{
	public ABC(String name){
		super(name);
	}
	
	public int interestRate(){
		return 7;
	}
}

class BIDV extends Bank{
	public BIDV(String name){
		super(name);
	}
	
	public int interestRate(){
		return 8;
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i = 1; i <= 10; ++i )
		{
			Bank bank = getBank();
			System.out.println("Gia tri bank thu: "+i);
			System.out.println(" Info-> Bank name: "+bank.getName() +", voi lai suat nam: "+bank.interestRate());
		}
	}
	
	public static Bank getBank(){
		// 0.000 -> 2.99999
		int num = (int)( Math.random() * 3 ) + 1;
		System.out.println();
		System.out.println(" => Option num = "+num);
		
		switch(num){
			case 1: 
				return new VIB("VIB"); 
			
			case 2: 
				return new ABC("ABC"); 
			
			case 3: 
				return new BIDV("BIDV");
		}
		
		return null;
	}
}

