package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import domain.MemberVO;

public class MemberServiceImpl implements MemberService {
	private static final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	private MemberDAO mdao;
	
	
	public MemberServiceImpl() {
		
		mdao = new MemberDAOImpl();
	}

	@Override
	public int register(MemberVO mvo) {
		log.info("가입 들어왔냐 ?");
		return mdao.insert(mvo);
	}

}
