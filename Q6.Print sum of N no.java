import java.util.Scanner;
class sum{
static void func(int i, int sum){
if(i<1)
{
System.out.print(sum);
return;
}
func(i-1, sum+i);
}
public static void main(String args[]){
Scanner sc  = new Scanner(System.in);
int n = sc.nextInt();
func(n,0);
}
}
