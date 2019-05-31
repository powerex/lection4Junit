package ua.edu.npu;

public class SomeClass {

    int length;
    int depth = 2;

    public static boolean isNegative(int x){
        return x < 0;
    }


    public boolean isXNegative(){
        if(length == 0 ){
            throw new IllegalArgumentException();
        }
        return length < 0;
    }

    public int getLengthMultipleDepth(){
        return length * depth;
    }
}
