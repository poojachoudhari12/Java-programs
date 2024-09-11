import java.util.Arrays;

class QuickSort implements Runnable {
    static int[] arr;
    int l, r;

    QuickSort() {
        arr = new int[10];
        l = 0;
        r = 9;
    }

    QuickSort(int l, int r) {
        this.l = l;
        this.r = r;
    }

    void input() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(System.console().readLine("No: "));
        }
    }

    void quickSort() {
        if (l < r) {
            int k = partition();
            QuickSort left = new QuickSort(l, k - 1);
            QuickSort right = new QuickSort(k + 1, r);
            Thread th1 = new Thread(left);
            Thread th2 = new Thread(right);
            th1.start();
            th2.start();
            try {
                th1.join();
                th2.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    int partition() {
        pivot();
        int i = l, j = r;
        int k = arr[l];
        while (i < j) {
            do {
                i++;
            } while (arr[i] < k);
            do {
                j--;
            } while (arr[j] > k);
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[l];
        arr[l] = arr[j];
        arr[j] = tmp;
        return j;
    }

    void pivot() {
        if (arr[l] > arr[r]) {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
        }
    }

    void display() {
        String s = "Data\n";
        for (int i = 0; i < 10; i++) {
            s += arr[i] + " ";
        }
        System.out.println(s);
    }

    @Override
    public void run() {
        quickSort();
    }

    public static void main(String[] args) {
        QuickSort a = new QuickSort();
        a.input();
        a.display();
        Thread th = new Thread(a);
        th.start();
        try {
            th.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        a.display();
    }
}