package may.week3;

import java.io.*;
import java.util.*;

// 220516
public class BOJ10950 {
	// 1-1. Scanner 사용하기 -> runtime 에러 발생(NoSuchElement)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 T 입력 받기
        int T = sc.nextInt();
        // for문 사용해서 각 테스트 케이스마다 a+b 값 출력하기.
        for(int i=0; i<=T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
	}
	
	// 1-2. Scanner 사용하기
	public static void main1(String[] args) {
		// 첫째 줄에 테스트 케이스 T
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		
		// 각 테스트 케이스마다 A+B 값을 배열에 담기
		for(int i=0; i<T ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
		}
		
		// 배열 출력
		for(int k : arr) {
			System.out.println(k);
		}
	}
	
	// 2. BufferedReader 사용하기
	public static void main2(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}
