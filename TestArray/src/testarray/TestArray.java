package testarray;

public class TestArray {

    public static void main(String[] args) {
        String room[][][] = new String[2][2][2];
        room[0][0][0] = "abdul1";
        room[0][0][1] = "Abdul2";
        room[0][1][0] = "abdul3";
        room[0][1][1] = "abdul4";
        room[1][0][0] = "abdul5";
        room[1][0][1] = "Abdul6";
        room[1][1][0] = "abdul7";
        room[1][1][1] = "abdul8";
        System.out.println(room[1][1][1]);

        int i[][][] = {{{1, 2, 3}}, {{4, 5, 6}}, {{7, 8, 9}}};
        System.out.println(i[2][0][0]);

    }

}
