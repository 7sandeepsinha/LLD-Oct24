package designpatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        return switch (supportedPlatform){
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
