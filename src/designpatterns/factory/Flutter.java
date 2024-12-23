package designpatterns.factory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    public void setBackground(){
        System.out.println("Set background");
    }

    public void getVersion(){
        System.out.println("Get version");
    }

    public UIFactory getUIFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
