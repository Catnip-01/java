import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        
        int i = 0;
        while(i < num){
            int j = 0;
            while(j <= i){
                if(j == 0) System.out.print("0");
                else {
                    int ans = j*i;
                    System.out.print(ans);
                }
                j++;
            }
            i++;
            System.out.print("\n");
        }
    }
}