import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("请输入一串非空字符串：");
        String line = sc.nextLine();
        if(line==null) System.out.println("您输入字符串为空");

        char[] c= new char[50];
        for (int i=0;i<line.length();i++){
            c[i]=line.charAt(i);
        }
        int number=0;
        for(int i=0;i<c.length;i++){
            int count=0;
            for (int j = 1; j <c.length; j++) {
                if(c[i]==c[j]) count++;
            }
            number++;
            if (count==0) {System.out.println(c[i]);break;}

            }


    }

}
