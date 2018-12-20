package springboot.mapper;

import org.apache.ibatis.annotations.Select;

public interface DemoMapper {
    @Select(value = "")
    int select();
}