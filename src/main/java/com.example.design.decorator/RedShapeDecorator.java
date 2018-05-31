package com.example.design.decorator;

/**
 * @Author: 胡成
 * @Version: 0.0.1V
 * @Date: 2018/5/31
 * @Description: 装饰器模式-实现类
 **/
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
