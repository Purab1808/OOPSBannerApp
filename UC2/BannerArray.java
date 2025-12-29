package OOPSBanner.UC2;

public class BannerArray {
    public static void main(String[] args) {

        String[] banner = {
                "   ***       ***     ******     ****** ",
                " **   **   **   **  **     **   **      ",
                "**     ** **     ** **     **   **      ",
                "**     ** **     ** **     **    *****  ",
                "**     ** **     **  ******           **",
                "**     ** **     ** **               ** ",
                "   ***       ***    **          ******  "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
