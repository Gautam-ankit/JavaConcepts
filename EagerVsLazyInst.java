public class singleton{
// if object is created in following line it's eager instantiation.
    static singleton sing_obj = null;
    private singleton() {
        
    }

    private static singleton getInstance(){
        if(sing_obj == null){
            sing_obj = new singleton(); 
        }
        return sing_obj;
    }

    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        system.out.println(obj);

        singleton obj1 = singleton.getInstance();
        system.out.println(obj1);
    }

}