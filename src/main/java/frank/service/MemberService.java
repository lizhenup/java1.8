package frank.service;

import frank.exception.ClientException;
import frank.mapper.MemberMapper;
import frank.model.Member;
import frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<Member> query(Member member) {
        return memberMapper.selectByCondition(member);
    }

    @Transactional
    public void add(Member member) {
        Member query = new Member();
        query.setName(member.getName());
        Member exist = memberMapper.selectOne(query);
        if(exist != null)
            throw new ClientException("USR003", "用户已存在");
        memberMapper.insertSelective(member);
    }
    @Transactional
    public void update(Member member) {
        memberMapper.updateByPrimaryKeySelective(member);
    }
    @Transactional
    public void delete(Integer id) {
        memberMapper.deleteByPrimaryKey(id);
    }
}
