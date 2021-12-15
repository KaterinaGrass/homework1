package classstring;


public class Task1 {
    private static final int LIGHT_OF_STRING = 100;
    private static final int MIN_BOUND = 0;
    private static final int MAX_BOUND = 1000;
//Generated a string using String and StringBilder, measured the performance
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String randomStr = " ";
        for (int i = 0; i < LIGHT_OF_STRING; i++) {
            randomStr  += String.valueOf(MIN_BOUND + (int) (Math.random()*MAX_BOUND + 1)) + " ";
        }

        System.out.println(randomStr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

       long start1 =  System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < LIGHT_OF_STRING; i++) {
               stringBuilder.append(randomStr);
        }
        System.out.println(randomStr.toString());
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        }

    }

