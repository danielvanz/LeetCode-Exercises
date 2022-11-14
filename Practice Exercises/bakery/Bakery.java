public class Bakery {

    static String input;
    static String[] parts;
    static int pivot;
    static String[] a;
    static String[] b;

    public static void main(String[] args) {
        //input = "F 1 367 F 2 38 F 3 602 F 4 624 B 1 183 B 2 19 B 3 184 B 3 301 B 4 19 B 4 312 B 5 64 B 6 312";
        //input = "F 1 995 F 2 884 F 3 749 F 4 866 B 1 497 B 2 442 B 3 319 B 3 374 B 4 239 B 4 433 B 5 375 B 6 177";
        //input = "F 1 123395 F 2 488034 F 3 78861 F 4 200882 F 5 102517 F 6 49658 F 7 201804 F 8 247860 F 9 356333 F 10 163982 F 11 351283 F 12 305592 F 13 443860 F 14 111094 F 15 216152 F 17 220897 F 16 184823 F 19 438974 F 18 464208 B 1 61697 B 2 9577 B 2 244017 B 3 30849 B 3 39430 B 4 244017 B 4 19716 B 4 100441 B 5 19715 B 5 51258 B 6 100441 B 6 25630 B 6 24829 B 7 25629 B 7 100902 B 8 24829 B 8 123930 B 9 100902 B 9 61965 B 9 178166 B 10 61965 B 10 89084 B 10 81991 B 11 89083 B 11 175641 B 12 81991 B 12 152796 B 13 175642 B 13 76398 B 13 221930 B 14 76398 B 14 110965 B 14 55547 B 15 110965 B 15 27774 B 15 108076 B 17 73709 B 17 46206 B 17 110448 B 16 27773 B 16 92411 B 19 110449 B 19 116052 B 19 219487 B 18 46206 B 18 232104 B 21 219487 B 20 116052";
        input = "F 1 114137 F 2 351326 F 3 368940 F 4 149918 F 5 392828 F 6 170391 F 7 322537 F 8 375036 F 9 326464 F 10 466616 F 11 435944 F 12 36944 F 13 328942 F 14 291904 F 15 309906 F 17 359944 F 16 173875 F 19 224204 F 18 258166 B 1 57068 B 2 175663 B 3 57069 B 3 87832 B 3 184470 B 4 87831 B 4 74959 B 5 184470 B 5 31463 B 5 196414 B 6 37479 B 6 85195 B 7 196414 B 7 161268 B 8 85196 B 8 80635 B 8 187518 B 9 80634 B 9 163232 B 10 187518 B 10 78201 B 10 233308 B 11 81616 B 11 217972 B 12 233308 B 12 108986 B 12 18472 B 13 108986 B 13 9236 B 13 164471 B 14 9236 B 14 82236 B 14 145952 B 15 82235 B 15 154953 B 17 154953 B 17 34084 B 17 179972 B 16 145952 B 16 86937 B 19 179972 B 19 64542 B 19 112102 B 18 43469 B 18 129083 B 21 56051 B 20 64541 B 20 6255";

        parts = input.split(" ");

        checkB();

        splitArrays();

        bakeryCheck();
    }

    private static void bakeryCheck() {
        for (int i = 2; i < a.length; i = i + 3) {
            if(Integer.parseInt(a[i]) > Integer.parseInt(b[i])){
                System.out.println(a[i - 1]);
            }
        }

    }

    private static void checkB() {
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("B")) {
                pivot = i;
                break;
            }
        }
    }

    private static void splitArrays() {
        a = new String[(parts.length+1)/2];
        b = new String[parts.length - a.length];

        for (int i = 0; i < parts.length; i++) {
            if (i < a.length){
                a[i] = parts[i];
            }
            else{
                b[i - a.length] = parts[i];
            }
        }
    }



}