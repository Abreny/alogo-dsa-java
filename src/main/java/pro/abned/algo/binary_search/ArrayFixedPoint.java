package pro.abned.algo.binary_search;

/**
 * Daily Coding Problem: Problem #1460 [Easy]
 *
 * Good morning! Here's your coding interview problem for today.
 * This problem was asked by Apple.
 * A fixed point in an array is an element whose value is equal to its index. Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return False.
 * For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you should return False.
 *
 * @author abned
 */
public class ArrayFixedPoint {
    public static int get(int[] input) {
        int r = input.length - 1;
        int l = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (input[mid] == mid) {
                return mid;
            }
            if (input[mid] < mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
