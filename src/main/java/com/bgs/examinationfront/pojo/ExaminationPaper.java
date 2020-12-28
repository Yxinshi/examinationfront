package com.bgs.examinationfront.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class ExaminationPaper {

  private long testPaperId;
  private String testPaperName;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd ")
  private java.util.Date testPaperDate;
  private String testPaperStartTime;
  private String testPaperEndTime;
  private String testPaperState;
  private String testPaperTime;
  private String itemBankClassify;
  private String wayToDraw;
  private String testPaperPassMark;
  private String testPaperFullMark;
  private String testPaperNumberOfParticipants;
  private String testPaperByTheNumberOf;
  private String testPaperPassingRate;
  private String testPaperAverageScore;

  private String KaoShiDate;


}
