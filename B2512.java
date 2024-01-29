/*max + min /2 = mid값으로 설정.
 * mid보다 작으면 그대로 더하고 mid보다 크면 mid로 설정해서 더하기
 * 합이 budget보다 크면 현재 mid+max/2 = mid로 설정해서 반복
 */
package JavaP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2512 {
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[N];
        int tol = 0;        
        int max =0;
        int mid , min;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            tol += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int budget = Integer.parseInt(br.readLine());
        if(tol < budget){
            System.out.println(max);
            return;
        }   

        min = 0;
        while(min <= max){
            mid = (min+max)/2;
            tol = 0;
            for(int i=0; i<N; i++){
                if(arr[i]>mid){
                    tol += mid;
                }
                else{
                    tol += arr[i];
                }
            }
            if(tol > budget){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
            
        }    
        System.out.println(max);
    }

}
