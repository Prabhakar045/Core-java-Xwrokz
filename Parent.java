class Parent{
	public Parent(){
		System.out.println("Parent Object is Created");
	}
	public Parent(int i){
		// super();
		this();
		System.out.println("Parent constructor with 1 parameter");
	}
    public void business(){
        System.out.println("Stationary");
    }
}