
package roy.and.profile.picture;

import java.util.Scanner;

public class RoyAndProfilePicture {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int L=s.nextInt();
        short N=s.nextShort();
        int [][] imgs=new int[N][2];
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N-1; j++) {
               int D=s.nextInt();
               imgs[i][j]=D;
            }
        }
        for (int i = 0; i <N; i++) {
            
                if(imgs[i][0]<L|imgs[i][1]<L)
                    System.out.println("UPLOAD ANOTHER");
                else{
                if(imgs[i][0]==L&imgs[i][1]==L)
                    System.out.println("ACCEPTED");
                else
                    System.out.println("CROP IT");
                }
 
        }
    }
    
}
