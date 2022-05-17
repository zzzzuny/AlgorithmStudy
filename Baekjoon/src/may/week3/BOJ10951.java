package may.week3;

import java.io.*;
import java.util.*;

// 220517 
// 백준 10951번 A+B - 4
// 입력이 더이상 주어지지 않을때. EOF(End of File) 처리
public class BOJ10951 {
	// 1. Scanner 사용시 hasNext(), hasNextInt()로 처리
	public static void main1(String[] args) {
		// 두 정수 A, B 입력받기
		Scanner sc = new Scanner(System.in);
		// while문 조건 = 입력값이 없을 때
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
	
	// 2. BufferedReader 사용시 null 체크
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input;
		while((input=br.readLine())!=null) {
			st = new StringTokenizer(input, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
	}
}
