import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("请输入两个及以上的整数用英文符,隔开");
        Scanner scanner = new Scanner(System.in);
        String a =scanner.nextLine();
        String[] b = a.split(",");
        int[] c=new int[b.length];
        for (int i=0;i<b.length;i++)
        {
            c[i]= Integer.parseInt(b[i]);
        }
        int max=0,s=0,h=0;
        for (int i=0;i<c.length;i++)
        {
            for(int m=c.length-1;m>i;m--)
            {
                if (c[i]<c[m]){h=c[i];}
                else{h=c[m];}
                s=h*(m-i);
                if (s>max){max=s;}
            }
        }
        System.out.println(max);
    }
}
