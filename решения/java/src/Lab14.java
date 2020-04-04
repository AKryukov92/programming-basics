public class Lab14 {
    public static int[] task7891(int[] arr) {
        if (arr.length % 2 != 0) {
            throw new IllegalArgumentException("В массиве должно быть четное количество элементов");
        }
        int[] result = new int[arr.length + arr.length / 2];
        int targetIndex = 0;
        for (int srcIndex = 0; srcIndex < arr.length; srcIndex += 2) {
            result[targetIndex] = arr[srcIndex];
            targetIndex++;
            result[targetIndex] = arr[srcIndex + 1];
            targetIndex++;
            result[targetIndex] = arr[srcIndex] + arr[srcIndex + 1];
            targetIndex++;
        }
        return result;
    }
}
