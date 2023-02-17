package green.view;

import green.model.MemberDao;

public class TestConsole {

	public static void main(String[] args) {
		
		MemberDao   mDao   =  new MemberDao(); 
		// 회원추가
		int aftcnt  = mDao.insertMember("admin3", "1234", "관리자", "회사원", "남", "관리자에용");
		if(aftcnt == 0)
			System.out.println("admin" + "이 추가되지 않았습니다");
		else
			System.out.println("admin" + "이 추가되었습니다");
			
		mDao.close();
	}

}
