import java.util.*;
class LimitSwitchService {
	private ArrayList<LimitSwitch> switchList = new ArrayList<LimitSwitch>();
	public LimitSwitch addSwitch(int port){
		LimitSwitch ls = new LimitSwitch(port);
		switchList.add((port - 1), ls);
		return switchList.get(port - 1);
	}
	public LimitSwitch getSwitch(int port){
		return canContain(port)? switchList.get(port - 1) : null;
	}
	public boolean setInvert(int port){
		if(canContain(port) && switchList.get(port - 1) != null){
			LimitSwitch lsi = getSwitch(port);
			lsi.invertNormal();
			switchList.set((port - 1), lsi);
			return true;
		}else{
			return false;
		}
	}
	public boolean setInvert(int port, boolean invert){
		if(canContain(port) && switchList.get(port - 1) != null){
			LimitSwitch lsi = getSwitch(port);
			lsi.setInvert(invert);
			switchList.set((port - 1), lsi);
			return true;
		}else{
			return false;
		}
	}
	private boolean canContain(int port){
		if(switchList.size() == port){
			return true;
		}else{
			return false;
		}
	}
}