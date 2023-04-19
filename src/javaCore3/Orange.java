package javaCore3;

public class Orange extends Fruit {   // Апельсины
    public Orange(int count){
        super(count);
        this.weightOfFruits = 1.5;
    }

    @Override
    public String toString(){
        return "Коробка с апельсинами {" + count + " штук, весом "+getWeight()+ "f}";
    }
}
