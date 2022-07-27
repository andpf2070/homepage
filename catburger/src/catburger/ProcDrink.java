package catburger;

import java.util.ArrayList;

public class ProcDrink {

	public void run(ArrayList<String> basket) {
		Command cmd = new Command();
		String c = cmd.getCommand("명령을 입력해주세요 : [1 : 코카콜라 제로 / 2 : 스프라이트/ 3 : 씨그램 ] : ");
		switch(c) {
		case "1" :
			System.out.println("코카콜라 제로 선택함");
			basket.add("코카콜라 제로");
			break;
			
		case "2" :
			System.out.println("스프라이트 선택함");
			basket.add("스프라이트");
			break;
			
		case "3" :
			System.out.println("씨그램 선택함");
			basket.add("씨그램");
			break;
		}
	}	
}

