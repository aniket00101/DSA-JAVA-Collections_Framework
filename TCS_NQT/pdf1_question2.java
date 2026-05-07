class pdf1_question2 {
    public static void main(String args[]) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currsum = 0, maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            maxsum = Math.max(currsum, maxsum);
            if(currsum < 0)   currsum = 0;
        }
        System.out.println("Maximum sum = " + maxsum);
    }
}