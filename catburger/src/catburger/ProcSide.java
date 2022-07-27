package catburger;

import java.util.ArrayList;

public class ProcSide {

	public void run(ArrayList<String> basket) {
		Command cmd = new Command();
		String c = cmd.getCommand("명령을 입력해주세요 : [1 : 프렌치프라이 / 2 : 치즈프라이/ 3 : 쉐이킹프라이 ] : ");
		switch(c) {
		case "1" :
			System.out.println("프렌치프라이 선택함");
			basket.add("프렌치프라이");
			break;
			
		case "2" :
			System.out.println("치즈프라이 선택함");
			basket.add("치즈프라이");
			break;
			
		case "3" :
			System.out.println("쉐이킹프라이 선택함");
			basket.add("쉐이킹프라이");
			break;
		}
	}		
}
