public class BinaryRecursiveSearch implements Practice2Search {
    @Override
    public String searchName() {
        return "binary-recursive";
    }

    @Override
    public int search(int[] arr, int target) {
        {
            return binsearch(arr, target, 0, arr.length-1);
        }

    }

    private int binsearch(int[] arrayz, int target, int low, int upper) {
        if (low > upper) {
            return -1;
        }
        int mid = (low + upper) / 2;

        if (arrayz[mid] == target) {
            return mid;
        } else if (target < arrayz[mid]) {
            return binsearch(arrayz, target, low, mid - 1);
        } else {
            return binsearch(arrayz, target, mid + 1, upper);
        }
    }
}
