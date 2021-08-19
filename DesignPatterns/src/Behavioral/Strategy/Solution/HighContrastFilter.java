package Behavioral.Strategy.Solution;

import java.text.MessageFormat;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println(MessageFormat.format("Applying HighContrast filter {0}", fileName));
    }
}
