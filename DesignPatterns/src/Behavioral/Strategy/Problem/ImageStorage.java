package Behavioral.Strategy.Problem;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if (compressor == Compressor.JPEG)
            System.out.println("Compressing using JPEG");
        else if (compressor == Compressor.PNG)
            System.out.println("Compressing using PNG");

        if (filter == Filter.BLACK_AND_WHITE)
            System.out.println("Applying B&W filter");
        else if (filter == Filter.HIGH_CONTRAST)
            System.out.println("Applying HighContrast filter");
    }

}
