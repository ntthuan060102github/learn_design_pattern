package BehavioralPatterns.template_method;

public class AndroidBuilder extends TemplateBuilder {
    @Override
    public void test()
    {
        System.out.println("Running android tests");
    }

    @Override
    public void lint()
    {
        System.out.println("Linting the android code");
    }

    @Override
    public void assemble()
    {
        System.out.println("Assembling the android build");
    }

    @Override
    public void deploy()
    {
        System.out.println("Deploying android build to server");
    }
}
