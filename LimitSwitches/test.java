public class test{
	public static void main(String[] args){
		LimitSwitchService lss = new LimitSwitchService();
		lss.addSwitch(1);
		NICompactRIOToolkit ntk = new NICompactRIOToolkit();
		System.out.println("Switch 1: " + (lss.getSwitch(1).getSwitchState()? "Pass" : "Fail"));
		System.out.println("Switch 1 Invert: " + (lss.setInvert(1, true)? "Pass" : "Fail"));
		System.out.println("Switch 1 Inverted: " + (lss.getSwitch(1).getSwitchState()? "Fail" : "Pass"));
		System.out.println("Set Nonexistant Invert: " + (lss.setInvert(5, true)? "Fail" : "Pass"));
		System.out.println("Is PC?: " + ntk.isPC());
	}
}