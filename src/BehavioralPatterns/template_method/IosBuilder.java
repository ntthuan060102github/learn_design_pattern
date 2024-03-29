package BehavioralPatterns.template_method;

public class IosBuilder extends TemplateBuilder {
    @Override
    public void test()
    {
        System.out.println("Running ios tests");
    }

    @Override
    public void lint()
    {
        System.out.println("Linting the ios code");
    }

    @Override
    public void assemble()
    {
        System.out.println("Assembling the ios build");
    }

    @Override
    public void deploy()
    {
        System.out.println("Deploying ios build to server");
    }
}
