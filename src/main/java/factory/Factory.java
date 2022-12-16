package factory;

public abstract class Factory {
    static FP1Abstract1 fpAbstract1 = new FP1Abstract1();
    static FP1Abstract2 fpAbstract2 = new FP1Abstract2();

    public static FP1 getProvider(String client) {
        if (client.equals("Клиент_1")) {
            return fpAbstract1;
        }
        else {
            return fpAbstract2;
        }
    }
}
