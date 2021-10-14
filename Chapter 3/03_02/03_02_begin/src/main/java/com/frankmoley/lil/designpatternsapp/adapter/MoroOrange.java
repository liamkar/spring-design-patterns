package com.frankmoley.lil.designpatternsapp.adapter;

public class MoroOrange implements Orange{

    @Override
    public String getVariety() {
        // TODO Auto-generated method stub
        return "Moro Blood Orange";
    }

    @Override
    public void eat() {
        System.out.println("Moro gets enjoyed");
        
    }

    @Override
    public void peel() {
        // TODO Auto-generated method stub
        System.out.println("Moro gets peeled");
        
    }

    @Override
    public void juice() {
        System.out.println("More gets juiced");
        
    }    
}
