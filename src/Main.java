import Classes.AutomatonITC;

public class Main {

    public static void main(String[] args) {
        String word = "1100110", result;

        AutomatonITC automataITC = new AutomatonITC();
        boolean isRecognized = automataITC.isStringRecognizable(word);

        if(isRecognized){
            result = "OK";
        }
        else{
            result = "Falhou";
        }

        System.out.println(word + ": " +  result);
    }
}
