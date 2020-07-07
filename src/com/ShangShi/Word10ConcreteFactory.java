package com.ShangShi;

public class Word10ConcreteFactory extends WordGenerationAbstractFactory{
    private static int numOfInstance =0;

    @Override
    ButtonAbstractProduct ButtonAbstractProduct() {
        return new ButtonWord10();
    }

    @Override
    PanelAbstractProduct PanelAbstractProduct() {
        return new PanelWord10();
    }

    @Override
    TextboxAbstractProduct TextboxAbstractProduct() {
        return new TextboxWord10();
    }

    public static Word10ConcreteFactory getFactory(){
        if(numOfInstance<2){
            numOfInstance++;
            return new Word10ConcreteFactory();
        }else{
            return null;
        }
    }
}
