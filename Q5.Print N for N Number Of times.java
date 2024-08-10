import java.util.Scanner;
class S {
static void func(int i, int n ){
if(i<1) return;

System.out.print(i+ " ");
func(i-1,n);
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
func(n,n);
}
}
 
