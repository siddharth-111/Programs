package BinarySearch;

public class binarySearch
{
	int binarysearch(int arr[], int n, int k) {
		return binarysearch(arr, 0, n - 1, k);
	}

	int binarysearch(int[] arr, int low, int high, int key)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if (arr[mid] == key)
			return mid;

		return key <= arr[mid] ? binarysearch(arr, low, mid - 1, key) : binarysearch(arr, mid + 1
			, high, key);
	}
}
