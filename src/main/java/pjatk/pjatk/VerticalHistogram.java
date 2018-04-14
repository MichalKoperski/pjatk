package pjatk.pjatk;

class VerticalHistogram {
    public static void main(String[] args) {
        int max, var;
        max = var = 0;
        int arr[] = {1, 6, 8, 4, 2, 5, 3};

        max = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > max)
                max = arr[i];
        var = max;
        for(int i=0; i < var; i++) {
            for(int j = 0; j < arr.length ; j++)
                if(arr[j] < max)
                    System.out.print(" ");
                else
                    System.out.print("*");
            max--;
            System.out.println();
        }
    }
}