package singleton;

public class SingletonEx2 {
    public static void main(String[] args) {
        SingletonClass sc1 = SingletonClass.getInstance();
        sc1.setNum(100);
        SingletonClass sc2 = SingletonClass.getInstance();
        System.out.println("singleton Number :"+sc2.getNum());
    }
}

// ��� 1. 
//public class SingletonClass {
//    // ���α׷� ����� SingletonClass��ü�� �̸� ����
//    // ���� : ����ϱ� ���� �̸� �����ϹǷ� �޸𸮸� ��� ����
//    private static SingletonClass instance = new SingletonClass();
//    private SingletonClass() {
//    }
//    public static SingletonClass getInstance() {
//        return instance;
//    }
//}
 

//��� 2. 
class SingletonClass {
    // ���α׷� ����� SingletonClass��ü�� �̸� ����
    // ���� : ����ϴ� ������ ��ü�� �����ϹǷ� �޸� ������ ����
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

