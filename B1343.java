package JavaP;

import java.io.*;
import java.util.StringTokenizer;

public class B1343 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".", true);
        
        int i = 0;
        

        
        String result = "";

        while(st.hasMoreTokens()){
            String a = st.nextToken();

            if(a.equals(".")){
                result = result+".";
                continue;
            }
            int l = a.length();

            if(l % 2 !=0){
                System.out.println("-1");
                return;
            }

            while(l >= 4){
                result = result + "AAAA";
                l = l-4;
            }
            if(l == 2){
                result = result+ "BB";
            }
            
            
        }
        System.out.println(result);

    }
    

    
}
