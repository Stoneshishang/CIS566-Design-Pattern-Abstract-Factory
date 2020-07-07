package com.ShangShi;

public class Word20ConcreteFactory extends WordGenerationAbstractFactory {
    private static int numOfInstance =0;
    @Override
    ButtonAbstractProduct ButtonAbstractProduct() {
        return new ButtonWord20();
    }

    @Override
    PanelAbstractProduct PanelAbstractProduct() {
        return new PanelWord20();
    }

    @Override
    TextboxAbstractProduct TextboxAbstractProduct() {
        return new TextboxWord20();
    }

    public static Word20ConcreteFactory getFactory(){
        if(numOfInstance<2){
            numOfInstance++;
            return new Word20ConcreteFactory();
        }else{
            return null;
        }
    }
}
