public class SingleTone {
    private static SingleTone singleTone;

    private SingleTone(){}

    private static SingleTone getInstance(){
        if(singleTone == null){
            singleTone = new SingleTone();
        }
        return singleTone;
    }
}
