package study;

public class DuplicateZeros {
    public int[] duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0) {
                for(int j = arr.length-1; j > i+1; j--){
                    int x = j;
                    arr[x] = arr[x-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();

        int[] i = {1,0,2,3,0,4,5,0};

        int result[] = duplicateZeros.duplicateZeros(i);
        System.out.println(result);
    }


}
