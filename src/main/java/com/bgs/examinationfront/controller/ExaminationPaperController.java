package com.bgs.examinationfront.controller;

import com.bgs.examinationfront.pojo.ExaminationPaper;
import com.bgs.examinationfront.service.ExaminationPaperService;
import com.bgs.examinationfront.utils.BaseResponse;
import com.bgs.examinationfront.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("EPCon")
public class ExaminationPaperController {

    @Autowired
    private ExaminationPaperService examinationPaperService;


    //根据员工id去查询考试的科目
    @RequestMapping("/selectuserAllEp")
    public BaseResponse selectuserAllEp(){

        List<ExaminationPaper> list = examinationPaperService.selectuserAllEp(2);



        return new BaseResponse(StatusCode.Success,list);
    }


}
