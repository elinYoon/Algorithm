package study;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            System.out.println(nums1[0] +"," +nums1[1] +"," + nums1[2]  +"," +nums1[3]  +"," +nums1[4]  +"," +nums1[5]);

            if (nums1[i] >= nums2[j]) nums1[k--] = nums1[i--]; // 본인이 크면 뒤로 밀음
            else nums1[k--] = nums2[j--]; // 두번째 게 크면 채
        }
    }

    public static void main(String[] args) {
        MergeSortArray mergeSortArray = new MergeSortArray();

        int[] i = {1,2,3,0,0,0,0,0,0};
        int[] j = {2,5,6,7,8,9};

        mergeSortArray.merge(i,3,j,6);
    }
}
