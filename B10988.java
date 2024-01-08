package JavaP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        line = br.readLine();

        char arr[] = new char[line.length()];

        for(int i = 0; i < line.length(); i++ ){
            arr[i] = line.charAt(i);
        }

        if(line.length() % 2 != 0){
            for(int i = 0; i < line.length()/2-1; i++){
                if(arr[i] != arr[line.length()-1-i]){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(1);
        }
        else{
            for(int i = 0; i < line.length()/2; i++){
                if(arr[i] != arr[line.length()-1-i]){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(1);
        }
    
    }
    
}
