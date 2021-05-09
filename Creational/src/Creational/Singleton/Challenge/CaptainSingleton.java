package Creational.Singleton.Challenge;

public class CaptainSingleton {
    private CaptainSingleton() {
    }

    private static class CaptainCreationHelper {
        private static final CaptainSingleton uniqueCaptain = new CaptainSingleton();
    }

    public static CaptainSingleton getCaptain() {
        return CaptainCreationHelper.uniqueCaptain;
    }
}
