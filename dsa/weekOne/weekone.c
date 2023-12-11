#include <stdio.h>

void selectionSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

int binarySearchIterative(int arr[], int low, int high, int key) {
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return mid; 
        else if (arr[mid] < key) low = mid + 1; 
        else high = mid - 1; 
    }
    return -1; 
}

int binarySearchRecursive(int arr[], int low, int high, int key) {
    if (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return mid; 
        else if (arr[mid] < key) return binarySearchRecursive(arr, mid + 1, high, key); 
        else return binarySearchRecursive(arr, low, mid - 1, key); 
    }
    return -1;
}

int main() {
    int size;
    
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];

    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) scanf("%d", &arr[i]);
    
    selectionSort(arr, size);

    printf("Sorted array: ");
    for (int i = 0; i < size; i++) printf("%d ", arr[i]);
    
    printf("\n");

    int key;
    printf("Enter the element to search: ");
    scanf("%d", &key);

    int searchMethod;
    printf("Choose search method:\n");
    printf("1. Iterative\n");
    printf("2. Recursive\n");
    printf("Enter your choice (1 or 2): ");
    scanf("%d", &searchMethod);

    switch (searchMethod) {
        case 1:
            int iterResult = binarySearchIterative(arr, 0, size - 1, key);
            if (iterResult != -1) printf("Element %d found at index (iterative): %d\n", key, iterResult);
            else printf("Element %d not found (iterative)\n", key);
            break;
        case 2:
            int recurResult = binarySearchRecursive(arr, 0, size - 1, key);
            if (recurResult != -1) printf("Element %d found at index (recursive): %d\n", key, recurResult);
            else printf("Element %d not found (recursive)\n", key);
            break;
        default:
            printf("Invalid choice\n");
    }
    
    return 0;
}
