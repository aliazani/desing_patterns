package Behavioral.Strategy.Solution;

import java.text.MessageFormat;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println(MessageFormat.format("Applying B&W filter {0}", fileName));
    }
}
