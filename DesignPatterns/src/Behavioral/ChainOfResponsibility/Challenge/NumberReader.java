package Behavioral.ChainOfResponsibility.Challenge;

public class NumberReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet: ");
    }
}