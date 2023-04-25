package lesson21.objectPool;

public class TaxiNotFoundException extends RuntimeException{
    public TaxiNotFoundException(String mes) {
        System.out.println(mes);
    }
}
