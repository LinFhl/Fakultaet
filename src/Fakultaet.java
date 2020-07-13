public class Fakultaet {

    public static void main(String[] args){

        System.out.println(faku(4));
    }

    public static int faku(int n){

        int ergebnis = 1;
        for(int i=1; i<=n; i++){

            ergebnis = ergebnis*i;
        }
        return ergebnis;
    }
}

