package JavaP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int x = 0;

        for(int i = 1; i < N; i ++){
            if(N > i+54){
                continue;
            }
            if(N == Seperate(N, i, i)){
                x = i;
                break;
            }
        }
        System.out.println(x);
    }
    

    public static int Seperate(int N, int x, int tol){
        if(N < tol){
            return tol;
        }
        
        if(10>x){
            tol += x;
            return tol;
        }else{
            tol += x%10;
            return Seperate(N, x/10, tol);
        }
    }
    
}
