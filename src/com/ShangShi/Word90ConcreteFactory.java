package com.ShangShi;

public class Word90ConcreteFactory extends WordGenerationAbstractFactory {
    private static int numOfInstance =0;
    @Override
    ButtonAbstractProduct ButtonAbstractProduct() {
        return new ButtonWord90();
    }

    @Override
    PanelAbstractProduct PanelAbstractProduct() {
        return new PanelWord90();
    }

    @Override
    TextboxAbstractProduct TextboxAbstractProduct() {
        return new TextboxWord90();
    }

    public static Word90ConcreteFactory getFactory(){
        if(numOfInstance<2){
            numOfInstance++;
            return new Word90ConcreteFactory();
        }else{
            return null;
        }
    }
}
