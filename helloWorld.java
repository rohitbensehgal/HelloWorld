import java.util.Arrays;
//hello world using no strings lol;
public class helo {
	public static void main(String[] args) {
		int[] helloLetters = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 32};
		int[] realHelloLetters = {8, 5, 12, 12, 15, 32, 32, 23, 15, 18, 12, 4};
		for(int i = 0; i < 26; i++) {
			helloLetters[i] = i+64;
		}
		for(int i = 0; i < 25; i++) {
			if(realHelloLetters[i] == 32){
				char ch = (char) realHelloLetters[i];
				System.out.println(ch);
			}else {
				char ch = (char) helloLetters[realHelloLetters[i]];
				System.out.println(ch);
			}
		}
		
		

	}
}
