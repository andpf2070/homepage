package catburger;

import java.util.ArrayList;

public class Kiosk {
	ArrayList<String> basket = new ArrayList<>();
	
	
	
	public void run() {
		
		
		xxx:
		while(true) {
		
		Command cmd = new Command();	
		String c = cmd.getCommand("명령을 입력해주세요 : [1: 버거 / 2 : 사이드 / 3 : 음료 / 4 : 디저트] - c : 결제 \n");
		
		switch(c) {
		case "1" : 
			System.out.println("버거");
			ProcBurger pb = new ProcBurger();
			pb.run(basket);
			break;
			
		case "2" :
			System.out.println("사이드");
			ProcSide ps = new ProcSide();
			ps.run(basket);
			break;
			
		case "3" : 
			System.out.println("음료");
			ProcDrink pd = new ProcDrink();
			pd.run(basket);
			break;
			
		case "4" : 
			System.out.println("디저트");
			ProcDessert pdt = new ProcDessert();
			pdt.run(basket);
			break;
			
		case "c" :
			System.out.println("");
			System.out.println("[장바구니 : ");
			for(int i=0; i<basket.size(); i++) {
				System.out.println(basket.get(i));
			}
			
		case "0" :
			System.out.println("<- 이전으로 가기");
			
			
		}
		
		for(int i=0; i<basket.size(); i++) {
		System.out.println("장바구니 : " + basket.get(i));
	}
		
		}
	}
}