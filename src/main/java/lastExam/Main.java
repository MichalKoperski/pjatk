package lastExam;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] positiveElemsArr = {{-1, 1}, {-2, 3}};
        System.out.println(positiveElems(positiveElemsArr));

        int[] swpElemsArr = {1, 2, 3, 4, 5, 6, 7, 8};
        swpElems(swpElemsArr);

        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        System.out.println(lastTwoNodesCount(node1));
    }
    public static int positiveElems(int[][] arr) {
        int positiveElemsCount = 0;

        // During the exam I accidentally called a method `length()` instead of using the `length` property on the array. :(
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (0 > arr[i][j]) {
                    positiveElemsCount++;
                }
            }
        }
        return positiveElemsCount;
    }
    // I cannot remember whether it returned `int[]` or `void`. :/
    public static void swpElems(int[] arr) {
        int breakpoint = arr.length / 2;
        int[] arrClone = arr.clone();

        for (int i = 0; i < breakpoint; i++) {
            arr[i] = arrClone[breakpoint - 1 - i];
        }
        // Two lines below are purely for testing purposes, not part of the original solution.
        System.out.println(Arrays.toString(arrClone));
        System.out.println(Arrays.toString(arr));
    }
    public static int lastTwoNodesCount(Node head) {
        int sumData = 0;
        Node temp = head;

        while (null != temp) {
            // Inside of the while loop I forgot to put `temp` in front of `next`/`data` which would make the task invalid
            if (null != temp.next && null == temp.next.next) {
                sumData = temp.data + temp.next.data;
                break;
            } else {
                temp = head.next;
                continue; // Apparently this is completely unnecessary
            }
        }
        return sumData;
    }
}