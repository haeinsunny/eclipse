package co.sunny.abstractclass;

public abstract class AbstractClass {
    public abstract void run();
    public abstract void sound(); 
    
    
    public AbstractClass() {
    	
    }
    public final void eat() { //하위 class에서 Override하지 못한다.
    	System.out.println("먹는다"); //더 이상 이행위를 수정하지못함
    }
	
}
