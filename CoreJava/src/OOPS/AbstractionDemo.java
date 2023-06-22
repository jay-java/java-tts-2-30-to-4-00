package OOPS;
abstract class RBI{
    abstract public void interest();
    abstract public void HL();
    static int i=1;
    public static void repoRate() {
    	System.out.println("+-4% i = "+i);
    }
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("sbi interest 5 %");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi HL 7%");
	}
	
}
class PNB extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("pnb interest : 8%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("pnb HL : 9%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		s.repoRate();
		SBI.repoRate();
		PNB p = new PNB();
		p.interest();
		p.HL();
		PNB.repoRate();
	}
}
