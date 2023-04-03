package org.example;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;

public class MyOptions  {
    @Option(name = "-l", usage = "Make the output long")
    public
    boolean isLong;

    @Option(name = "-o", usage = "Transport the results to output file", metaVar = "output")
    public
    String outputFileName;

    @Argument(required = true, metaVar = "directory")
    public
    String directory;

    @Option(name = "-h", usage = "Make the output human-readable")
    public
    boolean humanReadable;

    @Option(name = "-r", usage = "Reverse the output")
    public
    boolean isReverse;

    public MyOptions(String[] args) throws IOException, CmdLineException {
        CmdLineParser parser = new CmdLineParser(this);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.print("invalid input: ");
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
