class ceiling {
    public static void main(String[] args) {
        int[] ar = { 2, 3, 5, 9, 14, 16, 23 };
        System.out.println(ceiling(ar, 24));

    }
// ceiling is nothing but writing the element which is greater than or equal to the given target
    static int ceiling(int[] arr, int target) {
        int f = 0, l = arr.length - 1;
        if (target > arr[arr.length - 1]) {

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
            return arr[f];
        }
        return -1;
    }
}
