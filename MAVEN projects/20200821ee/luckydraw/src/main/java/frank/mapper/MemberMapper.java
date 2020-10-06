package frank.mapper;

import frank.base.BaseMapper;
import frank.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {
}