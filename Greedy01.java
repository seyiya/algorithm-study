import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Greedy01{
	// 거스름돈 N에 대한 최소한의 동전 개수와 각 동전의 개수 구하기
	// 동전은 500, 100, 50, 10 원짜리가 있음
	
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
        	
        	// 거스름 돈 N 입력받기
        	int n = Integer.parseInt(br.readLine());
        	
        	// 거슬러 줄 동전의 최소 개수
        	int cnt = 0;
        	// 각 거스름돈의 개수
        	int coins[] = new int[4]; 
        	
        	// 동전의 종류
        	int coinType[] = {500, 100, 50, 10};
        	
        	// 처리
        	for(int i=0;i<4;i++) {
        		cnt += n / coinType[i]; 
        		coins[i] = n / coinType[i]; 
        		n %= coinType[i];
        	}
        	
        	// 동전의 최소 개수 출력
        	bw.write(cnt+"\n");
        	// 각 동전의 개수 출력
        	for(int su:coins) {
        		bw.write(su + " ");
        	}
        	bw.flush();
        	
        	bw.close();
        	br.close();
        	
        } catch(Exception e) {
        }
    }
    
}