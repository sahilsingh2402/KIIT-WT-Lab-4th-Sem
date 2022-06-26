class BinarySearch {
    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 1,2,3,4,5,6,7,8,9 };
        //int n = arr.length;
        int x = 4;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not found!!!");
        else
            System.out.println("Element found at " + "index " + result);
    }
}

