package com.bgs.examinationfront.service.serviceImp;

import com.bgs.examinationfront.mapper.ExaminationPaperMapper;
import com.bgs.examinationfront.pojo.ExaminationPaper;
import com.bgs.examinationfront.service.ExaminationPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminationPaperServiceImpl implements ExaminationPaperService {

    @Autowired
    private ExaminationPaperMapper examinationPaperMapper;

    @Override
    public List<ExaminationPaper> selectuserAllEp(Integer id) {



        return examinationPaperMapper.selectuserAllEp(id);
    }
}
