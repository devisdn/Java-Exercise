import java.util.*;

public class RpsGameV2 {
    public static void main(String[] args){

        getHeader();
    }
    
    //fungsi untuk menampilkan header program
    public static void getHeader(){
        System.out.println(LINE + HEADER_PROGRAM + LINE);
    }

    //function untuk variabel konstanta
    public static final Scanner INPUT = new Scanner(System.in);
    public static final String
        HEADER_PROGRAM = "\n\t\s\s\sRPS Battle Game",
        ROUND_DESCRIPTION = "\t\tRound ",
        LINE = "\n======================================";
}
