package etc;

public class LA {
    public static void main(String[] args) {
        // 은총,축복,가호,명파,4렙
        legendMap(40,95,200,400,700);


    }

    public static void legendMap(int a,int b,int c, int d, int e){
        int result = 0;
        // 은총 12개
        result += 12*a;
        // 축복 8개
        result += 8*b;
        // 가호 4개
        result += 4*c;
        // 명파 8개
        result += 8*d;
        // 4렙보석 1.5
        result += 1.5*e;

        System.out.println(result + "골드");
    }
}
