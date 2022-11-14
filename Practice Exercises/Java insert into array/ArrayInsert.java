public class ArrayInsert {

    public static void main(String[] args) {
        int[] a = new int[]{2,3,4,6,9,10};
        int t =-55;
        insertArray(a, t);    
    }

    static void insertArray(int[] a, int t){
        int l = 0;
        int r = a.length - 1;

       while (l <= r){
            int m = l + (r - l)/2;
            if (a[m] == t){
                System.out.println("Target found at index: " + m);
                break;
            }

            if (a[m] < t){
                if (a.length - 1 < m + 1){
                    System.out.println("Target insert at index: " + (m+1));
                    break;
                }
                else if (a[m + 1] > t){
                    System.out.println("Target insert at index: " + (m+1));
                    break;
                }
            }

            if (m == 0 && a[m] > t){
                System.out.println("Target insert at index: " + 0);
                break;
            }

            if (a[m] < t){
                l = m + 1;
            }
            else{
                r = m - 1;
            }

        }



    }

}