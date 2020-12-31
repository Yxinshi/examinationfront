package com.bgs.examinationfront.mapper;

import com.bgs.examinationfront.pojo.ExaminationPaper;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ExaminationPaperMapper {

    List<ExaminationPaper> selectuserAllEp(@Param("id") Integer id);

}
