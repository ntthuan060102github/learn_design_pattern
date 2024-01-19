package StructuralPatterns.Bridge;

public class HomePage implements IWebPage {
    protected ITheme theme;
    
    public HomePage(ITheme theme)
    {
        this.theme = theme;
    }

    @Override
    public String getContent()
    {
        return """
            HomePage in %s
        """.formatted(this.theme.getColor());
    }
}
