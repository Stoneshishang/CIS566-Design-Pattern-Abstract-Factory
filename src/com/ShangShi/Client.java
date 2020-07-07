package com.ShangShi;

public class Client {
    private ButtonAbstractProduct ButtonAbstractProduct;
    private PanelAbstractProduct PanelAbstractProduct;
    private TextboxAbstractProduct TextboxAbstractProduct;
    private WordGenerationAbstractFactory factory;

    //Constructor
    public Client(WordGenerationAbstractFactory factory){
        this.factory = factory;
        if(factory!=null){
            ButtonAbstractProduct = factory.ButtonAbstractProduct();
            PanelAbstractProduct = factory.PanelAbstractProduct();
            TextboxAbstractProduct = factory.TextboxAbstractProduct();
        }
    }

    public void Run(){
        if (factory!=null){
            ButtonAbstractProduct.DisplayMessage(ButtonAbstractProduct);
            PanelAbstractProduct.DisplayMessage(PanelAbstractProduct);
            TextboxAbstractProduct.DisplayMessage(TextboxAbstractProduct);
        }else {
            System.out.println("*******ERROR! the test has exceed 2 times!*******");
        }

    }
}
