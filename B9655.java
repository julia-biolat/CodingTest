package JavaP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class B9655{
    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int t = N%3;

        int check = N/3;


        if(check%2 ==0){
            if(t == 0 || t==2){
                System.out.println("CY");
            }
            else{
                System.out.println("SK");
            }
            
        }
        else{
            if(t == 0 || t==2){
                System.out.println("SK");
            }
            else{
                System.out.println("CY");
            }

        }



    }
}