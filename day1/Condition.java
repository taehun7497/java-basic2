package day1;

public class Condition {
    public static void main(String[] args) {
        int a = 100;
        if(a > 50){
            System.out.println("hi");
        }
        //예제
        //소지금에 따른 야식 메뉴
        //20000만원 이상 : 치킨
        //20000만원 미만 : 떡볶이

        int money = 30000;
        if (money >= 20000){
            System.out.println("치킨");
        }
        if(money < 20000){
            System.out.println("떡볶이");
        }
        //1. 맑음, 2. 흐림, 3. 비, 4. 눈
        //맑음 : 날씨가 맑습니다. 나들이 가세요.
        //흐림 : 날씨가 흐립니다. 집에 계세요.
        //비 : 날씨가 비옵니다. 우산을 챙기세요.
        //눈 : 날씨가 눈옵니다. 눈사람을 만드세요.

        int wheather = 1;

        //택일구조
        if(wheather == 1){
            System.out.println("맑음 : 날씨가 맑습니다. 나들이 가세요.");
        }
        else if(wheather == 2){
            System.out.println("흐림 : 날씨가 흐립니다. 집에 계세요.");
        }
        else if(wheather == 3){
            System.out.println("비 : 날씨가 비옵니다. 우산을 챙기세요.");
        }
        //System.out.println("눈 : 날씨가 눈옵니다. 눈사람을 만드세요.");
        else if(wheather == 4){
            System.out.println("눈 : 날씨가 눈옵니다. 눈사람을 만드세요.");
        }
    }
}
