package Behavioral.ChainOfResponsibility.Challenge;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excelReader = new ExcelReader();
        var numbersReader = new NumberReader();
        var quickBooksReader = new QuickReader();

        excelReader.setNext(null);
        numbersReader.setNext(excelReader);
        quickBooksReader.setNext(numbersReader);

        return quickBooksReader;
    }
}