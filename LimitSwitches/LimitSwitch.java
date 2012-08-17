///import edu.wpi.first.wpilibj.*;
class LimitSwitch{
	private NICompactRIOToolkit ntk = new NICompactRIOToolkit();
	private boolean isInverted = false;
	private int portChannel = 0;
	private DigitalInput di;
	public LimitSwitch(int port){
		portChannel = port;
		if(ntk.iscRIO()){
			di = new DigitalInput(portChannel);
		}
	}
	public boolean getSwitchState(){
		return getSwitchState(isInverted);
	}
	public boolean getSwitchState(boolean invert){
		if(ntk.isPC()){
			boolean retval = true;
		}else{
			boolean retval = di.get();
		}
		return invert? !retval : retval;
	}
	public int getPort(){
		return portChannel;
	}
	public void invertNormal(){
		isInverted = !isInverted;
	}
	public void setInvert(boolean invert){
		isInverted = invert;
	}
}