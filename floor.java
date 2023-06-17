public class floor {
    public static void main(String[] args) {
        int[] ar = { 2, 3, 5, 9, 14, 16, 23 };
        System.out.println(floor(ar, 1));
    }

    static int floor(int[] arr, int target) {
        int f = 0, l = arr.length - 1;
        if (target < arr[0]) {

        } else {

            while (f <= l) {
                int mid = f + (l - f) / 2;
                if (arr[mid] == target) {
                    return arr[mid];
                } else if (target < arr[mid]) {
                    l = mid - 1;
                } else {
                    f = mid + 1;
                }
            }
            return arr[l];

        }
        return -1;

    }
}
