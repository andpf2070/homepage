package catburger;

import java.util.ArrayList;


public class ProcBurger {
	public void run(ArrayList<String> basket) {
		
		
		Command cmd = new Command();
		String c = cmd.getCommand("명령을 입력해주세요 : [1 : 치즈와퍼 / 2 : 불고기와퍼/ 2 : 몬스터와퍼 ] : ");
		
		switch(c) {
		case "1" :
			System.out.println("치즈와퍼 선택함");
			Burger b = new Burger();
			b.name = "치즈와퍼";
			b.price = 1500;
			b.expiryDate = "20220727";
			
			int n = 10;
			long l;
			l = n;
			
			n = (int)l;
			
			basket.add(b);
			
			break;
			
		case "2" :
			System.out.println("불고기와퍼 선택함");
			basket.add("불고기와퍼");
			break;
			
		case "3" :
			System.out.println("몬스터와퍼 선택함");
			basket.add("몬스터와퍼");
			break;
		}
	}
}
