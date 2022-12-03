package com.fastcampus.programming.dmaker.exception;

import lombok.Getter;

@Getter
public class DMakerException extends RuntimeException {
  private DMakerErrorCode dMakerErrorCode;
  private String detailMessage;

  public DMakerException(DMakerErrorCode errorCode) {
    super(errorCode.getMeesage());
    this.dMakerErrorCode = errorCode;
    this.detailMessage = errorCode.getMeesage();
  }

  public DMakerException(DMakerErrorCode errorCode, String detailMessage) {
    super(detailMessage);
    this.dMakerErrorCode = errorCode;
    this.detailMessage = detailMessage;
  }
}
