public class project_13 {
    public static void main(String[] args) {
        //ARRaYs
        int[] student = {1, 34, 5, 6, 5, 34};
        System.out.println(student.length);
// displaying array native way
        System.out.println(student[2]);
        //displaying array with loops
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
            ;
        }
        //displaying array in reverse with loops
        for (int i = student.length - 1; i >= 0; i--) {
            System.out.println(student[i]);
        }
// displaying array with for each loop
        for (int elements : student) {
            System.out.println(elements);


        }
// two-dimensional array
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;
        //display of 2d array
        int g;
        int f;
        for (g = 0; g < flats.length; g++) {
            for (f = 0; f < flats[g].length; f++) {
                System.out.println(flats[g][f]);


            }

        }
    }}