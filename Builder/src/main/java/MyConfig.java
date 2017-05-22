import pl.edu.agh.propertree.generator.ConfigurationManager;

public class MyConfig extends ConfigurationManager {

    public String getConfigPath() {
        return "configuration";
    }

    public String getOutputPath() {
        return "reference_table";
    }

    public static void main(String[] args) {
        ConfigurationManager configurationManager = new MyConfig();
        configurationManager.init();
    }
}
