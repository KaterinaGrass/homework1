package classstring;

public class Task2 {
    public static void main(String[] args) {

        String numbers =" 24 3 929 875 450 124 588 159 826 955 53 636 871 922 554 422 234 448 509 271 50 954 881 874 992" +
                " 263 178 837 303 373 236 788 215 362 128 661 814 952 960 447 913 100 86 347 726 821 254 566 183 340 530" +
                " 722 527 585 393 156 424 974 285 294 232 437 7 526 158 603 811 35 65 154 715 364 318 380 567 551 627 " +
                "106 646 78 95 276 132 965 754 646 626 858 694 255 975 68 567 521 84 127 588 140 54 567";

        String regex = "\\b\\d{2}\\b"; //Regex finds two-digit numbers and excludes numbers longer
        System.out.println(numbers.replaceAll(regex, "-1"));
    }
}
