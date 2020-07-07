package com.ShangShi;

public class Word00ConcreteFactory extends WordGenerationAbstractFactory {
    private static int numOfInstance = 0;
    @Override
    ButtonAbstractProduct ButtonAbstractProduct() {
        return new ButtonWord00();
    }

    @Override
    PanelAbstractProduct PanelAbstractProduct() {

        return new PanelWord00();
    }

    @Override
    TextboxAbstractProduct TextboxAbstractProduct() {

        return new TextboxWord00();
    }

    public static Word00ConcreteFactory getFactory(){
        if(numOfInstance<2){
            numOfInstance++;
            return new Word00ConcreteFactory();
        }else{
            return null;
        }
    }
}
