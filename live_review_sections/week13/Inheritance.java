package week13;

interface A{
	void a();
}


interface B {
	void b();
}


interface C extends A, B{
	void c();
}



public class Inheritance implements C{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
	

}
