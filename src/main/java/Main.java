import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Main {
    public static void main(String... args) throws ParseException {
        Options options = new Options();

        options.addOption("h", false, "print the usage message");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("h")) {
            System.out.println("This is the help message.");
        } else {
            System.out.println("Do some stuff...");
        }
    }
}
