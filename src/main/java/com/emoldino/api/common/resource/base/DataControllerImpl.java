package com.emoldino.api.common.resource.base;

import org.springframework.web.bind.annotation.RestController;

import com.emoldino.api.common.resource.base.dto.DataIn;
import com.emoldino.api.common.resource.base.service.DataService;
import com.emoldino.framework.dto.SuccessOut;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DataControllerImpl implements DataController {

	private final DataService service;
	
	@Override
	public SuccessOut test() {
		return null;
	}

	@Override
	public SuccessOut send(DataIn input) {
		service.send(input);
		return SuccessOut.getDefault();
	}

}
