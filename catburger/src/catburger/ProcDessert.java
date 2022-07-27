package catburger;

import java.util.ArrayList;

public class ProcDessert {

	public void run(ArrayList<String> basket) {
		Command cmd = new Command();
		String c = cmd.getCommand("명령을 입력해주세요 : [1 : 컵 아이스크림 / 2 : 선데/ 3 : 팝핑캔디 선데 ] : ");
		switch(c) {
		case "1" :
			System.out.println("컵 아이스크림 선택함");
			basket.add("컵 아이스크림");
			break;
			
		case "2" :
			System.out.println("선데 선택함");
			basket.add("선데");
			break;
			
		case "3" :
			System.out.println("팝핑캔디 선택함");
			basket.add("팝핑캔디");
			break;
		}
	}		
}
