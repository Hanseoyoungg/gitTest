import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main2 {    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		int temp1 = (A+B)%C;
		int temp2 = ((A%C) + (B%C))%C;
		int temp3 = (A*B)%C;
		int temp4 = ((A%C)*(B%C))%C;
		sb.append(String.valueOf(temp1));
		sb.append("\n");
		sb.append(String.valueOf(temp2));
		sb.append("\n");
		sb.append(String.valueOf(temp3));
		sb.append("\n");
		sb.append(String.valueOf(temp4));
		System.out.print(sb);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String n = br.readLine();
//        int mod = 1000000;
//        int len = n.length();
//        int[] arr = new int[len+1];
//        
//        for (int i = 1; i <= len; i++) {
//        	arr[i] = n.charAt(i-1);
//        }
//        int[] dp = new int[len+1];
//        
//        
//        for (int i = 1; i <= len; i++) {
//        	String temp = "";
//        	if (i == 1) {	//1일 때
//        		if (arr[i] == '0') {
//        			break;
//	        	} else {
//	        		dp[i] = 1;
//	        	}
//        	} else {	//1 이후로
//        		if (arr[i] == '0') {	//현재 0
//	        		if (arr[i-1] == '1' || arr[i-1] == '2') {
//	        			dp[i] = dp[i-2] % mod;
//	        		} else {	//30같은 경우
//	        			break;
//	        		}
//        		} else {	//현재 1같은거
//        			if (arr[i-1] == '0') {	//앞에가 0이면 -> 연속 불가능
//        				dp[i] = dp[i-1];
//        			} 
////        			else if (i+1 <= len && arr[i+1] == '0') {
////        				temp += arr[i]-'0';
////		        		temp += arr[i+1]-'0';
////		        		if (Integer.parseInt(temp) >= 1 && Integer.parseInt(temp) <= 26) {
////		        			dp[i] = dp[i-1] % mod;
////		        		} else
////		        			break;
////        			}
//        			else {	//앞뒤 다 12같이 숫자
//        				temp += arr[i-1]-'0';
//		        		temp += arr[i]-'0';
//		        		if (Integer.parseInt(temp) >= 1 && Integer.parseInt(temp) <= 26) {
//		        			if (i == 2)
//		        				dp[i] = (dp[i-1]+1) % mod;
//		        			else
//		        				dp[i] = (dp[i-1]+dp[i-2]) % mod;
//		        		} else {	//숫자인데 26 넘으면
//		        			dp[i] = dp[i-1];
//		        		}
//        			}
//	        		
//        		}
//        		dp[i] = dp[i] % mod;
//        	}
//        }
//        System.out.print(dp[len]);
    }
}