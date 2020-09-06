package root.tasks;

public class CodedTask extends LabTask {
    private LayoutMaker maker;
    public CodedTask(LayoutMaker maker, String srcDirectory, boolean isExample) {
        super(maker.getId(), srcDirectory, isExample);
        this.maker = maker;
    }

    @Override
    protected String getContent() {
        return maker.getContent();
    }
}
