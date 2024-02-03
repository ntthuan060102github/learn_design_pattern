package StructuralPatterns.Bridge;

public class ContactPage implements IWebPage{
    protected ITheme theme;
    
    public ContactPage(ITheme theme)
    {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return String.format("ContactPage in %s", this.theme.getColor());
    }
}
