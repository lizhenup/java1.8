package frank.mapper;

import frank.base.BaseMapper;
import frank.model.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AwardMapper extends BaseMapper<Award> {

    List<Award> query(Award award);
}