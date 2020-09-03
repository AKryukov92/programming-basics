package root.tasks;

import root.TaskBookFinder;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public class BookCitation extends LabFragment {
    private String id;

    public BookCitation(String srcDirectory, String id) {
        super(srcDirectory);
        this.id = id;
    }

    public BookCitation withLangAbbreviation(String langAbbreviation) {
        this.langAbbreviation = langAbbreviation;
        return this;
    }

    @Override
    public void appendContentTo(PrintWriter writer) {
        writer.write(getContent());
    }

    @Override
    public Optional<String> makeNavItem(String navTitle) {
        return Optional.empty();
    }

    @Override
    public void updateReferenceLinks(TaskBookFinder finder) {

    }

    @Override
    protected String getSrcFilename() {
        String langSpecificPath = String.format("%s/%s%s.html", srcDirectory, id, langAbbreviation);
        if (Files.exists(Paths.get(langSpecificPath))) {
            System.out.println("Fragment " + id + " has language-specific file");
            return langSpecificPath;
        } else {
            return String.format("%s/%s.html", srcDirectory, id);
        }
    }
}
