package testMethod;

public class LearningArrays {

    public int [] invertArray (int [] array){
        for (int i = 0; i <= array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }


    public static void invertRec (int [] data, int k){
        if(k<data.length/2){
            int tmp = data[k];
            data[data.length-1-k]= tmp;
            invertRec(data,k+1);
        }
    }
}
