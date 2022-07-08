import java.util.Scanner;

class usef {
    static void entryarr(int[][] a, String v, Scanner in) {
        System.out.printf("%n");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(" %s[%d][%d] = ", v, i + 1, j + 1);
                a[i][j] = in.nextInt();
            }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("%n n = ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n<2 | n>10){
            System.out.printf("%n Ошибка: недопустимое значение n%n Правильно: 2 <= n <= %d%n%n", 10);
        }
        int[][] a = new int[n][n];
        int i,j;
            for (i=0; i<a.length; i++){
                if (a[i][i]<0) {
                    int asum=0, amax=a[i][0];
                    for (j=0; j<a[i].length; j++)
                    {
                        asum = asum + a[i][j];
                        if (amax<a[i][j])
                            amax=a[i][j];
                    }
                    System.out.printf("строка %d, сумма элементов %d, максимальный элемент %d\n",i+1,asum,amax);
                }
            }
        in.close();
    }
}
