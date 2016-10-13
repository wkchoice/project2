package singleton;

public class SingletonEx2 {
    public static void main(String[] args) {
        SingletonClass sc1 = SingletonClass.getInstance();
        sc1.setNum(100);
        SingletonClass sc2 = SingletonClass.getInstance();
        System.out.println("singleton Number :"+sc2.getNum());
    }
}

// 방법 1. 
//public class SingletonClass {
//    // 프로그램 수행시 SingletonClass객체를 미리 생성
//    // 단점 : 사용하기 전에 미리 생성하므로 메모리를 잡아 먹음
//    private static SingletonClass instance = new SingletonClass();
//    private SingletonClass() {
//    }
//    public static SingletonClass getInstance() {
//        return instance;
//    }
//}
 

//방법 2. 
class SingletonClass {
    // 프로그램 수행시 SingletonClass객체를 미리 생성
    // 장점 : 사용하는 시점에 객체를 생성하므로 메모리 관리에 용이
    private static SingletonClass instance = null;
    
    public  int i;
 
    private SingletonClass() { }
        
	public static SingletonClass getInstance() {
        if(instance == null)
            instance = new SingletonClass();
        return instance;
    }
	
	public void setNum(int i) {
		// TODO Auto-generated method stub
//    	this.i = i;
	}
	
	public int getNum() {
		return i;
	}
}

