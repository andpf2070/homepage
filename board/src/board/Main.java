package board;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Post> posts = new ArrayList<>();
		
		
//		posts.add(new Post("테스트1", "테스트입니다~1", "nyang", 1));
//		posts.add(new Post("테스트2", "테스트입니다~2", "nyang", 2));
//		posts.add(new Post("테스트3", "테스트입니다~3", "nyang", 3));
		
		Scanner sc = new Scanner(System.in);
		
		loop:
			while(true) {
		System.out.println("============================================================================");		
		System.out.println("|명령을 입력해주세요. [1 : 글 쓰기] [2 : 글 리스트] [3 : 글 읽기] [4 : 글 삭제] [e : 끝내기]|");
		System.out.println("============================================================================");
		String cmd = sc.next();
		
			
		switch(cmd) {
		case "1" : 
			System.out.println("**********글 쓰기**********\n");
			System.out.print("제목을 입력해주세요 : ");
			String title = sc.next();
			System.out.print("내용을 입력해주세요 : ");
			String content = sc.next();
			System.out.print("아이디를 입력해주세요 : ");
			String id = sc.next();
			System.out.print("no를 입력해주세요 : ");
			int no = sc.nextInt();
			
			posts.add(new Post(title, content, id, no));
			break;
					
		case "2" :
			
			System.out.println("**********글 리스트**********");
			
			for(int i=0; i<posts.size(); i++) {
				System.out.print(posts.get(i).no);
				System.out.print(" ");
				System.out.print(posts.get(i).title);
				System.out.print(" ");
				System.out.print(posts.get(i).content);
				System.out.print(" ");;
				System.out.print(posts.get(i).id);
				System.out.println(" ");
								
			}
			break;
			
		case "3" :
			System.out.println("********** 글 읽기 **********");
			System.out.print("읽을 글 번호 입력 : ");
			int readNo = sc.nextInt();
			
			for(int i=0; i<posts.size(); i++) {
				if(posts.get(i).no == readNo) {
					System.out.println("작성자 id : " + posts.get(i).id);
					System.out.println("=============================");
					System.out.println("글제목 : " + posts.get(i).title);
					System.out.println("=============================");
					System.out.println("글내용 : " + posts.get(i).content);
					System.out.println("=============================");
				}
			}
			break;
			
		case "4" : 
			System.out.println("********** 글 삭제 **********");
			System.out.print("지울 글 번호를 입력해주세요 : ");
			int delNo = sc.nextInt();
			for(int i=0; i<posts.size(); i++) {
				if(posts.get(i).no == delNo) {
					System.out.println("글이 삭제 되었습니다.");
					posts.remove(i);
				}
			}
			
		case "e" : 
			System.out.println("********** 종료 **********");
			break loop;
			}
		}
	}
}
