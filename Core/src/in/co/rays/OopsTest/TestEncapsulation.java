package in.co.rays.OopsTest;

public class TestEncapsulation {
	public static void main(String[] args) {
		EncapsulationTest et=new EncapsulationTest();
		et.setId(101);
		et.setName("ram");
		EncapsulationTest et1=new EncapsulationTest();
		et1.setId(102);
		et1.setName("lavish");
		System.out.println(et.getId());
		System.out.println(et.getName());
		System.out.println(et1.getId());
		System.out.println(et1.getName());
	}

}
