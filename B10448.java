package JavaP;

import java.io.*;
public class B10448 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        outLoop:
        for(int i = 0; i < N; i++){
            for(int a = 1; a < arr[i]; a++){
                if(a*3 > arr[i]){
                    System.out.println(0);
                    continue outLoop;
                }
                for(int b = 1; b < arr[i]; b++){
                
                    for(int c = 1; c <arr[i]; c++){
    
                        if(arr[i]*2 == a*(a+1)+b*(b+1)+c*(c+1) ){
                            System.out.println(1);
                            continue outLoop;
                        }
                    }
                }
            }
        }

    }
    
}
