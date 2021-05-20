package Structural.Decorator.Problem;

public class EncryptedAndCompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        var compressedEncryptedData = compress(encrypted);
        super.write(compressedEncryptedData);
    }

    private String encrypt(String data) {
        return String.valueOf(data.hashCode());
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
