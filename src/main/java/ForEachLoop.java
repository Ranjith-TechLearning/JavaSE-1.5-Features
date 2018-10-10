public class ForEachLoop {

    public static void runForEachLoopSamples(){
        int[] marks = { 125, 132, 95, 116, 110 };
        arrayIteration(marks);
        arrayProcessing();
    }

    private static void arrayIteration(int[] intarray){
        int maxScore=intarray[0];
        for(int mark : intarray) {

/*//            if (mark > maxScore)
//                maxScore = mark;
            */
            mark=mark*2;
            System.out.println(mark);

        }

        System.out.println("Max mark is : "+ maxScore);
    }

    private static void arrayProcessing(){
        int[][] array = new int[2][2];
        for (int arr[] : array)
            for (int integervalue : arr)
                System.out.println("integervalue : "+ integervalue);
    }


}
