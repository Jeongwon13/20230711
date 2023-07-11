package pkg1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public int solution(String str) {
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1) == '(') answer += stack.size();
				else answer++;
			}
		
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.print(T.solution(str));
	}

}
