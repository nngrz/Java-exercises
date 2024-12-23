class LargestValue{
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 4, 1, 9};

        // If there is an empty array
        if (arr.length == 0) {
            throw new IllegalArgumentException ("The array is empty.");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The largest value is " + max);
    }
}
