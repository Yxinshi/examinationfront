package com.bgs.examinationfront.service;


import com.bgs.examinationfront.pojo.ExaminationPaper;
import io.swagger.models.auth.In;

import java.util.List;

public interface ExaminationPaperService {
    List<ExaminationPaper> selectuserAllEp(Integer id);
}
