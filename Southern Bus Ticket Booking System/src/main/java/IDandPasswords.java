import java.util.*;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Bro","pizza");
		logininfo.put("southern","southern");
		logininfo.put("BroCode","abc123");
                logininfo.put("qw","qw");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}