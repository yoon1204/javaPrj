package algoPrj.day11.quiz;

import java.util.Arrays;

public class 병진님_rpgGame {

	public static void main(String[] args) {
		 
		병진님_Player[] user3 = new 병진님_Player[3];		
		user3[0]= new 병진님_Player();
		user3[0].item[0] = "검";
		
		System.out.println(user3[0].item[0]);
		System.out.println(Arrays.toString(user3[0].item));
		
//		테스트용 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.println(Arrays.toString(user[1].item));
//		
//		user[0].hp = 10;
//		System.out.println(user[0].hp);
		
		병진님_Player user1 = new 병진님_Player();
		병진님_Player user2 = new 병진님_Player();
		
		user1.hp -= 40;
		System.out.println(user1.hp);
		System.out.println(user2.hp);
		
		병진님_Player[] userpool = {user1,user2};
		System.out.println(userpool[0].hp);
		
	}

}
