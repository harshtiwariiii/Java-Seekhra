# 📘 Sorting Algorithms in Java – In Depth (Interview Ready)

## 🎯 Learning Objectives
- Understand what sorting is and why it is needed
- Learn popular sorting algorithms
- Analyze time & space complexity
- Implement sorting algorithms in Java
- Know which sorting to use and when

---

## 🧠 What is Sorting?

**Sorting** means arranging data in a specific order:
- Ascending (small → large)
- Descending (large → small)

Example:

Before: 5 2 8 1
After: 1 2 5 8

---

## ❓ Why Sorting is Important?

- Makes searching faster
- Simplifies data processing
- Used in databases, systems, ranking, analytics
- Extremely common in interviews

---

## 🔢 Types of Sorting Algorithms

| Category | Algorithms |
|--------|-----------|
| Simple | Bubble, Selection, Insertion |
| Efficient | Merge, Quick |
| Special | Counting, Radix |

---

# 🔁 Bubble Sort

## 🧠 Idea
- Repeatedly swap adjacent elements
- Largest element moves to end in each pass

---

## 🛠 Implementation

```java
class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}

⏱ Complexity

Best: O(n)

Average: O(n²)

Worst: O(n²)

Space: O(1)

🔁 Selection Sort
🧠 Idea
Find minimum element

Place it at correct positionclass SelectionSort {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}

⏱ Complexity

Best: O(n)

Average: O(n²)

Worst: O(n²)

Space: O(1)

🔁 Selection Sort
🧠 Idea
Find minimum element

Place it at correct position

🛠 Implementation
⏱ Complexity

Best/Average/Worst: O(n²)

Space: O(1)

🔁 Insertion Sort
🧠 Idea
Insert element into its correct position

Good for nearly sorted arraysclass InsertionSort {
    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}
⏱ Complexity

Best: O(n)

Average/Worst: O(n²)

Space: O(1)

⚡ Quick Sort (IMPORTANT)
🧠 Idea
Divide & Conquer

Pick pivot and partition arrayclass QuickSort {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}

⏱ Complexity

Best/Average: O(n log n)

Worst: O(n²)

Space: O(log n)

🔥 Merge Sort (IMPORTANT)
🧠 Idea
Divide array into halves

Merge sorted halvesclass MergeSort {

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}

⏱ Complexity

Best/Average/Worst: O(n log n)

Space: O(n)

📊 Comparison Table
Algorithm	Best	Avg	Worst	Space	Stable
Bubble	O(n)	O(n²)	O(n²)	O(1)	Yes
Selection	O(n²)	O(n²)	O(n²)	O(1)	No
Insertion	O(n)	O(n²)	O(n²)	O(1)	Yes
Quick	O(n log n)	O(n log n)	O(n²)	O(log n)	No
Merge	O(n log n)	O(n log n)	O(n log n)	O(n)	Yes

📝 Practice Problems
Task 1

Sort an array of 0s, 1s, and 2s.

Task 2

Find the kth smallest element.

Task 3

Why is Quick Sort faster in practice than Merge Sort?