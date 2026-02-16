public class UC3 {
    public static void main(String[] args) {

        String line1 = String.join("   ",
                " *** ",
                " *** ",
                "*****",
                "*****");

        String line2 = String.join("   ",
                "** **",
                "** **",
                "**  **",
                "**    ");

        String line3 = String.join("   ",
                "** **",
                "** **",
                "*****",
                " *** ");

        String line4 = String.join("   ",
                "** **",
                "** **",
                "**   ",
                "    **");
                
        String line5 = String.join("   ",
                " *** ",
                " *** ",
                "**   ",
                "*****");

        String banner = String.join("\n",
                line1,
                line2,
                line3,
                line4,
                line5
        );

        System.out.println(banner);
    }
}