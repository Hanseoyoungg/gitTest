import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//public class Main{
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		int num = Integer.parseInt(st.nextToken());
//		int idx = Integer.parseInt(st.nextToken());
//		long[] arr = new long[num];
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for (int i = 0; i < num; i++) {
//			arr[i] = Long.parseLong(st.nextToken());
//		}
//		Arrays.sort(arr);
//		System.out.print(arr[idx-1]);
//	}
//}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long[] arr = new long[num];

		for (int i = 0; i < num; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(arr);
		int max = 1;
		int temp = 0;
		int maxidx = 0;

		for (int i = 1; i < num; i++) {
			if (arr[i - 1] == arr[i]) { // 앞뒤 같으면
				if (temp > 0) // 후보가 존재
					temp++;
				else { // 아직 후보 없음
					max++;
					maxidx = i;
				}
			} else { // 다름, 후보 생김
				if (temp > 0) // 후보 있는데 또 생김, 이전 후보 버리기 max 안됐으니까
					temp = 1;
				else { // 첫 후보
					temp++;

				}
			}
			if (temp > max) {
				max = temp;
				temp = 0;
				maxidx = i;
			}
		}
		System.out.print(arr[maxidx]);
	}

}