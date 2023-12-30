class A{
    //declare here finalize () for destroying object
    public void finalize()
    {
       System.out.println("finalize method");
    }
    public static void main(String[] args) {
        //Create- unrefrenced object
        //1. Nullyfying a refrence Variable
        A a1= new A();
        a1=null;
        System.out.println(a1);
        System.out.println("Nullyfying a refrance variable"); 
        //2.Assign one referance value to another 
        A a2= new A();
        A a3= new A();
        System.out.println(a2);
        System.out.println(a3);
        a2=a3;// here a2 is eligible for garbage collector
        System.out.println(a2+" "+a3);

        //an object inside the method 
        A a4= new A();
        a4=new A();
        System.out.println(a4);

        System.gc();
    }

}