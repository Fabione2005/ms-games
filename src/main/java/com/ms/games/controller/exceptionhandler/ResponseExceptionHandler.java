package com.ms.games.controller.exceptionhandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {

	private List<String> errorList;

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException e) {
		List<String> errorList = new ArrayList<>();

			e.getConstraintViolations().stream().forEach(item -> {
				errorList.add(item.getMessage());
			});
			System.out.println(errorList);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorList);
	}

}