class NICompactRIOToolkit{
	public boolean iscRIO(){
		if(!System.getProperty("os.arch").contains("amd64") && !System.getProperty("os.arch").contains("x86") && !System.getProperty("os.arch").contains("i386")){
			return true;
		}else{
			return false;
		}
	}
	public boolean isPC(){
		return !iscRIO();
	}
}